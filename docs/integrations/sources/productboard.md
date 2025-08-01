# Productboard
A manifest only source for Productboard. https://www.productboard.com/

## Configuration

| Input | Type | Description | Default Value |
|-------|------|-------------|---------------|
| `access_token` | `string` | Access Token. Your Productboard access token. See https://developer.productboard.com/reference/authentication for steps to generate one. |  |
| `start_date` | `string` | Start date.  |  |

## Streams
| Stream Name | Primary Key | Pagination | Supports Full Sync | Supports Incremental |
|-------------|-------------|------------|---------------------|----------------------|
| products | id | DefaultPaginator | ✅ |  ❌  |
| features | id | DefaultPaginator | ✅ |  ❌  |
| components | id | DefaultPaginator | ✅ |  ❌  |
| feature-statuses | id | DefaultPaginator | ✅ |  ❌  |
| notes | id | DefaultPaginator | ✅ |  ✅  |
| tags |  | No pagination | ✅ |  ❌  |
| links |  | No pagination | ✅ |  ❌  |
| feedback-form-configurations | id | DefaultPaginator | ✅ |  ❌  |
| companies | id | DefaultPaginator | ✅ |  ❌  |
| company-custom-fields |  | DefaultPaginator | ✅ |  ❌  |
| users | id | DefaultPaginator | ✅ |  ❌  |
| custom-fields |  | DefaultPaginator | ✅ |  ❌  |
| custom-fields-values |  | DefaultPaginator | ✅ |  ❌  |
| release-groups | id | DefaultPaginator | ✅ |  ❌  |
| releases | id | DefaultPaginator | ✅ |  ❌  |
| feature-release-assignments |  | DefaultPaginator | ✅ |  ❌  |
| objectives | id | DefaultPaginator | ✅ |  ❌  |

## Changelog

<details>
  <summary>Expand to review</summary>

| Version | Date       | Pull Request                                             | Subject                                                                                   |
|---------|------------|----------------------------------------------------------|-------------------------------------------------------------------------------------------|
| 0.0.35 | 2025-08-02 | [64221](https://github.com/airbytehq/airbyte/pull/64221) | Update dependencies |
| 0.0.34 | 2025-07-26 | [63918](https://github.com/airbytehq/airbyte/pull/63918) | Update dependencies |
| 0.0.33 | 2025-07-19 | [63400](https://github.com/airbytehq/airbyte/pull/63400) | Update dependencies |
| 0.0.32 | 2025-07-12 | [63236](https://github.com/airbytehq/airbyte/pull/63236) | Update dependencies |
| 0.0.31 | 2025-07-05 | [62658](https://github.com/airbytehq/airbyte/pull/62658) | Update dependencies |
| 0.0.30 | 2025-06-28 | [62374](https://github.com/airbytehq/airbyte/pull/62374) | Update dependencies |
| 0.0.29 | 2025-06-21 | [61037](https://github.com/airbytehq/airbyte/pull/61037) | Update dependencies |
| 0.0.28 | 2025-05-24 | [60509](https://github.com/airbytehq/airbyte/pull/60509) | Update dependencies |
| 0.0.27 | 2025-05-10 | [60147](https://github.com/airbytehq/airbyte/pull/60147) | Update dependencies |
| 0.0.26 | 2025-05-03 | [59472](https://github.com/airbytehq/airbyte/pull/59472) | Update dependencies |
| 0.0.25 | 2025-04-27 | [59060](https://github.com/airbytehq/airbyte/pull/59060) | Update dependencies |
| 0.0.24 | 2025-04-19 | [58514](https://github.com/airbytehq/airbyte/pull/58514) | Update dependencies |
| 0.0.23 | 2025-04-12 | [57919](https://github.com/airbytehq/airbyte/pull/57919) | Update dependencies |
| 0.0.22 | 2025-04-05 | [57329](https://github.com/airbytehq/airbyte/pull/57329) | Update dependencies |
| 0.0.21 | 2025-03-29 | [56732](https://github.com/airbytehq/airbyte/pull/56732) | Update dependencies |
| 0.0.20 | 2025-03-22 | [56183](https://github.com/airbytehq/airbyte/pull/56183) | Update dependencies |
| 0.0.19 | 2025-03-08 | [55540](https://github.com/airbytehq/airbyte/pull/55540) | Update dependencies |
| 0.0.18 | 2025-03-01 | [54999](https://github.com/airbytehq/airbyte/pull/54999) | Update dependencies |
| 0.0.17 | 2025-02-23 | [54577](https://github.com/airbytehq/airbyte/pull/54577) | Update dependencies |
| 0.0.16 | 2025-02-15 | [53946](https://github.com/airbytehq/airbyte/pull/53946) | Update dependencies |
| 0.0.15 | 2025-02-08 | [53485](https://github.com/airbytehq/airbyte/pull/53485) | Update dependencies |
| 0.0.14 | 2025-02-01 | [53008](https://github.com/airbytehq/airbyte/pull/53008) | Update dependencies |
| 0.0.13 | 2025-01-25 | [52504](https://github.com/airbytehq/airbyte/pull/52504) | Update dependencies |
| 0.0.12 | 2025-01-18 | [51902](https://github.com/airbytehq/airbyte/pull/51902) | Update dependencies |
| 0.0.11 | 2025-01-11 | [51300](https://github.com/airbytehq/airbyte/pull/51300) | Update dependencies |
| 0.0.10 | 2024-12-28 | [50705](https://github.com/airbytehq/airbyte/pull/50705) | Update dependencies |
| 0.0.9 | 2024-12-21 | [50290](https://github.com/airbytehq/airbyte/pull/50290) | Update dependencies |
| 0.0.8 | 2024-12-14 | [49686](https://github.com/airbytehq/airbyte/pull/49686) | Update dependencies |
| 0.0.7 | 2024-12-12 | [49331](https://github.com/airbytehq/airbyte/pull/49331) | Update dependencies |
| 0.0.6 | 2024-12-11 | [49087](https://github.com/airbytehq/airbyte/pull/49087) | Starting with this version, the Docker image is now rootless. Please note that this and future versions will not be compatible with Airbyte versions earlier than 0.64 |
| 0.0.5 | 2024-11-05 | [48365](https://github.com/airbytehq/airbyte/pull/48365) | Revert to source-declarative-manifest v5.17.0 |
| 0.0.4 | 2024-11-05 | [48324](https://github.com/airbytehq/airbyte/pull/48324) | Update dependencies |
| 0.0.3 | 2024-10-29 | [47774](https://github.com/airbytehq/airbyte/pull/47774) | Update dependencies |
| 0.0.2 | 2024-10-28 | [47677](https://github.com/airbytehq/airbyte/pull/47677) | Update dependencies |
| 0.0.1 | 2024-09-13 | [45449](https://github.com/airbytehq/airbyte/pull/45449) | Initial release by [@pabloescoder](https://github.com/pabloescoder) via Connector Builder |

</details>
