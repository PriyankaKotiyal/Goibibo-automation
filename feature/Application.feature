@tag
Feature: 
  Testing Goibibo high level functionality

  @tag1
  Scenario: To test the feature of total amount and payment button in the payment page
    Given I am in Goibibo website
    When I enter flight from "Bangalore" to "Mumbai"
    And I click on Departure day for the next day
    And I click on Return day for after 2 days
    And I click on Get Set Go button
    And I select earliest departure for both days
    And I click on Book button
    Then I should be able to see the Total Amount
    Then I should be able to see the Payment button
    Then Application should get closed
