@sanity
Feature: Login to Bank Application
  
  In order to Login to a Bank Application
  As a User
  I want to enter username and password for successful login

  Background: 
    Given User Navigates to Bank Application
    When Verifies the Bank Application Logo

  Scenario: As a User Login to Bank Application
    Then Enter valid username
    And Enter valid password
    Then User should logon to application

  Scenario: As a User Login to Bank Application as a Invalid user
    Then Enter invalid username
    And Enter invalid password
    Then User shouldnot logon to application
