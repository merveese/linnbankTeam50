@invalid_registration
  Feature: System should not allow anyone to register with invalid credentials seeing the message
    Background: User is on registration page
      Given user on home page
      And user clicks on the webelement on the right top corner
      Then user clicks on register
    Scenario: Any field on the registration page should not be left blank
      Then user puts a valid ssn
#    Then user puts a name
#    Then user puts a last name
#    Then user puts an address
#    Then user puts a phone number
#    Then user puts a username
#    Then user puts an email
#    Then user sets a password
#    Then user confirm the password
#    Then user completes registration by clicking on register button

