$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Application",
  "description": "",
  "id": "application",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2800000,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Home page default login",
  "description": "",
  "id": "application;home-page-default-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 18,
      "name": "@WebTest"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "User is on NetBanking landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "User sign up with following details",
  "rows": [
    {
      "cells": [
        "jenny",
        "abcd",
        "john@abcd.com",
        "Australia",
        "3242353"
      ],
      "line": 22
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "Home page is populated",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "Cards displayed are \"false\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.user_is_on_NetBanking_landing_page()"
});
formatter.result({
  "duration": 370986800,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinitions.user_sign_up_with_following_details(DataTable)"
});
formatter.result({
  "duration": 2903300,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinitions.home_page_is_populated()"
});
formatter.result({
  "duration": 121500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "false",
      "offset": 21
    }
  ],
  "location": "stepDefinitions.cards_displayed_are(String)"
});
formatter.result({
  "duration": 3120900,
  "status": "passed"
});
formatter.after({
  "duration": 424500,
  "status": "passed"
});
});