# Pennylane

## Configuration

| Input | Type | Description | Default Value |
|-------|------|-------------|---------------|
| `start_time` | `string` | Start time, used for incremental syncs. No records created before that date will be synced.  |  |
| `api_key` | `string` | Pennylane API key.  |  |

## Streams
| Stream Name | Primary Key | Pagination | Supports Full Sync | Supports Incremental |
|-------------|-------------|------------|---------------------|----------------------|
| `supplier_invoices` | `id` | DefaultPaginator | ✅ |  ✅  |
| `suppliers` | `source_id` | DefaultPaginator | ✅ |  ✅  |
| `plan_items` | `number` | DefaultPaginator | ✅ |  ❌  |
| `customers` | `source_id` | DefaultPaginator | ✅ |  ✅  |
| `customer_invoices` | `id` | DefaultPaginator | ✅ |  ✅  |
| `customer_estimates` | `id` | DefaultPaginator | ✅ |  ✅  |
| `products` | `source_id` | DefaultPaginator | ✅ |  ✅  |
| `category_groups` | `id` | DefaultPaginator | ✅ |  ✅  |
| `categories` | `source_id` | DefaultPaginator | ✅ |  ✅  |


## Changelog

<details>
  <summary>Expand to review</summary>

| Version | Date | Pull Request | Subject |
|---------|------|--------------|---------|
| 0.3.10 | 2025-08-02 | [64225](https://github.com/airbytehq/airbyte/pull/64225) | Update dependencies |
| 0.3.9 | 2025-07-26 | [63817](https://github.com/airbytehq/airbyte/pull/63817) | Update dependencies |
| 0.3.8 | 2025-07-19 | [63404](https://github.com/airbytehq/airbyte/pull/63404) | Update dependencies |
| 0.3.7 | 2025-07-12 | [63196](https://github.com/airbytehq/airbyte/pull/63196) | Update dependencies |
| 0.3.6 | 2025-07-05 | [62622](https://github.com/airbytehq/airbyte/pull/62622) | Update dependencies |
| 0.3.5 | 2025-06-28 | [62387](https://github.com/airbytehq/airbyte/pull/62387) | Update dependencies |
| 0.3.4 | 2025-06-21 | [61925](https://github.com/airbytehq/airbyte/pull/61925) | Update dependencies |
| 0.3.3 | 2025-06-14 | [61062](https://github.com/airbytehq/airbyte/pull/61062) | Update dependencies |
| 0.3.2 | 2025-05-24 | [60575](https://github.com/airbytehq/airbyte/pull/60575) | Update dependencies |
| 0.3.1 | 2025-05-10 | [60071](https://github.com/airbytehq/airbyte/pull/60071) | Update dependencies |
| 0.3.0 | 2025-05-09 | [59679](https://github.com/airbytehq/airbyte/pull/59679) | Add  stream `customer_estimates` stream |
| 0.2.9 | 2025-05-03 | [59078](https://github.com/airbytehq/airbyte/pull/59078) | Update dependencies |
| 0.2.8 | 2025-04-19 | [57882](https://github.com/airbytehq/airbyte/pull/57882) | Update dependencies |
| 0.2.7 | 2025-04-05 | [57347](https://github.com/airbytehq/airbyte/pull/57347) | Update dependencies |
| 0.2.6 | 2025-03-29 | [56788](https://github.com/airbytehq/airbyte/pull/56788) | Update dependencies |
| 0.2.5 | 2025-03-22 | [56221](https://github.com/airbytehq/airbyte/pull/56221) | Update dependencies |
| 0.2.4 | 2025-03-08 | [55556](https://github.com/airbytehq/airbyte/pull/55556) | Update dependencies |
| 0.2.3 | 2025-03-01 | [55024](https://github.com/airbytehq/airbyte/pull/55024) | Update dependencies |
| 0.2.2 | 2025-02-23 | [54601](https://github.com/airbytehq/airbyte/pull/54601) | Update dependencies |
| 0.2.1 | 2025-02-15 | [50686](https://github.com/airbytehq/airbyte/pull/50686) | Update dependencies |
| 0.2.0 | 2025-01-29 | [52596](https://github.com/airbytehq/airbyte/pull/52596) | Fixes for category_groups and plan_items |
| 0.1.1 | 2024-12-21 | [50294](https://github.com/airbytehq/airbyte/pull/50294) | Update dependencies |
| 0.1.0 | 2024-12-10 | [48892](https://github.com/airbytehq/airbyte/pull/48892) | Add missing fields to `customer_invoices` stream |
| 0.0.6 | 2024-12-14 | [49659](https://github.com/airbytehq/airbyte/pull/49659) | Update dependencies |
| 0.0.5 | 2024-12-12 | [49322](https://github.com/airbytehq/airbyte/pull/49322) | Update dependencies |
| 0.0.4 | 2024-12-11 | [49053](https://github.com/airbytehq/airbyte/pull/49053) | Starting with this version, the Docker image is now rootless. Please note that this and future versions will not be compatible with Airbyte versions earlier than 0.64 |
| 0.0.3 | 2024-11-04 | [47902](https://github.com/airbytehq/airbyte/pull/47902) | Update dependencies |
| 0.0.2 | 2024-10-28 | [47536](https://github.com/airbytehq/airbyte/pull/47536) | Update dependencies |
| 0.0.1 | 2024-08-21 | | Initial release by natikgadzhi via Connector Builder |

</details>
