$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("PMT_productrelated.feature");
formatter.feature({
  "line": 1,
  "name": "PMT Add Product List",
  "description": "Description: User will add product category,sub category \u0026 part description",
  "id": "pmt-add-product-list",
  "keyword": "Feature"
});
formatter.before({
  "duration": 23287776200,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Adding product sub category",
  "description": "",
  "id": "pmt-add-product-list;adding-product-sub-category",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@productrelated3"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "User will go to master and choose product sub category",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "User will click on the add button and choose the category drop down list",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "User will enter the sub category name and choose the equivalent and save button is clicked",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User will successfully added and verify the record has come in the sub category grid",
  "keyword": "Then "
});
formatter.match({
  "location": "TC002_PMT_productrelated.user_will_go_to_master_and_choose_product_sub_category()"
});
formatter.result({
  "duration": 7602972000,
  "status": "passed"
});
formatter.match({
  "location": "TC002_PMT_productrelated.user_will_click_on_the_add_button_and_choose_the_category_drop_down_list()"
});
formatter.result({
  "duration": 5759132500,
  "status": "passed"
});
formatter.match({
  "location": "TC002_PMT_productrelated.user_will_enter_the_sub_category_name_and_choose_the_equivalent_and_save_button_is_clicked()"
});
formatter.result({
  "duration": 2984835300,
  "status": "passed"
});
formatter.match({
  "location": "TC002_PMT_productrelated.user_will_successfully_added_and_verify_the_record_has_come_in_the_sub_category_grid()"
});
formatter.result({
  "duration": 8699693700,
  "status": "passed"
});
formatter.after({
  "duration": 971828300,
  "status": "passed"
});
});