Feature: Application


@RegTest
Scenario: Home page default login
Given User is on NetBanking landing page
When User login into application with "jin" and password "1234"
Then Home page is populated
And Cards displayed are "true"

@MobileTest
Scenario: Home page default login
Given User is on NetBanking landing page
When User login into application with "john" and password "4321"
Then Home page is populated
And Cards displayed are "false"

@WebTest
Scenario: Home page default login
Given User is on NetBanking landing page
When User sign up with following details
| jenny | abcd | john@abcd.com |Australia | 3242353|
Then Home page is populated
And Cards displayed are "false"

@MobileTest
Scenario Outline: Home page default login
Given User is on NetBanking landing page
When User login in to application with <username> and password <password>
Then Home page is populated
And Cards displayed are "false"

Examples:
|username | password |
|Ram | 2563|
|Shyam | 645 |
|Harry | 6754 |
|Call | 2424 |				