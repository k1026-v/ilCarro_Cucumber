
Feature: Login

   @validData
  Scenario: Login with valid data
     Given User launches browser
     When User opens ilCarro Home Page
     And User clicks on log in link
     And User enters valid data
     And User clicks ov Yalla button
     Then User verifies log in message
      And User quits browser


      @wrongPassword
      Scenario Outline: Login with valid email and wrong password
         Given User launches browser
         When User opens ilCarro Home Page
         And User clicks on log in link
         And User enters email and wrong password
            |email|password|
            | <email>    |     <password>   |

         And User clicks ov Yalla button
         Then User verifies error
         And User quits browser
         Examples:
            | email | password |
         |kiv@ukr.net |123456|
         |kiv@ukr.net |123456758C|
         |kiv@ukr.net |12345678c!|
         |kiv@ukr.net |1234456789!|