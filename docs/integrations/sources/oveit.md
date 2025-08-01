# Oveit
An Airbyte connector for Oveit enables seamless data synchronization by extracting and integrating data from Oveit’s event management platform into your data warehouse. This connector helps automate the flow of information, providing up-to-date insights on event registrations, ticketing, and attendee information.

## Configuration

| Input | Type | Description | Default Value |
|-------|------|-------------|---------------|
| `email` | `string` | Email. Oveit&#39;s login Email |  |
| `password` | `string` | Password. Oveit&#39;s login Password |  |

## Streams
| Stream Name | Primary Key | Pagination | Supports Full Sync | Supports Incremental |
|-------------|-------------|------------|---------------------|----------------------|
| events | id | No pagination | ✅ |  ❌  |
| attendees | id | DefaultPaginator | ✅ |  ❌  |
| tickets | code | No pagination | ✅ |  ❌  |

## Changelog

<details>
  <summary>Expand to review</summary>

| Version          | Date              | Pull Request | Subject        |
|------------------|-------------------|--------------|----------------|
| 0.0.30 | 2025-08-02 | [64241](https://github.com/airbytehq/airbyte/pull/64241) | Update dependencies |
| 0.0.29 | 2025-07-26 | [63824](https://github.com/airbytehq/airbyte/pull/63824) | Update dependencies |
| 0.0.28 | 2025-07-19 | [63414](https://github.com/airbytehq/airbyte/pull/63414) | Update dependencies |
| 0.0.27 | 2025-07-12 | [63259](https://github.com/airbytehq/airbyte/pull/63259) | Update dependencies |
| 0.0.26 | 2025-07-05 | [62650](https://github.com/airbytehq/airbyte/pull/62650) | Update dependencies |
| 0.0.25 | 2025-06-28 | [62398](https://github.com/airbytehq/airbyte/pull/62398) | Update dependencies |
| 0.0.24 | 2025-06-21 | [61919](https://github.com/airbytehq/airbyte/pull/61919) | Update dependencies |
| 0.0.23 | 2025-06-14 | [61064](https://github.com/airbytehq/airbyte/pull/61064) | Update dependencies |
| 0.0.22 | 2025-05-24 | [60158](https://github.com/airbytehq/airbyte/pull/60158) | Update dependencies |
| 0.0.21 | 2025-05-04 | [59513](https://github.com/airbytehq/airbyte/pull/59513) | Update dependencies |
| 0.0.20 | 2025-04-27 | [58511](https://github.com/airbytehq/airbyte/pull/58511) | Update dependencies |
| 0.0.19 | 2025-04-12 | [57906](https://github.com/airbytehq/airbyte/pull/57906) | Update dependencies |
| 0.0.18 | 2025-04-05 | [57313](https://github.com/airbytehq/airbyte/pull/57313) | Update dependencies |
| 0.0.17 | 2025-03-29 | [56769](https://github.com/airbytehq/airbyte/pull/56769) | Update dependencies |
| 0.0.16 | 2025-03-22 | [56216](https://github.com/airbytehq/airbyte/pull/56216) | Update dependencies |
| 0.0.15 | 2025-03-08 | [55519](https://github.com/airbytehq/airbyte/pull/55519) | Update dependencies |
| 0.0.14 | 2025-03-01 | [55046](https://github.com/airbytehq/airbyte/pull/55046) | Update dependencies |
| 0.0.13 | 2025-02-23 | [54602](https://github.com/airbytehq/airbyte/pull/54602) | Update dependencies |
| 0.0.12 | 2025-02-15 | [54001](https://github.com/airbytehq/airbyte/pull/54001) | Update dependencies |
| 0.0.11 | 2025-02-08 | [53474](https://github.com/airbytehq/airbyte/pull/53474) | Update dependencies |
| 0.0.10 | 2025-02-01 | [52991](https://github.com/airbytehq/airbyte/pull/52991) | Update dependencies |
| 0.0.9 | 2025-01-25 | [52499](https://github.com/airbytehq/airbyte/pull/52499) | Update dependencies |
| 0.0.8 | 2025-01-18 | [51861](https://github.com/airbytehq/airbyte/pull/51861) | Update dependencies |
| 0.0.7 | 2025-01-11 | [51309](https://github.com/airbytehq/airbyte/pull/51309) | Update dependencies |
| 0.0.6 | 2024-12-28 | [50715](https://github.com/airbytehq/airbyte/pull/50715) | Update dependencies |
| 0.0.5 | 2024-12-21 | [50275](https://github.com/airbytehq/airbyte/pull/50275) | Update dependencies |
| 0.0.4 | 2024-12-14 | [49695](https://github.com/airbytehq/airbyte/pull/49695) | Update dependencies |
| 0.0.3 | 2024-12-12 | [49328](https://github.com/airbytehq/airbyte/pull/49328) | Update dependencies |
| 0.0.2 | 2024-12-11 | [49057](https://github.com/airbytehq/airbyte/pull/49057) | Starting with this version, the Docker image is now rootless. Please note that this and future versions will not be compatible with Airbyte versions earlier than 0.64 |
| 0.0.1 | 2024-10-24 | | Initial release by [@parthiv11](https://github.com/parthiv11) via Connector Builder |

</details>
