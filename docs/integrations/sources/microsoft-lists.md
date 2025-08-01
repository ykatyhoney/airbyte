# Microsoft Lists
Microsoft Lists connector enables seamless data integration and synchronization between Microsoft Lists and other destination. The connector leverages Microsoft Graph API to retrieve list items efficiently, ensuring smooth workflows and real-time data accessibility

## Authentication

  ### 1. Register a New Application(If you don't have already)
  Go to the [Azure Portal](https://portal.azure.com)
  Navigate to Azure Active Directory > App registrations > New registration.
  Provide the following details:
  Name: Enter a name for your app (e.g., Airbyte Lists Connector).
  Supported account types: Choose the option that suits your needs (e.g., Single tenant or Multitenant).
  Redirect URI: Leave it blank for now or provide one if needed.
  Click Register.

  ### 2. Configure API Permissions
  In the App Overview page, go to API Permissions > Add a permission.
  Select Microsoft Graph.
  Choose  Application Permissions:
  `Sites.Read.All`,
 ` Sites.ReadWrite.All`
  After adding the permissions, click Grant admin consent to allow these permissions.

  ### 3. Create Client Secret
  In your registered app, go to Certificates & secrets > New client secret.
  Add a description and select an expiration period.
  Click Add and copy the client secret value (you won’t be able to see it again).

  ### 4. Obtain Client ID and Tenant ID
  Go to the Overview tab in your registered app.
  Copy the Application (client) ID and Directory (tenant) ID – you’ll need these for authentication.

  ### 5. Set Redirect URI 
  Go to Authentication > Add a platform.
  Select Web and enter your redirect URI (e.g., http://localhost:3000).
  Enable Access tokens and ID tokens if using OAuth2 for authentication.

## Configuration

| Input | Type | Description | Default Value |
|-------|------|-------------|---------------|
| `site_id` | `string` | Site Id.  |  |
| `client_id` | `string` | Client ID.  |  |
| `client_secret` | `string` | Client secret.  |  |
| `application_id_uri` | `string` | Application Id URI.  |  |
| `tenant_id` | `string` | Tenant Id.  |  |
| `domain` | `string` | Domain.  |  |

## Streams
| Stream Name | Primary Key | Pagination | Supports Full Sync | Supports Incremental |
|-------------|-------------|------------|---------------------|----------------------|
| lists | id | DefaultPaginator | ✅ |  ❌  |
| listcontenttypes | id | DefaultPaginator | ✅ |  ❌  |
| listitems |  | DefaultPaginator | ✅ |  ❌  |
| items |  | DefaultPaginator | ✅ |  ❌  |
| columnvalues | id | DefaultPaginator | ✅ |  ❌  |

## Changelog

<details>
  <summary>Expand to review</summary>

| Version          | Date              | Pull Request | Subject        |
|------------------|-------------------|--------------|----------------|
| 0.0.36 | 2025-08-02 | [64240](https://github.com/airbytehq/airbyte/pull/64240) | Update dependencies |
| 0.0.35 | 2025-07-26 | [63896](https://github.com/airbytehq/airbyte/pull/63896) | Update dependencies |
| 0.0.34 | 2025-07-19 | [63444](https://github.com/airbytehq/airbyte/pull/63444) | Update dependencies |
| 0.0.33 | 2025-07-12 | [63217](https://github.com/airbytehq/airbyte/pull/63217) | Update dependencies |
| 0.0.32 | 2025-07-05 | [62657](https://github.com/airbytehq/airbyte/pull/62657) | Update dependencies |
| 0.0.31 | 2025-06-28 | [62382](https://github.com/airbytehq/airbyte/pull/62382) | Update dependencies |
| 0.0.30 | 2025-06-21 | [61930](https://github.com/airbytehq/airbyte/pull/61930) | Update dependencies |
| 0.0.29 | 2025-06-14 | [61065](https://github.com/airbytehq/airbyte/pull/61065) | Update dependencies |
| 0.0.28 | 2025-05-24 | [60444](https://github.com/airbytehq/airbyte/pull/60444) | Update dependencies |
| 0.0.27 | 2025-05-10 | [60125](https://github.com/airbytehq/airbyte/pull/60125) | Update dependencies |
| 0.0.26 | 2025-05-04 | [59520](https://github.com/airbytehq/airbyte/pull/59520) | Update dependencies |
| 0.0.25 | 2025-04-26 | [58756](https://github.com/airbytehq/airbyte/pull/58756) | Update dependencies |
| 0.0.24 | 2025-04-30 | [58575](https://github.com/airbytehq/airbyte/pull/58575) | Fix ListItems and ColumnValues streams |
| 0.0.23 | 2025-04-19 | [58521](https://github.com/airbytehq/airbyte/pull/58521) | Update dependencies |
| 0.0.22 | 2025-04-12 | [57861](https://github.com/airbytehq/airbyte/pull/57861) | Update dependencies |
| 0.0.21 | 2025-04-05 | [57042](https://github.com/airbytehq/airbyte/pull/57042) | Update dependencies |
| 0.0.20 | 2025-03-29 | [56713](https://github.com/airbytehq/airbyte/pull/56713) | Update dependencies |
| 0.0.19 | 2025-03-22 | [56074](https://github.com/airbytehq/airbyte/pull/56074) | Update dependencies |
| 0.0.18 | 2025-03-08 | [55445](https://github.com/airbytehq/airbyte/pull/55445) | Update dependencies |
| 0.0.17 | 2025-03-01 | [54817](https://github.com/airbytehq/airbyte/pull/54817) | Update dependencies |
| 0.0.16 | 2025-02-22 | [54329](https://github.com/airbytehq/airbyte/pull/54329) | Update dependencies |
| 0.0.15 | 2025-02-15 | [53848](https://github.com/airbytehq/airbyte/pull/53848) | Update dependencies |
| 0.0.14 | 2025-02-08 | [53285](https://github.com/airbytehq/airbyte/pull/53285) | Update dependencies |
| 0.0.13 | 2025-02-01 | [52753](https://github.com/airbytehq/airbyte/pull/52753) | Update dependencies |
| 0.0.12 | 2025-01-25 | [52249](https://github.com/airbytehq/airbyte/pull/52249) | Update dependencies |
| 0.0.11 | 2025-01-18 | [51824](https://github.com/airbytehq/airbyte/pull/51824) | Update dependencies |
| 0.0.10 | 2025-01-11 | [51148](https://github.com/airbytehq/airbyte/pull/51148) | Update dependencies |
| 0.0.9 | 2024-12-28 | [50613](https://github.com/airbytehq/airbyte/pull/50613) | Update dependencies |
| 0.0.8 | 2024-12-21 | [50117](https://github.com/airbytehq/airbyte/pull/50117) | Update dependencies |
| 0.0.7 | 2024-12-14 | [49598](https://github.com/airbytehq/airbyte/pull/49598) | Update dependencies |
| 0.0.6 | 2024-12-12 | [49229](https://github.com/airbytehq/airbyte/pull/49229) | Update dependencies |
| 0.0.5 | 2024-12-11 | [48952](https://github.com/airbytehq/airbyte/pull/48952) | Starting with this version, the Docker image is now rootless. Please note that this and future versions will not be compatible with Airbyte versions earlier than 0.64 |
| 0.0.4 | 2024-11-04 | [48202](https://github.com/airbytehq/airbyte/pull/48202) | Update dependencies |
| 0.0.3 | 2024-10-29 | [47925](https://github.com/airbytehq/airbyte/pull/47925) | Update dependencies |
| 0.0.2 | 2024-10-28 | [47544](https://github.com/airbytehq/airbyte/pull/47544) | Update dependencies |
| 0.0.1 | 2024-10-18 | | Initial release by [@bishalbera](https://github.com/bishalbera) via Connector Builder |

</details>
