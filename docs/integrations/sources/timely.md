# Timely

This page contains the setup guide and reference information for the Timely source connector.

## Prerequisites

1. Please follow these [steps](https://dev.timelyapp.com/#authorization) to obtain `Bearer Token` for your account.
2. Login into your `https://app.timelyapp.com` portal, fetch the `Account ID` present in the URL (example: URL `https://app.timelyapp.com/12345/calendar` and account-id `12345`).
3. Get a start-date to your events. Date format `YYYY-MM-DDTHH:mm:ssZ`.

## Setup guide

## Step 1: Set up the Timely connector in Airbyte

### For Airbyte OSS:

1. Navigate to the Airbyte Open Source dashboard.
2. In the left navigation bar, click **Sources**. In the top-right corner, click **+new source**.
3. On the Set up the source page, enter the name for the Timely connector and select **Timely** from the Source type dropdown.
4. Enter your `Bearer Token`, `Account ID`, and `Start Date`.
5. Select `Authenticate your account`.
6. Click **Set up source**.

## Supported sync modes

The Timely source connector supports the following [sync modes](https://docs.airbyte.com/cloud/core-concepts#connection-sync-modes):

| Feature           | Supported? |
| :---------------- |:-----------|
| Full Refresh Sync | Yes        |
| Incremental Sync  | Yes        |

## Changelog

<details>
  <summary>Expand to review</summary>

| Version | Date       | Pull Request                                             | Subject                                                                         |
|:--------|:-----------|:---------------------------------------------------------|:--------------------------------------------------------------------------------|
| 1.0.17 | 2025-07-19 | [63636](https://github.com/airbytehq/airbyte/pull/63636) | Update dependencies |
| 1.0.16 | 2025-07-12 | [63091](https://github.com/airbytehq/airbyte/pull/63091) | Update dependencies |
| 1.0.15 | 2025-06-28 | [62210](https://github.com/airbytehq/airbyte/pull/62210) | Update dependencies |
| 1.0.14 | 2025-06-14 | [61296](https://github.com/airbytehq/airbyte/pull/61296) | Update dependencies |
| 1.0.13 | 2025-05-25 | [60502](https://github.com/airbytehq/airbyte/pull/60502) | Update dependencies |
| 1.0.12 | 2025-05-10 | [60144](https://github.com/airbytehq/airbyte/pull/60144) | Update dependencies |
| 1.0.11 | 2025-05-04 | [59595](https://github.com/airbytehq/airbyte/pull/59595) | Update dependencies |
| 1.0.10 | 2025-04-27 | [58974](https://github.com/airbytehq/airbyte/pull/58974) | Update dependencies |
| 1.0.9 | 2025-04-19 | [58409](https://github.com/airbytehq/airbyte/pull/58409) | Update dependencies |
| 1.0.8 | 2025-04-12 | [57933](https://github.com/airbytehq/airbyte/pull/57933) | Update dependencies |
| 1.0.7 | 2025-04-05 | [57442](https://github.com/airbytehq/airbyte/pull/57442) | Update dependencies |
| 1.0.6 | 2025-03-29 | [56868](https://github.com/airbytehq/airbyte/pull/56868) | Update dependencies |
| 1.0.5 | 2025-03-22 | [56290](https://github.com/airbytehq/airbyte/pull/56290) | Update dependencies |
| 1.0.4 | 2025-03-08 | [55633](https://github.com/airbytehq/airbyte/pull/55633) | Update dependencies |
| 1.0.3 | 2025-03-01 | [55084](https://github.com/airbytehq/airbyte/pull/55084) | Update dependencies |
| 1.0.2 | 2025-02-22 | [54528](https://github.com/airbytehq/airbyte/pull/54528) | Update dependencies |
| 1.0.1 | 2025-02-15 | [54055](https://github.com/airbytehq/airbyte/pull/54055) | Update dependencies |
| 1.0.0 | 2025-01-07 | [45925](https://github.com/airbytehq/airbyte/pull/45925) | Add new streams, add incremental syncs, tidy inputs |
| 0.4.13 | 2025-02-08 | [53561](https://github.com/airbytehq/airbyte/pull/53561) | Update dependencies |
| 0.4.12 | 2025-02-01 | [53061](https://github.com/airbytehq/airbyte/pull/53061) | Update dependencies |
| 0.4.11 | 2025-01-25 | [52384](https://github.com/airbytehq/airbyte/pull/52384) | Update dependencies |
| 0.4.10 | 2025-01-18 | [52012](https://github.com/airbytehq/airbyte/pull/52012) | Update dependencies |
| 0.4.9 | 2025-01-11 | [51398](https://github.com/airbytehq/airbyte/pull/51398) | Update dependencies |
| 0.4.8 | 2024-12-28 | [50777](https://github.com/airbytehq/airbyte/pull/50777) | Update dependencies |
| 0.4.7 | 2024-12-21 | [50349](https://github.com/airbytehq/airbyte/pull/50349) | Update dependencies |
| 0.4.6 | 2024-12-14 | [49769](https://github.com/airbytehq/airbyte/pull/49769) | Update dependencies |
| 0.4.5 | 2024-12-12 | [49387](https://github.com/airbytehq/airbyte/pull/49387) | Update dependencies |
| 0.4.4 | 2024-12-11 | [48307](https://github.com/airbytehq/airbyte/pull/48307) | Starting with this version, the Docker image is now rootless. Please note that this and future versions will not be compatible with Airbyte versions earlier than 0.64 |
| 0.4.3 | 2024-10-29 | [47887](https://github.com/airbytehq/airbyte/pull/47887) | Update dependencies |
| 0.4.2 | 2024-10-28 | [47503](https://github.com/airbytehq/airbyte/pull/47503) | Update dependencies |
| 0.4.1 | 2024-08-16 | [44196](https://github.com/airbytehq/airbyte/pull/44196) | Bump source-declarative-manifest version |
| 0.4.0 | 2024-08-07 | [43368](https://github.com/airbytehq/airbyte/pull/43368) | Refactor connector to manifest-only format |
| 0.3.15 | 2024-08-03 | [43226](https://github.com/airbytehq/airbyte/pull/43226) | Update dependencies |
| 0.3.14 | 2024-07-27 | [42635](https://github.com/airbytehq/airbyte/pull/42635) | Update dependencies |
| 0.3.13 | 2024-07-20 | [42252](https://github.com/airbytehq/airbyte/pull/42252) | Update dependencies |
| 0.3.12 | 2024-07-13 | [41921](https://github.com/airbytehq/airbyte/pull/41921) | Update dependencies |
| 0.3.11 | 2024-07-10 | [41348](https://github.com/airbytehq/airbyte/pull/41348) | Update dependencies |
| 0.3.10 | 2024-07-09 | [41268](https://github.com/airbytehq/airbyte/pull/41268) | Update dependencies |
| 0.3.9 | 2024-07-06 | [40773](https://github.com/airbytehq/airbyte/pull/40773) | Update dependencies |
| 0.3.8 | 2024-06-26 | [40510](https://github.com/airbytehq/airbyte/pull/40510) | Update dependencies |
| 0.3.7 | 2024-06-22 | [39996](https://github.com/airbytehq/airbyte/pull/39996) | Update dependencies |
| 0.3.6 | 2024-06-04 | [39054](https://github.com/airbytehq/airbyte/pull/39054) | [autopull] Upgrade base image to v1.2.1 |
| 0.3.5 | 2024-05-20 | [38228](https://github.com/airbytehq/airbyte/pull/38228) | Make compatible with builder |
| 0.3.4 | 2024-04-19 | [37270](https://github.com/airbytehq/airbyte/pull/37270) | Updating to 0.80.0 CDK |
| 0.3.3 | 2024-04-18 | [37270](https://github.com/airbytehq/airbyte/pull/37270) | Manage dependencies with Poetry. |
| 0.3.2 | 2024-04-15 | [37270](https://github.com/airbytehq/airbyte/pull/37270) | Base image migration: remove Dockerfile and use the python-connector-base image |
| 0.3.1 | 2024-04-12 | [37270](https://github.com/airbytehq/airbyte/pull/37270) | schema descriptions |
| 0.3.0 | 2023-10-25 | [31002](https://github.com/airbytehq/airbyte/pull/31002) | Migrate to low-code framework |
| 0.2.0 | 2023-10-23 | [31745](https://github.com/airbytehq/airbyte/pull/31745) | Fix schemas |
| 0.1.0 | 2022-06-22 | [13617](https://github.com/airbytehq/airbyte/pull/13617) | Initial release |

</details>
