/*
 * Copyright (c) 2024 Airbyte, Inc., all rights reserved.
 */

package io.airbyte.integrations.destination.hubspot

import io.airbyte.cdk.AirbyteDestinationRunner
import io.airbyte.cdk.load.command.aws.AwsToolkitConstants

object HubSpotDestination {
    val additionalMicronautEnvs = listOf(AwsToolkitConstants.MICRONAUT_ENVIRONMENT)

    @JvmStatic
    fun main(args: Array<String>) {
        AirbyteDestinationRunner.run(*args, additionalMicronautEnvs = additionalMicronautEnvs)
    }
}
