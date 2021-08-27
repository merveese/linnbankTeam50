@testing
Feature: All regisrants Info
  Background: User is on registration page
    Given user on home page
    And user clicks on the webelement on the right top corner
    Then user clicks on register
  Scenario:TC_01_
    Then user puts a valid ssn
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









