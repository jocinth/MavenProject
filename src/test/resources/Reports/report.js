$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/Adactin.feature");
formatter.feature({
  "name": "Automating the functionalities of Adactin",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Tc-03: Verification of Adactin Login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User wants to verify whether the login page appears once the aactin application is launched",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.user_wants_to_verify_whether_the_login_page_appears_once_the_aactin_application_is_launched()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User wants to give valid username and password using DataTable with header Two-D, and click on the login button",
  "rows": [
    {
      "cells": [
        "UserName",
        "PassWord"
      ]
    },
    {
      "cells": [
        "jocinthn",
        "123456"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.user_wants_to_give_valid_username_and_password_using_DataTable_with_header_Two_D_and_click_on_the_login_button(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User wants to verify whether the search hotel page appear or not",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.user_wants_to_verify_whether_the_search_hotel_page_appear_or_not()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});