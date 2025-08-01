# Employment-Hero
This directory contains the manifest-only connector for `source-employment-hero`.

## Documentation reference:
Visit `https://developer.employmenthero.com/api-references/#icon-book-open-introduction` for API documentation

## Authentication setup
`Employement Hero` uses Bearer token authentication, since code granted OAuth is not directly supported right now, Visit your developer profile for getting your OAuth keys. Refer `https://secure.employmenthero.com/app/v2/organisations/xxxxx/developer_portal/api` for more details.

## Getting your bearer token via postman

You can make a POST request from Postman to exchange your OAuth credentials for an `access token` to make requests.

First make an app to get the client ID and secret for authentication:

1. Go to developers portal Page:
- Visit `https://secure.employmenthero.com/app/v2/organisations/xxxxx/developer_portal/api`, select `Add Application` and input an app name. Select the `scopes` and set the redirect URI as `https://oauth.pstmn.io/v1/callback`.

2. Copy Your App Credentials:
 - After creating the app, you will see the Client ID and Client Secret.
 - Client ID: Copy this value as it will be your Client ID in Postman.
 - Client Secret: Copy this value as it will be your Client Secret in Postman.

3. Visit Postman via web or app and make a new request with following guidelines:
 - Open a new request - Goto Authorization tab - Select OAuth 2.0
 - Auth URL - `https://oauth.employmenthero.com/oauth2/authorize`
 - Access Token URL - `https://oauth.employmenthero.com/oauth2/token`
 - Set your client id and secret and leave scope and state as blank

Hit Get new Access token and approve via browser, Postman will collect a new `access_token` in the console response.

## Configuration

| Input | Type | Description | Default Value |
|-------|------|-------------|---------------|
| `api_key` | `string` | API Key.  |  |
| `organization_configids` | `array` | Organization ID. Organization ID which could be found as result of `organizations` stream to be used in other substreams |  |
| `employees_configids` | `array` | Employees ID. Employees IDs in the given organisation found in `employees` stream for passing to sub-streams |  |

## Streams
| Stream Name | Primary Key | Pagination | Supports Full Sync | Supports Incremental |
|-------------|-------------|------------|---------------------|----------------------|
| organisations | id | DefaultPaginator | ✅ |  ❌  |
| employees | id | DefaultPaginator | ✅ |  ❌  |
| leave_requests | id | DefaultPaginator | ✅ |  ❌  |
| employee_certifications | id | DefaultPaginator | ✅ |  ❌  |
| pay_details | id | DefaultPaginator | ✅ |  ❌  |
| teams | id | DefaultPaginator | ✅ |  ❌  |
| policies | id | DefaultPaginator | ✅ |  ❌  |
| certifications | id | DefaultPaginator | ✅ |  ❌  |
| custom_fields | id | DefaultPaginator | ✅ |  ❌  |
| employee_custom_fields | id | DefaultPaginator | ✅ |  ❌  |

## Changelog

<details>
  <summary>Expand to review</summary>

| Version | Date | Pull Request | Subject |
| ------------------ | ------------ | --- | ---------------- |
| 0.0.29 | 2025-07-26 | [64022](https://github.com/airbytehq/airbyte/pull/64022) | Update dependencies |
| 0.0.28 | 2025-07-19 | [63552](https://github.com/airbytehq/airbyte/pull/63552) | Update dependencies |
| 0.0.27 | 2025-07-12 | [63015](https://github.com/airbytehq/airbyte/pull/63015) | Update dependencies |
| 0.0.26 | 2025-07-05 | [62795](https://github.com/airbytehq/airbyte/pull/62795) | Update dependencies |
| 0.0.25 | 2025-06-28 | [62339](https://github.com/airbytehq/airbyte/pull/62339) | Update dependencies |
| 0.0.24 | 2025-06-22 | [61989](https://github.com/airbytehq/airbyte/pull/61989) | Update dependencies |
| 0.0.23 | 2025-06-14 | [61251](https://github.com/airbytehq/airbyte/pull/61251) | Update dependencies |
| 0.0.22 | 2025-05-24 | [60021](https://github.com/airbytehq/airbyte/pull/60021) | Update dependencies |
| 0.0.21 | 2025-05-03 | [59446](https://github.com/airbytehq/airbyte/pull/59446) | Update dependencies |
| 0.0.20 | 2025-04-26 | [58910](https://github.com/airbytehq/airbyte/pull/58910) | Update dependencies |
| 0.0.19 | 2025-04-19 | [57832](https://github.com/airbytehq/airbyte/pull/57832) | Update dependencies |
| 0.0.18 | 2025-04-05 | [57283](https://github.com/airbytehq/airbyte/pull/57283) | Update dependencies |
| 0.0.17 | 2025-03-29 | [56521](https://github.com/airbytehq/airbyte/pull/56521) | Update dependencies |
| 0.0.16 | 2025-03-22 | [55970](https://github.com/airbytehq/airbyte/pull/55970) | Update dependencies |
| 0.0.15 | 2025-03-08 | [55320](https://github.com/airbytehq/airbyte/pull/55320) | Update dependencies |
| 0.0.14 | 2025-03-01 | [54455](https://github.com/airbytehq/airbyte/pull/54455) | Update dependencies |
| 0.0.13 | 2025-02-15 | [53716](https://github.com/airbytehq/airbyte/pull/53716) | Update dependencies |
| 0.0.12 | 2025-02-08 | [53322](https://github.com/airbytehq/airbyte/pull/53322) | Update dependencies |
| 0.0.11 | 2025-02-01 | [52817](https://github.com/airbytehq/airbyte/pull/52817) | Update dependencies |
| 0.0.10 | 2025-01-25 | [52347](https://github.com/airbytehq/airbyte/pull/52347) | Update dependencies |
| 0.0.9 | 2025-01-18 | [51681](https://github.com/airbytehq/airbyte/pull/51681) | Update dependencies |
| 0.0.8 | 2025-01-11 | [51081](https://github.com/airbytehq/airbyte/pull/51081) | Update dependencies |
| 0.0.7 | 2024-12-28 | [50526](https://github.com/airbytehq/airbyte/pull/50526) | Update dependencies |
| 0.0.6 | 2024-12-21 | [50024](https://github.com/airbytehq/airbyte/pull/50024) | Update dependencies |
| 0.0.5 | 2024-12-14 | [49489](https://github.com/airbytehq/airbyte/pull/49489) | Update dependencies |
| 0.0.4 | 2024-12-12 | [49190](https://github.com/airbytehq/airbyte/pull/49190) | Update dependencies |
| 0.0.3 | 2024-11-04 | [47819](https://github.com/airbytehq/airbyte/pull/47819) | Update dependencies |
| 0.0.2 | 2024-10-28 | [47632](https://github.com/airbytehq/airbyte/pull/47632) | Update dependencies |
| 0.0.1 | 2024-09-25 | [45888](https://github.com/airbytehq/airbyte/pull/45888) | Initial release by [@btkcodedev](https://github.com/btkcodedev) via Connector Builder |

</details>
