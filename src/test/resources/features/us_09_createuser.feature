@us_09
Feature: Create a user
  Background: User in create customer page
    Given user is on the this page "homepage_url"
    Then user click on sign in button
    Then user enters username "alicanpass"
    And user enters password "Alican_01!"
    And clicks on sign_in button

  Scenario Outline:create or editing customer
    Given user click on manage customer link
    Then user click on create a new user button
    When user write SSN of customer and click on search button"<ssn>"
    Then green alert show up
    Then verify firstname is exist same as registration info"<firstname>"
    Then verify lastname is exist same as registration info"<lastname>"
    Then verify address is exist "<address>"
    Then verify mobile number is exist"<mobile>"
    Then verify ssn is exist"<ssn>"
    Then verify email is exist"<email>"
    Then close the application
    Examples: customers
    |ssn        | firstname|lastname|address  |mobile      |ssn         |email                |
    |400-02-0222| xxx345   |xxx345  |Newyork  |888-555-6666|400-02-0222 | xxx345@gmail.com    |
    |401-02-0222|Ali       |Can     |Newyork  |888-963-8521|401-02-0222 |alican_01@hotmail.com|





