$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("TC002_PMT_productrelated.feature");
formatter.feature({
  "line": 1,
  "name": "PMT Add Product List",
  "description": "Description: User will add product category,sub category \u0026 part description",
  "id": "pmt-add-product-list",
  "keyword": "Feature"
});
formatter.before({
  "duration": 28112633200,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Adding product category",
  "description": "",
  "id": "pmt-add-product-list;adding-product-category",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Sanitycheck12"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User will mouse hover and choose the product category page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User will click on the add button and add a new category",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User will enter the category name and choose the equivalent PIES category",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User will successfully added and verify that the record has come",
  "keyword": "Then "
});
formatter.match({
  "location": "TC002_PMT_productrelated.user_will_mouse_hover_and_choose_the_product_category_page()"
});
formatter.result({
  "duration": 14513085000,
  "status": "passed"
});
formatter.match({
  "location": "TC002_PMT_productrelated.user_will_click_on_the_add_button_and_add_a_new_category()"
});
formatter.result({
  "duration": 3577652200,
  "status": "passed"
});
formatter.match({
  "location": "TC002_PMT_productrelated.user_will_enter_the_category_name_and_choose_the_equivalent_PIES_category()"
});
formatter.result({
  "duration": 6398110100,
  "status": "passed"
});
formatter.match({
  "location": "TC002_PMT_productrelated.user_will_successfully_added_and_verify_that_the_record_has_come()"
});
formatter.result({
  "duration": 6121000,
  "error_message": "org.openqa.selenium.NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027DT0172\u0027, ip: \u0027192.168.100.147\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_201\u0027\nDriver info: driver.version: RemoteWebDriver\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:125)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:605)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.getScreenshotAs(RemoteWebDriver.java:294)\r\n\tat pmt.reports.ExtentReport.Screenshotcapture(ExtentReport.java:84)\r\n\tat pmt.reports.ExtentReport.TestStep(ExtentReport.java:61)\r\n\tat pmttestcases.stepdefinition.TC002_PMT_productrelated.user_will_successfully_added_and_verify_that_the_record_has_come(TC002_PMT_productrelated.java:103)\r\n\tat ✽.Then User will successfully added and verify that the record has come(TC002_PMT_productrelated.feature:9)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 64100,
  "status": "passed"
});
});