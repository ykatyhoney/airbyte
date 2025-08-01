# FreshBooks
FreshBooks connector  seamlessly syncs invoicing, expenses, and client data from FreshBooks into data warehouses or analytics platforms. 

## Configuration

| Input | Type | Description | Default Value |
|-------|------|-------------|---------------|
| `client_id` | `string` | Client ID.  |  |
| `client_secret` | `string` | Client secret.  |  |
| `redirect_uri` | `string` | Redirect Uri.  |  |
| `account_id` | `string` | Account Id.  |  |
| `client_refresh_token` | `string` | Refresh token.  |  |
| `oauth_access_token` | `string` | Access token. The current access token. This field might be overridden by the connector based on the token refresh endpoint response. |  |
| `oauth_token_expiry_date` | `string` | Token expiry date. The date the current access token expires in. This field might be overridden by the connector based on the token refresh endpoint response. |  |
| `business_uuid` | `string` | Business uuid.  |  |

Read [this](https://documenter.getpostman.com/view/3322108/S1ERwwza#intro) section carefully to get your Account Id and Business UUID.

## Streams
| Stream Name | Primary Key | Pagination | Supports Full Sync | Supports Incremental |
|-------------|-------------|------------|---------------------|----------------------|
| user |  | DefaultPaginator | ✅ |  ❌  |
| clients |  | DefaultPaginator | ✅ |  ❌  |
| invoices | id.invoiceid | DefaultPaginator | ✅ |  ❌  |
| expenses | id.expenseid | DefaultPaginator | ✅ |  ❌  |
| expense_summaries |  | DefaultPaginator | ✅ |  ❌  |
| expense_categories | id | DefaultPaginator | ✅ |  ❌  |
| invoice_details | invoiceid | DefaultPaginator | ✅ |  ❌  |
| expense_details | expenseid | DefaultPaginator | ✅ |  ❌  |
| accounts |  | DefaultPaginator | ✅ |  ❌  |
| taxes | taxid | DefaultPaginator | ✅ |  ❌  |

## Changelog

<details>
  <summary>Expand to review</summary>

| Version          | Date              | Pull Request | Subject        |
|------------------|-------------------|--------------|----------------|
| 0.0.31 | 2025-07-26 | [63990](https://github.com/airbytehq/airbyte/pull/63990) | Update dependencies |
| 0.0.30 | 2025-07-19 | [63560](https://github.com/airbytehq/airbyte/pull/63560) | Update dependencies |
| 0.0.29 | 2025-07-12 | [62998](https://github.com/airbytehq/airbyte/pull/62998) | Update dependencies |
| 0.0.28 | 2025-07-05 | [62784](https://github.com/airbytehq/airbyte/pull/62784) | Update dependencies |
| 0.0.27 | 2025-06-28 | [62423](https://github.com/airbytehq/airbyte/pull/62423) | Update dependencies |
| 0.0.26 | 2025-06-21 | [61944](https://github.com/airbytehq/airbyte/pull/61944) | Update dependencies |
| 0.0.25 | 2025-06-14 | [61204](https://github.com/airbytehq/airbyte/pull/61204) | Update dependencies |
| 0.0.24 | 2025-05-24 | [60399](https://github.com/airbytehq/airbyte/pull/60399) | Update dependencies |
| 0.0.23 | 2025-05-10 | [59962](https://github.com/airbytehq/airbyte/pull/59962) | Update dependencies |
| 0.0.22 | 2025-05-03 | [59428](https://github.com/airbytehq/airbyte/pull/59428) | Update dependencies |
| 0.0.21 | 2025-04-26 | [58862](https://github.com/airbytehq/airbyte/pull/58862) | Update dependencies |
| 0.0.20 | 2025-04-19 | [58369](https://github.com/airbytehq/airbyte/pull/58369) | Update dependencies |
| 0.0.19 | 2025-04-12 | [57830](https://github.com/airbytehq/airbyte/pull/57830) | Update dependencies |
| 0.0.18 | 2025-04-05 | [57271](https://github.com/airbytehq/airbyte/pull/57271) | Update dependencies |
| 0.0.17 | 2025-03-29 | [56468](https://github.com/airbytehq/airbyte/pull/56468) | Update dependencies |
| 0.0.16 | 2025-03-22 | [55987](https://github.com/airbytehq/airbyte/pull/55987) | Update dependencies |
| 0.0.15 | 2025-03-08 | [55347](https://github.com/airbytehq/airbyte/pull/55347) | Update dependencies |
| 0.0.14 | 2025-03-01 | [54947](https://github.com/airbytehq/airbyte/pull/54947) | Update dependencies |
| 0.0.13 | 2025-02-22 | [54422](https://github.com/airbytehq/airbyte/pull/54422) | Update dependencies |
| 0.0.12 | 2025-02-15 | [53770](https://github.com/airbytehq/airbyte/pull/53770) | Update dependencies |
| 0.0.11 | 2025-02-08 | [53314](https://github.com/airbytehq/airbyte/pull/53314) | Update dependencies |
| 0.0.10 | 2025-02-01 | [52873](https://github.com/airbytehq/airbyte/pull/52873) | Update dependencies |
| 0.0.9 | 2025-01-25 | [52309](https://github.com/airbytehq/airbyte/pull/52309) | Update dependencies |
| 0.0.8 | 2025-01-18 | [51659](https://github.com/airbytehq/airbyte/pull/51659) | Update dependencies |
| 0.0.7 | 2025-01-11 | [51087](https://github.com/airbytehq/airbyte/pull/51087) | Update dependencies |
| 0.0.6 | 2024-12-28 | [50525](https://github.com/airbytehq/airbyte/pull/50525) | Update dependencies |
| 0.0.5 | 2024-12-21 | [50000](https://github.com/airbytehq/airbyte/pull/50000) | Update dependencies |
| 0.0.4 | 2024-12-14 | [49498](https://github.com/airbytehq/airbyte/pull/49498) | Update dependencies |
| 0.0.3 | 2024-12-12 | [49209](https://github.com/airbytehq/airbyte/pull/49209) | Update dependencies |
| 0.0.2 | 2024-12-11 | [48942](https://github.com/airbytehq/airbyte/pull/48942) | Starting with this version, the Docker image is now rootless. Please note that this and future versions will not be compatible with Airbyte versions earlier than 0.64 |
| 0.0.1 | 2024-10-27 | | Initial release by [@bishalbera](https://github.com/bishalbera) via Connector Builder |

</details>
