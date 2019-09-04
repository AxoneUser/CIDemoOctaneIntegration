@AutomatedTests
Feature: Accessibility

  Background: 
    Given the process is activated
    And passenger has scanned his boardingpass

  Scenario: Extended timeout on scan passport
    When the passenger is asked to scan his passport
    And the passenger enabled accessibility mode
    Then process should not time out after 6 seconds
    And the passenger can continue his process

  Scenario: Reset timeout to default on scan passport
    When the passenger is asked to scan his passport
    And the passenger enabled accessibility mode
    Then process should not time out after 6 seconds
    When the passenger disabled accessibility mode
    Then the process should time out after 5 seconds

  Scenario: Speak welcome message on start Accessibility Mode
    When the passenger is asked to scan his passport
    And the passenger enabled accessibility mode
    Then the welcome message should be spoken
