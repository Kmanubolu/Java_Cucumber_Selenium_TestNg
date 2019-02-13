$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("resources/Features/login.feature");
formatter.feature({
  "line": 2,
  "name": "login and search room in hotel application",
  "description": "As a user I want to login and search for the room",
  "id": "login-and-search-room-in-hotel-application",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@SmokeTest"
    }
  ]
});
formatter.scenarioOutline({
  "line": 6,
  "name": "login to the application and search room",
  "description": "",
  "id": "login-and-search-room-in-hotel-application;login-to-the-application-and-search-room",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "User is able Launch the hotel application using \"\u003cURL\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User enters the \"\u003cuserId\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User clicks the Log in button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User naviaged to home page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "LogOut application",
  "keyword": "And "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "login-and-search-room-in-hotel-application;login-to-the-application-and-search-room;",
  "rows": [
    {
      "cells": [
        "URL",
        "userId",
        "password"
      ],
      "line": 13,
      "id": "login-and-search-room-in-hotel-application;login-to-the-application-and-search-room;;1"
    },
    {
      "cells": [
        "http://adactin.com/HotelApp/index.php",
        "kmanubolu",
        "India@123"
      ],
      "line": 14,
      "id": "login-and-search-room-in-hotel-application;login-to-the-application-and-search-room;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 3955574536,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "login to the application and search room",
  "description": "",
  "id": "login-and-search-room-in-hotel-application;login-to-the-application-and-search-room;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "User is able Launch the hotel application using \"http://adactin.com/HotelApp/index.php\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User enters the \"kmanubolu\" and \"India@123\"",
  "matchedColumns": [
    1,
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User clicks the Log in button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User naviaged to home page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "LogOut application",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "http://adactin.com/HotelApp/index.php",
      "offset": 49
    }
  ],
  "location": "SetpDefinition.user_is_able_Launch_the_hotel_application_using(String)"
});
formatter.result({
  "duration": 2557092520,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "kmanubolu",
      "offset": 17
    },
    {
      "val": "India@123",
      "offset": 33
    }
  ],
  "location": "SetpDefinition.user_enters_the_and(String,String)"
});
formatter.result({
  "duration": 1249851950,
  "status": "passed"
});
formatter.match({
  "location": "SetpDefinition.user_clicks_the_Log_in_button()"
});
formatter.result({
  "duration": 2684266791,
  "status": "passed"
});
formatter.match({
  "location": "SetpDefinition.user_naviaged_to_home_page()"
});
formatter.result({
  "duration": 107516797,
  "status": "passed"
});
formatter.match({
  "location": "SetpDefinition.LogOut_application()"
});
formatter.result({
  "duration": 1212425398,
  "status": "passed"
});
formatter.after({
  "duration": 905470853,
  "status": "passed"
});
});;