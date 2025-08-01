# GreytHr
The GreytHR Connector for Airbyte allows seamless integration with the GreytHR platform, enabling users to automate the extraction and synchronization of employee management and payroll data into their preferred destinations for reporting, analytics, or further processing.

## Configuration

| Input | Type | Description | Default Value |
|-------|------|-------------|---------------|
| `domain` | `string` | Host URL. Your GreytHR Host URL |  |
| `base_url` | `string` | Base URL. https://api.greythr.com |  |
| `password` | `string` | Password.  |  |
| `username` | `string` | Username.  |  |

## Streams
| Stream Name | Primary Key | Pagination | Supports Full Sync | Supports Incremental |
|-------------|-------------|------------|---------------------|----------------------|
| Employees | employeeId | DefaultPaginator | ✅ |  ❌  |
| Employees Categories | employeeId | DefaultPaginator | ✅ |  ❌  |
| Employees Profile | employeeId | DefaultPaginator | ✅ |  ❌  |
| Employees Personal Details | employeeId | DefaultPaginator | ✅ |  ❌  |
| Employees Work Details | employeeId | DefaultPaginator | ✅ |  ❌  |
| Employee Separation Details | employeeId | DefaultPaginator | ✅ |  ❌  |
| Employee Statutory Details | employeeId | DefaultPaginator | ✅ |  ❌  |
| Employee Bank Details | employeeId | DefaultPaginator | ✅ |  ❌  |
| Employee PF &amp; ESI details | employeeId | DefaultPaginator | ✅ |  ❌  |
| Employee Qualifications Details |  | DefaultPaginator | ✅ |  ❌  |
| Users List |  | DefaultPaginator | ✅ |  ❌  |

## Changelog

<details>
  <summary>Expand to review</summary>

| Version          | Date              | Pull Request | Subject        |
|------------------|-------------------|--------------|----------------|
| 0.0.31 | 2025-08-02 | [64234](https://github.com/airbytehq/airbyte/pull/64234) | Update dependencies |
| 0.0.30 | 2025-07-26 | [63876](https://github.com/airbytehq/airbyte/pull/63876) | Update dependencies |
| 0.0.29 | 2025-07-19 | [63524](https://github.com/airbytehq/airbyte/pull/63524) | Update dependencies |
| 0.0.28 | 2025-07-12 | [63156](https://github.com/airbytehq/airbyte/pull/63156) | Update dependencies |
| 0.0.27 | 2025-07-05 | [62617](https://github.com/airbytehq/airbyte/pull/62617) | Update dependencies |
| 0.0.26 | 2025-06-28 | [62192](https://github.com/airbytehq/airbyte/pull/62192) | Update dependencies |
| 0.0.25 | 2025-06-21 | [61855](https://github.com/airbytehq/airbyte/pull/61855) | Update dependencies |
| 0.0.24 | 2025-06-14 | [61153](https://github.com/airbytehq/airbyte/pull/61153) | Update dependencies |
| 0.0.23 | 2025-05-24 | [60650](https://github.com/airbytehq/airbyte/pull/60650) | Update dependencies |
| 0.0.22 | 2025-05-10 | [59876](https://github.com/airbytehq/airbyte/pull/59876) | Update dependencies |
| 0.0.21 | 2025-05-03 | [59296](https://github.com/airbytehq/airbyte/pull/59296) | Update dependencies |
| 0.0.20 | 2025-04-26 | [58823](https://github.com/airbytehq/airbyte/pull/58823) | Update dependencies |
| 0.0.19 | 2025-04-19 | [58188](https://github.com/airbytehq/airbyte/pull/58188) | Update dependencies |
| 0.0.18 | 2025-04-12 | [57712](https://github.com/airbytehq/airbyte/pull/57712) | Update dependencies |
| 0.0.17 | 2025-04-05 | [57061](https://github.com/airbytehq/airbyte/pull/57061) | Update dependencies |
| 0.0.16 | 2025-03-29 | [56696](https://github.com/airbytehq/airbyte/pull/56696) | Update dependencies |
| 0.0.15 | 2025-03-22 | [56077](https://github.com/airbytehq/airbyte/pull/56077) | Update dependencies |
| 0.0.14 | 2025-03-08 | [55476](https://github.com/airbytehq/airbyte/pull/55476) | Update dependencies |
| 0.0.13 | 2025-03-01 | [54785](https://github.com/airbytehq/airbyte/pull/54785) | Update dependencies |
| 0.0.12 | 2025-02-22 | [53820](https://github.com/airbytehq/airbyte/pull/53820) | Update dependencies |
| 0.0.11 | 2025-02-08 | [53270](https://github.com/airbytehq/airbyte/pull/53270) | Update dependencies |
| 0.0.10 | 2025-02-03 | [52620](https://github.com/airbytehq/airbyte/pull/52620) | Bug fixes with pagination |
| 0.0.9 | 2025-02-01 | [52782](https://github.com/airbytehq/airbyte/pull/52782) | Update dependencies |
| 0.0.8 | 2025-01-25 | [52256](https://github.com/airbytehq/airbyte/pull/52256) | Update dependencies |
| 0.0.7 | 2025-01-18 | [51794](https://github.com/airbytehq/airbyte/pull/51794) | Update dependencies |
| 0.0.6 | 2025-01-11 | [51176](https://github.com/airbytehq/airbyte/pull/51176) | Update dependencies |
| 0.0.5 | 2024-12-28 | [50603](https://github.com/airbytehq/airbyte/pull/50603) | Update dependencies |
| 0.0.4 | 2024-12-21 | [50126](https://github.com/airbytehq/airbyte/pull/50126) | Update dependencies |
| 0.0.3 | 2024-12-14 | [49621](https://github.com/airbytehq/airbyte/pull/49621) | Update dependencies |
| 0.0.2 | 2024-12-12 | [48920](https://github.com/airbytehq/airbyte/pull/48920) | Update dependencies |
| 0.0.1 | 2024-11-29 | | Initial release by [@bhushan-dhwaniris](https://github.com/bhushan-dhwaniris) via Connector Builder |

</details>
