/*
 * Copyright (c) 2024 Airbyte, Inc., all rights reserved.
 */

package io.airbyte.cdk.load.task.internal

import io.airbyte.cdk.load.command.DestinationConfiguration
import io.airbyte.cdk.load.message.DestinationMessage
import io.airbyte.cdk.load.message.ProtocolMessageDeserializer
import io.airbyte.cdk.load.state.ReservationManager
import io.airbyte.cdk.load.state.Reserved
import io.github.oshai.kotlinlogging.KotlinLogging
import jakarta.inject.Named
import jakarta.inject.Singleton
import java.io.InputStream
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

@Singleton
class ReservingDeserializingInputFlow(
    val config: DestinationConfiguration,
    val deserializer: ProtocolMessageDeserializer,
    @Named("queueMemoryManager") val memoryManager: ReservationManager,
    @Named("inputStream") val inputStream: InputStream,
    @Named("logPerNRecords") val logPerNRecords: Long = 100_000L,
) : Flow<Pair<Long, Reserved<DestinationMessage>>> {
    val log = KotlinLogging.logger {}

    override suspend fun collect(
        collector: FlowCollector<Pair<Long, Reserved<DestinationMessage>>>
    ) {
        log.info {
            "Reserved ${memoryManager.totalCapacityBytes/1024/1024}mb memory for input processing"
        }

        var index = 0L
        var bytes = 0L
        inputStream.bufferedReader().lineSequence().forEach { line ->
            if (line.isEmpty()) {
                return@forEach
            }

            val lineSize = line.length.toLong()
            val estimatedSize = lineSize * config.estimatedRecordMemoryOverheadRatio
            val reserved = memoryManager.reserve(estimatedSize.toLong(), line)
            val message = deserializer.deserialize(line)
            collector.emit(Pair(lineSize, reserved.replace(message)))

            bytes += lineSize
            if (++index % logPerNRecords == 0L) {
                log.info { "Processed $index lines (${bytes/1024/1024}Mb)" }
            }
        }

        log.info { "Finished processing input" }
    }
}
