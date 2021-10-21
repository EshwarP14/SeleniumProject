Feature: Validation on Car Search Page
In Order to Validate Car Search
As a buyer
I navigate to https://www.carsguide.com.au/

Scenario: Searching for a new car
Given i am on homepage https://www.carsguide.com.au/ for carsguide.com
When i move to carsale menu
Then click on make dropdown and select BMW
Then Click on model and 1Series
And Click on Search button
And Verify BMW related cars are displaying