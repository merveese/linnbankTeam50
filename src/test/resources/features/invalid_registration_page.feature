@invalid_registration
  Feature: System should not allow anyone to register with invalid credentials seeing the message
    Scenario: Any field on the registration page should not be left blank
      Given user on home page
      And user click on registration page

