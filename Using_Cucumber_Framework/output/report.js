$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("com\\salesforce\\java\\feature\\login.feature");
formatter.feature({
  "line": 1,
  "name": "Logging into Salesforce",
  "description": "\r\nIn order to work\r\nAs a sales person\r\nI want to login",
  "id": "logging-into-salesforce",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 7,
  "name": "Logging in Salesforce",
  "description": "",
  "id": "logging-into-salesforce;logging-in-salesforce",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "I go to \"url\" on \"Mozilla\"",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "url",
      "offset": 9
    },
    {
      "val": "Mozilla",
      "offset": 18
    }
  ],
  "location": "login_test.opening_app_on_browser(String,String)"
});
formatter.result({
  "duration": 17033549096,
  "status": "passed"
});
formatter.step({
  "line": 10,
  "name": "I enter \"username_element\" as \"username\"",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "username_element",
      "offset": 9
    },
    {
      "val": "username",
      "offset": 31
    }
  ],
  "location": "login_test.type_in_value(String,String)"
});
formatter.result({
  "duration": 196547234,
  "status": "passed"
});
formatter.step({
  "line": 11,
  "name": "I enter \"password_element\" as \"password\"",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "password_element",
      "offset": 9
    },
    {
      "val": "password",
      "offset": 31
    }
  ],
  "location": "login_test.type_in_value(String,String)"
});
formatter.result({
  "duration": 54730295,
  "status": "passed"
});
formatter.step({
  "line": 12,
  "name": "I click on \"login\" button",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "login",
      "offset": 12
    }
  ],
  "location": "login_test.click_button(String)"
});
formatter.result({
  "duration": 2087431126,
  "status": "passed"
});
formatter.step({
  "line": 13,
  "name": "Login should be \"Success\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Success",
      "offset": 17
    }
  ],
  "location": "login_test.verify_login(String)"
});
formatter.result({
  "duration": 74073,
  "status": "passed"
});
});