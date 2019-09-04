@AutomatedTests
Feature: Staff Process Cancellation
    As a staff member
    I can cancel a user's bagdrop process

  Scenario: Cancel process by agent
    Given the process is activated
    And a passenger identifies himself using a boarding pass
    When the staff member presents a staff badge
    And cancels the bagdrop process
    Then the bagdrop process should be canceled
