Feature: Adding the car

  @addValidCar
  Scenario: Adding the car with valid data
    Given User launches browser
    When User opens ilCarro Home Page
    And User clicks on log in link
    And User enters valid data
    And User clicks ov Yalla button
    And User accepts log in message
    And User clicks on Let the car work link
    And User selects location
    And User enters valid car details
    And User selects fuel
    And User selects number of seats
    And User continues enter valid car details
    And User uploads file
    And User clicks on Submit button
    Then User verifies Car added message
    And User quits browser