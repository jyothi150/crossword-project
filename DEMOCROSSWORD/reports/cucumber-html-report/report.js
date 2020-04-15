$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Lenovo/eclipse-workspace/DEMOCROSSWORD/src/test/resources/features/sample.feature");
formatter.feature({
  "line": 2,
  "name": "Crossword Website",
  "description": "",
  "id": "crossword-website",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 7,
  "name": "validate Login functionality",
  "description": "",
  "id": "crossword-website;validate-login-functionality",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@TC_01_Crossword"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I Launch the Browser and enter the url",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "login page is opened",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I enter the \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I click on the signin button",
  "keyword": "And "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "crossword-website;validate-login-functionality;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 14,
      "id": "crossword-website;validate-login-functionality;;1"
    },
    {
      "cells": [
        "jyothidurga150@gmail.com",
        "jyothi123"
      ],
      "line": 15,
      "id": "crossword-website;validate-login-functionality;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 15,
  "name": "validate Login functionality",
  "description": "",
  "id": "crossword-website;validate-login-functionality;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@TC_01_Crossword"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I Launch the Browser and enter the url",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "login page is opened",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I enter the \"jyothidurga150@gmail.com\" and \"jyothi123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I click on the signin button",
  "keyword": "And "
});
formatter.match({
  "location": "Crossword_Login.i_Launch_the_Browser_and_enter_the_url()"
});
formatter.result({
  "duration": 21266884500,
  "status": "passed"
});
formatter.match({
  "location": "Crossword_Login.login_page_is_opened()"
});
formatter.result({
  "duration": 1265404500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "jyothidurga150@gmail.com",
      "offset": 13
    },
    {
      "val": "jyothi123",
      "offset": 44
    }
  ],
  "location": "Crossword_Login.i_enter_the_and(String,String)"
});
formatter.result({
  "duration": 439207400,
  "status": "passed"
});
formatter.match({
  "location": "Crossword_Login.i_click_on_the_signin_button()"
});
formatter.result({
  "duration": 1481115700,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Book",
  "description": "",
  "id": "crossword-website;book",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 18,
      "name": "@TC_02_Crossword"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "I logged on the Website",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "I click on books",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "I select required book",
  "keyword": "Then "
});
formatter.match({
  "location": "CrosswordBook.i_logged_on_the_Website()"
});
formatter.result({
  "duration": 17397243000,
  "status": "passed"
});
formatter.match({
  "location": "CrosswordBook.i_click_on_books()"
});
formatter.result({
  "duration": 2639405500,
  "status": "passed"
});
formatter.match({
  "location": "CrosswordBook.i_click_on_quickview()"
});
formatter.result({
  "duration": 2500798100,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "Mycart",
  "description": "",
  "id": "crossword-website;mycart",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 28,
      "name": "@TC_03_Crossword"
    }
  ]
});
formatter.step({
  "line": 30,
  "name": "I logged on to the Website",
  "keyword": "Given "
});
formatter.step({
  "line": 31,
  "name": "I clicked on mycart",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "I select continue shopping",
  "keyword": "Then "
});
formatter.match({
  "location": "CrosswordMycart.i_logged_on_to_the_Website()"
});
formatter.result({
  "duration": 21439382700,
  "status": "passed"
});
formatter.match({
  "location": "CrosswordMycart.i_clicked_on_mycart()"
});
formatter.result({
  "duration": 2589808800,
  "status": "passed"
});
formatter.match({
  "location": "CrosswordMycart.i_select_continue_shopping()"
});
formatter.result({
  "duration": 2468983000,
  "status": "passed"
});
formatter.scenario({
  "line": 37,
  "name": "Help",
  "description": "",
  "id": "crossword-website;help",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 36,
      "name": "@TC_04_Crossword"
    }
  ]
});
formatter.step({
  "line": 38,
  "name": "I am logged in to the website",
  "keyword": "Given "
});
formatter.step({
  "line": 39,
  "name": "I have clicked on to the Help",
  "keyword": "When "
});
formatter.step({
  "line": 40,
  "name": "I click on faqs that i want",
  "keyword": "Then "
});
formatter.match({
  "location": "crosswordHep.i_am_logged_in_to_the_website()"
});
formatter.result({
  "duration": 22855785800,
  "status": "passed"
});
formatter.match({
  "location": "crosswordHep.i_have_clicked_on_to_the_Help()"
});
formatter.result({
  "duration": 2248492300,
  "status": "passed"
});
formatter.match({
  "location": "crosswordHep.i_click_on_faqs_that_i_want()"
});
formatter.result({
  "duration": 505439600,
  "status": "passed"
});
formatter.scenario({
  "line": 45,
  "name": "logout",
  "description": "",
  "id": "crossword-website;logout",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 44,
      "name": "@TC_05_Crossword"
    }
  ]
});
formatter.step({
  "line": 46,
  "name": "I am logged on the website",
  "keyword": "Given "
});
formatter.step({
  "line": 47,
  "name": "I click the logout button",
  "keyword": "When "
});
formatter.step({
  "line": 48,
  "name": "I received that iam logged out",
  "keyword": "Then "
});
formatter.match({
  "location": "CrosswordLogout.i_am_logged_on_the_website()"
});
formatter.result({
  "duration": 21589282300,
  "status": "passed"
});
formatter.match({
  "location": "CrosswordLogout.i_click_the_logout_button()"
});
formatter.result({
  "duration": 4985306400,
  "status": "passed"
});
formatter.match({
  "location": "CrosswordLogout.i_received_that_iam_logged_out()"
});
formatter.result({
  "duration": 248500,
  "status": "passed"
});
});