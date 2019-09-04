#Auto generated Octane revision tag
@TID11001REV0.4.0
Feature:Create delayed bag
  I want to create AHL with Lufthansa airline
  
Scenario: Delayed bag creation
    Given I navigate to Lufthansa URL and accept the cookies
    When I Click on Report a delayed Bag image and click on continue button in popup
    Then I will land On flight page
    When I will enter the flight details page data and click on Continue button
      | flightNumber | LH1234 |
    Then I will land on baggage Details page data and enter the required information on the page
    Then click on continue button and navigate to Passenger details page
    Then I will enter the data on passenger details page
  		 |title|Mr|
      | givenName    | Mohd                      |
      | familyName   | Jeeshan                   |
      | country      | Australia (61)            |
      | mobileNumber |               09988776655 |
      | email        | mohd.jeeshan@mindtree.com |
    When I click on add home address link
    Then I will fill the data in add home address pop and click on add address button
      | address     | Royal Pavillion |
      | city        | Aldershot       |
      | county      | Hampshire       |
      | countryCode | Australia       |
    Then I will click on continue button
    Then Navigate to the review Page and click on Nothing to declare and click submit button
    Then Store the file refeRence number  print it
    Then close  browser
