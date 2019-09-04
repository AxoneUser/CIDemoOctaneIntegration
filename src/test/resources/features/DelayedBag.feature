@TID4001REV0.3.0
Feature: Create delayed bag
  I want to create AHL with easyJet airline

  Scenario: Delayed bag creation
    Given I navigate to easyJet URL and accept the cookies
    When I Click on Report a delayed Bag Image and click on continue button in popup
    Then I will land on flight page
    When I will Enter the flight details page data and click on Continue button
      | flightNumber | U28869 |
    Then I will land on Baggage Details page data and enter the required information on the page
    Then click on continue button and navigate to passenger details page
    Then I will enter the data on Passenger details page
    	|title|Mr|
      | givenName    | Mohd                      |
      | familyName   | Jeeshan                   |
      | country      | Australia (61)            |
      | mobileNumber |               09988776655 |
      | email        | mohd.jeeshan@mindtree.com |
    When I click on Add home address link
    Then I will fill the data in Add home address pop and click on add address button
      | address     | Royal Pavillion |
      | city        | Aldershot       |
      | county      | Hampshire       |
      | countryCode | Australia       |
    Then I will click on Continue button
    Then Navigate to review page and click on Nothing to declare and click submit button
    Then Store the file reference number and print it
    Then close the browser
