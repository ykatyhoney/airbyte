# Finage
Real-Time Market Data Solutions for Stocks, Forex, and Crypto
This connector can be used to extract data from various APIs such as symbol-list,Aggregates,Snapshot and Technical Indicators

## Configuration

| Input | Type | Description | Default Value |
|-------|------|-------------|---------------|
| `api_key` | `string` | API Key.  |  |
| `symbols` | `array` | Symbols. List of symbols  |  |
| `tech_indicator_type` | `string` | Technical Indicator Type. One of DEMA, EMA, SMA, WMA, RSI, TEMA, Williams, ADX  | SMA |
| `time` | `string` | Time Interval.  | daily |
| `period` | `string` | Period. Time period. Default is 10 |  |
| `time_aggregates` | `string` | Time aggregates. Size of the time | day |
| `time_period` | `string` | Time Period. Time Period for cash flow stmts |  |
| `start_date` | `string` | Start date.  |  |

## Streams
| Stream Name | Primary Key | Pagination | Supports Full Sync | Supports Incremental |
|-------------|-------------|------------|---------------------|----------------------|
| market_news |  | No pagination | ✅ |  ❌  |
| most_active_us_stocks | symbol | No pagination | ✅ |  ❌  |
| technical_indicators |  | No pagination | ✅ |  ❌  |
| economic_calendar |  | No pagination | ✅ |  ✅  |
| earning_calendar |  | No pagination | ✅ |  ❌  |
| delisted_companies | symbol | No pagination | ✅ |  ❌  |
| ipo_calendar | symbol | No pagination | ✅ |  ✅  |
| historical_stock_split  |  | No pagination | ✅ |  ❌  |
| historical_dividends_calendar |  | No pagination | ✅ |  ❌  |
| cash_flow_statements | date.symbol | No pagination | ✅ |  ❌  |
| balance_sheet_statements | date.symbol | No pagination | ✅ |  ❌  |
| income_statement | date.symbol | No pagination | ✅ |  ❌  |
| institutional_holders | holder | No pagination | ✅ |  ❌  |
| mutual_fund_holder |  | No pagination | ✅ |  ❌  |
| most_gainers | symbol | No pagination | ✅ |  ❌  |
| most_losers | symbol | No pagination | ✅ |  ❌  |
| sector_performance | sector | No pagination | ✅ |  ❌  |
| shares_float |  | No pagination | ✅ |  ❌  |

## Changelog

<details>
  <summary>Expand to review</summary>

| Version          | Date              | Pull Request | Subject        |
|------------------|-------------------|--------------|----------------|
| 0.0.29 | 2025-07-26 | [63988](https://github.com/airbytehq/airbyte/pull/63988) | Update dependencies |
| 0.0.28 | 2025-07-19 | [63602](https://github.com/airbytehq/airbyte/pull/63602) | Update dependencies |
| 0.0.27 | 2025-07-12 | [62973](https://github.com/airbytehq/airbyte/pull/62973) | Update dependencies |
| 0.0.26 | 2025-07-05 | [62767](https://github.com/airbytehq/airbyte/pull/62767) | Update dependencies |
| 0.0.25 | 2025-06-28 | [62375](https://github.com/airbytehq/airbyte/pull/62375) | Update dependencies |
| 0.0.24 | 2025-06-22 | [61991](https://github.com/airbytehq/airbyte/pull/61991) | Update dependencies |
| 0.0.23 | 2025-06-14 | [61229](https://github.com/airbytehq/airbyte/pull/61229) | Update dependencies |
| 0.0.22 | 2025-05-24 | [59963](https://github.com/airbytehq/airbyte/pull/59963) | Update dependencies |
| 0.0.21 | 2025-05-03 | [59397](https://github.com/airbytehq/airbyte/pull/59397) | Update dependencies |
| 0.0.20 | 2025-04-26 | [58878](https://github.com/airbytehq/airbyte/pull/58878) | Update dependencies |
| 0.0.19 | 2025-04-19 | [58306](https://github.com/airbytehq/airbyte/pull/58306) | Update dependencies |
| 0.0.18 | 2025-04-12 | [57805](https://github.com/airbytehq/airbyte/pull/57805) | Update dependencies |
| 0.0.17 | 2025-04-05 | [57209](https://github.com/airbytehq/airbyte/pull/57209) | Update dependencies |
| 0.0.16 | 2025-03-29 | [56488](https://github.com/airbytehq/airbyte/pull/56488) | Update dependencies |
| 0.0.15 | 2025-03-22 | [55981](https://github.com/airbytehq/airbyte/pull/55981) | Update dependencies |
| 0.0.14 | 2025-03-08 | [55327](https://github.com/airbytehq/airbyte/pull/55327) | Update dependencies |
| 0.0.13 | 2025-03-01 | [54914](https://github.com/airbytehq/airbyte/pull/54914) | Update dependencies |
| 0.0.12 | 2025-02-22 | [54384](https://github.com/airbytehq/airbyte/pull/54384) | Update dependencies |
| 0.0.11 | 2025-02-15 | [53707](https://github.com/airbytehq/airbyte/pull/53707) | Update dependencies |
| 0.0.10 | 2025-02-08 | [53343](https://github.com/airbytehq/airbyte/pull/53343) | Update dependencies |
| 0.0.9 | 2025-02-01 | [52801](https://github.com/airbytehq/airbyte/pull/52801) | Update dependencies |
| 0.0.8 | 2025-01-25 | [52345](https://github.com/airbytehq/airbyte/pull/52345) | Update dependencies |
| 0.0.7 | 2025-01-18 | [51652](https://github.com/airbytehq/airbyte/pull/51652) | Update dependencies |
| 0.0.6 | 2025-01-11 | [51134](https://github.com/airbytehq/airbyte/pull/51134) | Update dependencies |
| 0.0.5 | 2024-12-28 | [50566](https://github.com/airbytehq/airbyte/pull/50566) | Update dependencies |
| 0.0.4 | 2024-12-21 | [50058](https://github.com/airbytehq/airbyte/pull/50058) | Update dependencies |
| 0.0.3 | 2024-12-14 | [49496](https://github.com/airbytehq/airbyte/pull/49496) | Update dependencies |
| 0.0.2 | 2024-12-12 | [49202](https://github.com/airbytehq/airbyte/pull/49202) | Update dependencies |
| 0.0.1 | 2024-11-11 | | Initial release by [@marcosmarxm](https://github.com/marcosmarxm) via Connector Builder |

</details>
