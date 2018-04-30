$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Application.feature");
formatter.feature({
  "line": 2,
  "name": "",
  "description": "Testing Goibibo high level functionality",
  "id": "",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 6,
  "name": "To test the feature of total amount and payment button in the payment page",
  "description": "",
  "id": ";to-test-the-feature-of-total-amount-and-payment-button-in-the-payment-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I am in Goibibo website",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I enter flight from \"Bangalore\" to \"Mumbai\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I click on Departure day for the next day",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click on Return day for after 2 days",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I click on Get Set Go button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I select earliest departure for both days",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I click on Book button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I should be able to see the Total Amount",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "I should be able to see the Payment button",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Application should get closed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepsClass.i_am_in_Goibibo_website()"
});
formatter.result({
  "duration": 15579657536,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bangalore",
      "offset": 21
    },
    {
      "val": "Mumbai",
      "offset": 36
    }
  ],
  "location": "StepsClass.i_enter_flight_from_to(String,String)"
});
formatter.result({
  "duration": 4854187470,
  "status": "passed"
});
formatter.match({
  "location": "StepsClass.i_click_on_Departure_day_for_the_next_day()"
});
formatter.result({
  "duration": 201977280,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 32
    }
  ],
  "location": "StepsClass.i_click_on_Return_day_for_after_days(int)"
});
formatter.result({
  "duration": 361771016,
  "status": "passed"
});
formatter.match({
  "location": "StepsClass.i_click_on_Get_Set_Go_button()"
});
formatter.result({
  "duration": 10126948791,
  "status": "passed"
});
formatter.match({
  "location": "StepsClass.i_select_earliest_departure_for_both_days()"
});
formatter.result({
  "duration": 32452212314,
  "status": "passed"
});
formatter.match({
  "location": "StepsClass.i_click_on_Book_button()"
});
formatter.result({
  "duration": 783296097,
  "status": "passed"
});
formatter.match({
  "location": "StepsClass.i_should_be_able_to_see_the_Total_Amount()"
});
formatter.result({
  "duration": 1806368283,
  "status": "passed"
});
formatter.match({
  "location": "StepsClass.i_should_be_able_to_see_the_Payment_button()"
});
formatter.result({
  "duration": 3139010152,
  "status": "passed"
});
formatter.match({
  "location": "StepsClass.application_should_get_closed()"
});
formatter.result({
  "duration": 150022454,
  "status": "passed"
});
});