@functional
Feature: Login to Bank Application
  
  In order to Login to a Bank production Application
  As a User
  I want to enter username and password for successful login

  Scenario: As a User Login to Bank Production Application
    Given User Navigates to Bank Application
    When Verifies the Bank Application Logo
    Then Enter valid username
    And Enter valid password
    Then user validates the capcha image
    Then User should logon to application

  Scenario: As a User Login to Bank Application
    Given User Navigates to Bank Application
    When Verifies the Bank Application Logo
    Then Enter invalid username
    And Enter invalid password
    Then user validates the capcha image
    Then User shouldnot logon to application
