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
  "name": "I go to \"url\" on \"browser\"",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "url",
      "offset": 9
    },
    {
      "val": "browser",
      "offset": 18
    }
  ],
  "location": "login_test.opening_app_on_browser(String,String)"
});
formatter.result({
  "duration": 32681226250,
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
  "duration": 362046885,
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
  "duration": 87146883,
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
  "duration": 4139480528,
  "error_message": "org.openqa.selenium.WebDriverException: Failed to decode response from marionette\nBuild info: version: \u0027unknown\u0027, revision: \u0027unknown\u0027, time: \u0027unknown\u0027\nSystem info: host: \u0027WIN-GL1UE556P6A\u0027, ip: \u0027192.168.0.7\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_91\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities [{moz:profile\u003dC:\\Users\\Srinivas\\AppData\\Local\\Temp\\rust_mozprofile.rk3WvNpUE5jU, rotatable\u003dfalse, timeouts\u003d{implicit\u003d0.0, pageLoad\u003d300000.0, script\u003d30000.0}, pageLoadStrategy\u003dnormal, platform\u003dANY, specificationLevel\u003d0.0, moz:accessibilityChecks\u003dfalse, acceptInsecureCerts\u003dfalse, browserVersion\u003d55.0.3, platformVersion\u003d6.1, moz:processID\u003d7560.0, browserName\u003dfirefox, javascriptEnabled\u003dtrue, platformName\u003dwindows_nt}]\nSession ID: 6e50acef-b4d7-4934-8b40-70e6f9f2e90e\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:150)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:115)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:45)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:82)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:637)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:272)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:82)\r\n\tat com.salesforce.java.login.Click_button(login.java:47)\r\n\tat com.salesforce.java.login_test.click_button(login_test.java:33)\r\n\tat ✽.And I click on \"login\" button(com\\salesforce\\java\\feature\\login.feature:12)\r\n",
  "status": "failed"
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
  "status": "skipped"
});
});