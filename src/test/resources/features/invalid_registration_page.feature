@invalid_registration
  Feature: System should not allow anyone to register with invalid credentials seeing the message
    Background: User is on registration page
      Given user on home page
      And user clicks on the webelement on the right top corner
      Then user clicks on register
    Scenario: tc_001 SSN on the registration page should not be left blank
      Then blank ssn
    Then user puts a name
    Then user puts a last name
    Then user puts an address
    Then user puts a phone number
    Then user puts a username
    Then user puts an email
    Then user sets a password "Password123"
    Then user confirm the password "Password123"
    Then user completes registration by clicking on register button
      Then assert registration is successful
    Scenario: tc_001 name on the registration page should not be left blank
      Then user puts a valid ssn
      Then blank name
      Then user puts a last name
      Then user puts an address
      Then user puts a phone number
      Then user puts a username
      Then user puts an email
      Then user sets a password "Password123"
      Then user confirm the password "Password123"
      Then user completes registration by clicking on register button
      Then assert registration is successful
    Scenario: tc_001 last name  on the registration page should not be left blank
      Then user puts a valid ssn
      Then user puts a name
      Then blank last name
      Then user puts an address
      Then user puts a phone number
      Then user puts a username
      Then user puts an email
      Then user sets a password "Password123"
      Then user confirm the password "Password123"
      Then user completes registration by clicking on register button
      Then assert registration is successful

    Scenario: tc_001 phone number on the registration page should not be left blank
      Then user puts a valid ssn
      Then user puts a name
      Then user puts a last name
      Then user puts an address
      Then blank phone number
      Then user puts a username
      Then user puts an email
      Then user sets a password "Password123"
      Then user confirm the password "Password123"
      Then user completes registration by clicking on register button
      Then assert registration is successful
    Scenario: tc_001 username on the registration page should not be left blank
      Then user puts a valid ssn
      Then user puts a name
      Then user puts a last name
      Then user puts an address
      Then user puts a phone number
      Then blank username
      Then user puts an email
      Then user sets a password "Password123"
      Then user confirm the password "Password123"
      Then user completes registration by clicking on register button
      Then assert registration is successful
    Scenario: tc_001 email on the registration page should not be left blank
      Then user puts a valid ssn
      Then user puts a name
      Then user puts a last name
      Then user puts an address
      Then user puts a phone number
      Then user puts a username
      Then blank email
      Then user sets a password "Password123"
      Then user confirm the password "Password123"
      Then user completes registration by clicking on register button
      Then assert registration is successful
    Scenario: tc_001 password on the registration page should not be left blank
      Then user puts a valid ssn
      Then user puts a name
      Then user puts a last name
      Then user puts an address
      Then user puts a phone number
      Then user puts a username
      Then user puts an email
      Then user sets a password
      Then user confirm the password "Password123"
      Then user completes registration by clicking on register button
      Then assert registration is successful
    Scenario: tc_001 confirm the password on the registration page should not be left blank
      Then user puts a valid ssn
      Then user puts a name
      Then user puts a last name
      Then user puts an address
      Then user puts a phone number
      Then user puts a username
      Then user puts an email
      Then user sets a password "Password123"
      Then the blank confirm the password
      Then user completes registration by clicking on register button
      Then assert registration is successful



