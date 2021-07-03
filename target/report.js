$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/login.feature");
formatter.feature({
  "name": "To validate the function of facebook application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user should be launch ChromeBrowser and enter the url",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_should_be_launch_ChromeBrowser_and_enter_the_url()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validating the facebook applicatio  with invalid username and password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.step({
  "name": "user is going to enter username and password field",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_is_going_to_enter_username_and_password_field()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: Cannot locate an element using By.all({By.xpath: //input[@id\u003d\u0027emaDEGIFDil\u0027],By.xpath: //input[@name\u003d\u0027emSIEFGail\u0027]})\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-E2V5VNP\u0027, ip: \u0027192.168.43.130\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002714.0.2\u0027\nDriver info: driver.version: RemoteWebDriver\r\n\tat org.openqa.selenium.support.pagefactory.ByAll.findElement(ByAll.java:58)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy20.sendKeys(Unknown Source)\r\n\tat org.base.BaseClass.fill(BaseClass.java:60)\r\n\tat org.steps.StepDefinition.user_is_going_to_enter_username_and_password_field(StepDefinition.java:25)\r\n\tat ✽.user is going to enter username and password field(file:src/test/resources/login.feature:9)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user should be click to login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_should_be_click_to_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user should be navigate to credential page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_should_be_navigate_to_credential_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user should be launch ChromeBrowser and enter the url",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_should_be_launch_ChromeBrowser_and_enter_the_url()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validating the facebook with invalid username and invalid password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.step({
  "name": "user is going to enter username and password",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_is_going_to_enter_username_and_password()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: Cannot locate an element using By.all({By.xpath: //input[@id\u003d\u0027emaDEGIFDil\u0027],By.xpath: //input[@name\u003d\u0027emSIEFGail\u0027]})\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-E2V5VNP\u0027, ip: \u0027192.168.43.130\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002714.0.2\u0027\nDriver info: driver.version: RemoteWebDriver\r\n\tat org.openqa.selenium.support.pagefactory.ByAll.findElement(ByAll.java:58)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy20.sendKeys(Unknown Source)\r\n\tat org.base.BaseClass.fill(BaseClass.java:60)\r\n\tat org.steps.StepDefinition.user_is_going_to_enter_username_and_password(StepDefinition.java:49)\r\n\tat ✽.user is going to enter username and password(file:src/test/resources/login.feature:17)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user should be click to login btn",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_should_be_click_to_login_btn()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user should be navigate to error page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_should_be_navigate_to_error_page()"
});
formatter.result({
  "status": "skipped"
});
});