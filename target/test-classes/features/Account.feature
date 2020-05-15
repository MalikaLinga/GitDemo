Feature: Account Opening


Background:
Given Validate the Browser
When Browser is trigged
Then check if browser is displayed

@RegTest
Scenario: Home page default login
Given User is on NetBanking landing page
When User login into application with "jin" and password "1234"
Then Home page is populated
And Cards displayed are "true"
