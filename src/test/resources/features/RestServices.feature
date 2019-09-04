#Author: mohd.jeeshan@mindtree.com
Feature: Testing the rest services
  I want to test rest services using rest assured

  @RestApi
  Scenario: Getting the product information using the GET request
    Given Headers are given
    When I send the GET request to URI with product ID
      | URI       | http://api.axone-tech.uk/ProductInventory/ |
      | productID | getProduct?productId=1007                  |
    Then I verify the status code
      | statusCode | 200 |
    Then I verify the status Line
      | statusLine | HTTP/1.1 200 OK |
    Then I verfiy product name product number product price
      | productName   | ProductName7 |
      | productNumber |         1007 |
      | productPrice  |         48.5 |
