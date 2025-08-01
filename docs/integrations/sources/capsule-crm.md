# Capsule CRM
Capsule CRM connector  enables seamless data syncing from Capsule CRM to various data warehouses, helping businesses centralize and analyze customer data efficiently. It supports real-time data extraction of contacts, opportunities, and custom fields, making it ideal for comprehensive CRM analytics and reporting.

## Configuration

| Input | Type | Description | Default Value |
|-------|------|-------------|---------------|
| `bearer_token` | `string` | Bearer Token. Bearer token to authenticate API requests. Generate it from the &#39;My Preferences&#39; &gt; &#39;API Authentication Tokens&#39; page in your Capsule account. |  |
| `start_date` | `string` | Start date.  |  |
| `entity` | `string` | Entity.  |  |

## Streams
| Stream Name | Primary Key | Pagination | Supports Full Sync | Supports Incremental |
|-------------|-------------|------------|---------------------|----------------------|
| users | id | DefaultPaginator | ✅ |  ❌  |
| parties | id | DefaultPaginator | ✅ |  ❌  |
| tasks | id | DefaultPaginator | ✅ |  ❌  |
| employees | id | DefaultPaginator | ✅ |  ❌  |
| projects | id | DefaultPaginator | ✅ |  ❌  |
| opportunities | id | DefaultPaginator | ✅ |  ✅  |
| pipelines | id | DefaultPaginator | ✅ |  ❌  |
| milestones | id | DefaultPaginator | ✅ |  ❌  |
| site |  | DefaultPaginator | ✅ |  ❌  |
| tags | id | DefaultPaginator | ✅ |  ❌  |
| custom_fields | id | DefaultPaginator | ✅ |  ❌  |
| lost_reasons | id | DefaultPaginator | ✅ |  ❌  |
| board | id | DefaultPaginator | ✅ |  ❌  |
| categories | id | DefaultPaginator | ✅ |  ❌  |
| activity_types | id | DefaultPaginator | ✅ |  ❌  |
| stages | id | DefaultPaginator | ✅ |  ❌  |

## Changelog

<details>
  <summary>Expand to review</summary>

| Version          | Date              | Pull Request | Subject        |
|------------------|-------------------|--------------|----------------|
| 0.0.25 | 2025-07-12 | [63037](https://github.com/airbytehq/airbyte/pull/63037) | Update dependencies |
| 0.0.24 | 2025-06-21 | [61876](https://github.com/airbytehq/airbyte/pull/61876) | Update dependencies |
| 0.0.23 | 2025-06-15 | [60664](https://github.com/airbytehq/airbyte/pull/60664) | Update dependencies |
| 0.0.22 | 2025-05-10 | [59856](https://github.com/airbytehq/airbyte/pull/59856) | Update dependencies |
| 0.0.21 | 2025-05-03 | [58700](https://github.com/airbytehq/airbyte/pull/58700) | Update dependencies |
| 0.0.20 | 2025-04-19 | [58252](https://github.com/airbytehq/airbyte/pull/58252) | Update dependencies |
| 0.0.19 | 2025-04-12 | [57593](https://github.com/airbytehq/airbyte/pull/57593) | Update dependencies |
| 0.0.18 | 2025-04-05 | [57174](https://github.com/airbytehq/airbyte/pull/57174) | Update dependencies |
| 0.0.17 | 2025-03-29 | [56619](https://github.com/airbytehq/airbyte/pull/56619) | Update dependencies |
| 0.0.16 | 2025-03-22 | [56146](https://github.com/airbytehq/airbyte/pull/56146) | Update dependencies |
| 0.0.15 | 2025-03-08 | [55386](https://github.com/airbytehq/airbyte/pull/55386) | Update dependencies |
| 0.0.14 | 2025-03-01 | [54846](https://github.com/airbytehq/airbyte/pull/54846) | Update dependencies |
| 0.0.13 | 2025-02-22 | [54262](https://github.com/airbytehq/airbyte/pull/54262) | Update dependencies |
| 0.0.12 | 2025-02-15 | [53923](https://github.com/airbytehq/airbyte/pull/53923) | Update dependencies |
| 0.0.11 | 2025-02-08 | [53384](https://github.com/airbytehq/airbyte/pull/53384) | Update dependencies |
| 0.0.10 | 2025-02-01 | [52934](https://github.com/airbytehq/airbyte/pull/52934) | Update dependencies |
| 0.0.9 | 2025-01-25 | [52199](https://github.com/airbytehq/airbyte/pull/52199) | Update dependencies |
| 0.0.8 | 2025-01-18 | [51758](https://github.com/airbytehq/airbyte/pull/51758) | Update dependencies |
| 0.0.7 | 2025-01-11 | [51282](https://github.com/airbytehq/airbyte/pull/51282) | Update dependencies |
| 0.0.6 | 2024-12-28 | [50484](https://github.com/airbytehq/airbyte/pull/50484) | Update dependencies |
| 0.0.5 | 2024-12-21 | [50172](https://github.com/airbytehq/airbyte/pull/50172) | Update dependencies |
| 0.0.4 | 2024-12-14 | [49566](https://github.com/airbytehq/airbyte/pull/49566) | Update dependencies |
| 0.0.3 | 2024-12-12 | [49314](https://github.com/airbytehq/airbyte/pull/49314) | Update dependencies |
| 0.0.2 | 2024-12-11 | [49028](https://github.com/airbytehq/airbyte/pull/49028) | Starting with this version, the Docker image is now rootless. Please note that this and future versions will not be compatible with Airbyte versions earlier than 0.64 |
| 0.0.1 | 2024-11-09 | | Initial release by [@bishalbera](https://github.com/bishalbera) via Connector Builder |

</details>
