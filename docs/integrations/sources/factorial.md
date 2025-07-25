# Factorial
This directory contains the manifest-only connector for [`source-factorial`](https://app.factorialhr.com/).

## Documentation reference:
Visit `https://apidoc.factorialhr.com/reference` for API documentation

## Authentication setup
`Factorial` uses API token authentication, Visit `https://app.factorialhr.com/settings/api-keys` for getting your api token. Refer `https://apidoc.factorialhr.com/docs/api-keys`.

## Configuration

| Input | Type | Description | Default Value |
|-------|------|-------------|---------------|
| `api_key` | `string` | API Key.  |  |
| `start_date` | `string` | Start date.  |  |
| `limit` | `string` | Limit. Max records per page limit | 50 |

## Streams
| Stream Name | Primary Key | Pagination | Supports Full Sync | Supports Incremental |
|-------------|-------------|------------|---------------------|----------------------|
| public_credentials | id | DefaultPaginator | ✅ |  ❌  |
| webhook_subscriptions | id | DefaultPaginator | ✅ |  ❌  |
| tasks | id | DefaultPaginator | ✅ |  ✅  |
| schedules | id | DefaultPaginator | ✅ |  ✅  |
| overlap_periods | id | DefaultPaginator | ✅ |  ❌  |
| teams | id | DefaultPaginator | ✅ |  ❌  |
| memberships | id | DefaultPaginator | ✅ |  ❌  |
| allowances | id | DefaultPaginator | ✅ |  ❌  |
| blocked_periods | id | DefaultPaginator | ✅ |  ❌  |
| leaves | id | DefaultPaginator | ✅ |  ✅  |
| leave_types | id | DefaultPaginator | ✅ |  ❌  |
| policies | id | DefaultPaginator | ✅ |  ❌  |
| break_configurations | id | DefaultPaginator | ✅ |  ❌  |
| categories | id | DefaultPaginator | ✅ |  ❌  |
| legal_entities | id | DefaultPaginator | ✅ |  ❌  |
| contract_versions | id | DefaultPaginator | ✅ |  ❌  |
| reference_contracts | id | DefaultPaginator | ✅ |  ❌  |
| taxonomies | id | DefaultPaginator | ✅ |  ❌  |
| fields | id | DefaultPaginator | ✅ |  ❌  |
| fields_options | id | DefaultPaginator | ✅ |  ❌  |
| fields_resource_fields | id | DefaultPaginator | ✅ |  ❌  |
| employees | id | DefaultPaginator | ✅ |  ✅  |
| cost_centers | id | DefaultPaginator | ✅ |  ❌  |
| company_holidays | id | DefaultPaginator | ✅ |  ❌  |
| locations | id | DefaultPaginator | ✅ |  ❌  |
| work_areas | id | DefaultPaginator | ✅ |  ❌  |
| shifts | id | DefaultPaginator | ✅ |  ✅  |

## Changelog

<details>
  <summary>Expand to review</summary>

| Version | Date | Pull Request | Subject |
| ------------------ | ------------ | --- | ---------------- |
| 0.0.31 | 2025-07-26 | [64042](https://github.com/airbytehq/airbyte/pull/64042) | Update dependencies |
| 0.0.30 | 2025-07-19 | [63574](https://github.com/airbytehq/airbyte/pull/63574) | Update dependencies |
| 0.0.29 | 2025-07-12 | [63008](https://github.com/airbytehq/airbyte/pull/63008) | Update dependencies |
| 0.0.28 | 2025-07-05 | [62807](https://github.com/airbytehq/airbyte/pull/62807) | Update dependencies |
| 0.0.27 | 2025-06-28 | [62417](https://github.com/airbytehq/airbyte/pull/62417) | Update dependencies |
| 0.0.26 | 2025-06-21 | [61961](https://github.com/airbytehq/airbyte/pull/61961) | Update dependencies |
| 0.0.25 | 2025-06-14 | [61213](https://github.com/airbytehq/airbyte/pull/61213) | Update dependencies |
| 0.0.24 | 2025-05-24 | [60359](https://github.com/airbytehq/airbyte/pull/60359) | Update dependencies |
| 0.0.23 | 2025-05-10 | [59983](https://github.com/airbytehq/airbyte/pull/59983) | Update dependencies |
| 0.0.22 | 2025-05-03 | [59441](https://github.com/airbytehq/airbyte/pull/59441) | Update dependencies |
| 0.0.21 | 2025-04-26 | [58894](https://github.com/airbytehq/airbyte/pull/58894) | Update dependencies |
| 0.0.20 | 2025-04-19 | [58310](https://github.com/airbytehq/airbyte/pull/58310) | Update dependencies |
| 0.0.19 | 2025-04-12 | [57812](https://github.com/airbytehq/airbyte/pull/57812) | Update dependencies |
| 0.0.18 | 2025-04-05 | [57250](https://github.com/airbytehq/airbyte/pull/57250) | Update dependencies |
| 0.0.17 | 2025-03-29 | [56470](https://github.com/airbytehq/airbyte/pull/56470) | Update dependencies |
| 0.0.16 | 2025-03-22 | [55950](https://github.com/airbytehq/airbyte/pull/55950) | Update dependencies |
| 0.0.15 | 2025-03-08 | [55277](https://github.com/airbytehq/airbyte/pull/55277) | Update dependencies |
| 0.0.14 | 2025-03-01 | [54919](https://github.com/airbytehq/airbyte/pull/54919) | Update dependencies |
| 0.0.13 | 2025-02-22 | [54451](https://github.com/airbytehq/airbyte/pull/54451) | Update dependencies |
| 0.0.12 | 2025-02-15 | [53744](https://github.com/airbytehq/airbyte/pull/53744) | Update dependencies |
| 0.0.11 | 2025-02-08 | [53354](https://github.com/airbytehq/airbyte/pull/53354) | Update dependencies |
| 0.0.10 | 2025-02-01 | [52808](https://github.com/airbytehq/airbyte/pull/52808) | Update dependencies |
| 0.0.9 | 2025-01-25 | [52351](https://github.com/airbytehq/airbyte/pull/52351) | Update dependencies |
| 0.0.8 | 2025-01-18 | [51682](https://github.com/airbytehq/airbyte/pull/51682) | Update dependencies |
| 0.0.7 | 2025-01-11 | [51136](https://github.com/airbytehq/airbyte/pull/51136) | Update dependencies |
| 0.0.6 | 2024-12-28 | [50583](https://github.com/airbytehq/airbyte/pull/50583) | Update dependencies |
| 0.0.5 | 2024-12-21 | [50020](https://github.com/airbytehq/airbyte/pull/50020) | Update dependencies |
| 0.0.4 | 2024-12-14 | [49514](https://github.com/airbytehq/airbyte/pull/49514) | Update dependencies |
| 0.0.3 | 2024-12-12 | [49176](https://github.com/airbytehq/airbyte/pull/49176) | Update dependencies |
| 0.0.2 | 2024-10-28 | [47512](https://github.com/airbytehq/airbyte/pull/47512) | Update dependencies |
| 0.0.1 | 2024-09-24 | [45882](https://github.com/airbytehq/airbyte/pull/45882) | Initial release by [@btkcodedev](https://github.com/btkcodedev) via Connector Builder |

</details>
