@bvt
Feature: Login
  
  In Order to Perform Successful Login
  As a User
  I want to enter correct username and password

  Scenario Outline: In order to verify facebook login
    Given user Navigates to facebook website
    When user verifies facebook logo
    Then user enters "<username>" username
    And user enter "<password>" password
    And user select the age and location
      | Age      | location |
      | below 18 | india    |
      | above 18 | USA      |
    Then user "<loginType>" login to facebook successfully

    Examples: 
      | username | password | loginType |
      | valid    | valid    | should    |
      | invalid  | invalid  | shouldnot |
