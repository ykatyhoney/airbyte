# Buzzsprout
This page contains the setup guide and reference information for the [Buzzsprout](https://www.buzzsprout.com/) source connector.

## Documentation reference:
Visit `https://github.com/buzzsprout/buzzsprout-api/tree/master/sections` for API documentation

## Authentication setup
`Source-buzzsprout` uses API keys and podcast id for its authentication,
Visit `https://www.buzzsprout.com/my/profile/api` for getting api key and podcast id
Visit `https://github.com/buzzsprout/buzzsprout-api/tree/master?tab=readme-ov-file#authentication` for knowing more about authentication.

## Configuration

| Input | Type | Description | Default Value |
|-------|------|-------------|---------------|
| `api_key` | `string` | API Key.  |  |
| `podcast_id` | `string` | Podcast ID. Podcast ID found in `my/profile/api` |  |
| `start_date` | `string` | Start date.  |  |

## Streams
| Stream Name | Primary Key | Pagination | Supports Full Sync | Supports Incremental |
|-------------|-------------|------------|---------------------|----------------------|
| episodes | id | No pagination | ✅ |  ✅  |
| podcasts | id | No pagination | ✅ |  ❌  |

## Changelog

<details>
  <summary>Expand to review</summary>

| Version | Date | Pull Request | Subject |
| ------------------ | ------------ | --- | ---------------- |
| 0.0.30 | 2025-07-26 | [63789](https://github.com/airbytehq/airbyte/pull/63789) | Update dependencies |
| 0.0.29 | 2025-07-12 | [63082](https://github.com/airbytehq/airbyte/pull/63082) | Update dependencies |
| 0.0.28 | 2025-07-05 | [62541](https://github.com/airbytehq/airbyte/pull/62541) | Update dependencies |
| 0.0.27 | 2025-06-15 | [61451](https://github.com/airbytehq/airbyte/pull/61451) | Update dependencies |
| 0.0.26 | 2025-05-24 | [60628](https://github.com/airbytehq/airbyte/pull/60628) | Update dependencies |
| 0.0.25 | 2025-05-10 | [59900](https://github.com/airbytehq/airbyte/pull/59900) | Update dependencies |
| 0.0.24 | 2025-05-03 | [58689](https://github.com/airbytehq/airbyte/pull/58689) | Update dependencies |
| 0.0.23 | 2025-04-19 | [58270](https://github.com/airbytehq/airbyte/pull/58270) | Update dependencies |
| 0.0.22 | 2025-04-12 | [57647](https://github.com/airbytehq/airbyte/pull/57647) | Update dependencies |
| 0.0.21 | 2025-04-05 | [57189](https://github.com/airbytehq/airbyte/pull/57189) | Update dependencies |
| 0.0.20 | 2025-03-29 | [56628](https://github.com/airbytehq/airbyte/pull/56628) | Update dependencies |
| 0.0.19 | 2025-03-22 | [56116](https://github.com/airbytehq/airbyte/pull/56116) | Update dependencies |
| 0.0.18 | 2025-03-08 | [55395](https://github.com/airbytehq/airbyte/pull/55395) | Update dependencies |
| 0.0.17 | 2025-03-01 | [54893](https://github.com/airbytehq/airbyte/pull/54893) | Update dependencies |
| 0.0.16 | 2025-02-22 | [54283](https://github.com/airbytehq/airbyte/pull/54283) | Update dependencies |
| 0.0.15 | 2025-02-15 | [53935](https://github.com/airbytehq/airbyte/pull/53935) | Update dependencies |
| 0.0.14 | 2025-02-08 | [53390](https://github.com/airbytehq/airbyte/pull/53390) | Update dependencies |
| 0.0.13 | 2025-02-01 | [52931](https://github.com/airbytehq/airbyte/pull/52931) | Update dependencies |
| 0.0.12 | 2025-01-25 | [52212](https://github.com/airbytehq/airbyte/pull/52212) | Update dependencies |
| 0.0.11 | 2025-01-18 | [51766](https://github.com/airbytehq/airbyte/pull/51766) | Update dependencies |
| 0.0.10 | 2025-01-11 | [51284](https://github.com/airbytehq/airbyte/pull/51284) | Update dependencies |
| 0.0.9 | 2024-12-28 | [50479](https://github.com/airbytehq/airbyte/pull/50479) | Update dependencies |
| 0.0.8 | 2024-12-21 | [50153](https://github.com/airbytehq/airbyte/pull/50153) | Update dependencies |
| 0.0.7 | 2024-12-14 | [49564](https://github.com/airbytehq/airbyte/pull/49564) | Update dependencies |
| 0.0.6 | 2024-12-12 | [49278](https://github.com/airbytehq/airbyte/pull/49278) | Update dependencies |
| 0.0.5 | 2024-12-11 | [49029](https://github.com/airbytehq/airbyte/pull/49029) | Starting with this version, the Docker image is now rootless. Please note that this and future versions will not be compatible with Airbyte versions earlier than 0.64 |
| 0.0.4 | 2024-11-04 | [48228](https://github.com/airbytehq/airbyte/pull/48228) | Update dependencies |
| 0.0.3 | 2024-10-29 | [47747](https://github.com/airbytehq/airbyte/pull/47747) | Update dependencies |
| 0.0.2 | 2024-10-28 | [47645](https://github.com/airbytehq/airbyte/pull/47645) | Update dependencies |
| 0.0.1 | 2024-09-16 | [45608](https://github.com/airbytehq/airbyte/pull/45608) | Initial release by [@btkcodedev](https://github.com/btkcodedev) via Connector Builder |

</details>
