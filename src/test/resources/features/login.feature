Feature: Login feature in demoqa.com
  As a user go to BooksStore
  I want to take book
  So that I can see list my BooksStore

  Scenario: Login Success
    Given I am on the Login page
    When I enter my username and Password correctly
    When I click 'Login' button
    Then I am taken to the dashboard

  Scenario: Login Invalid Username
    Given I am on the Login page1
    When I enter my username and Password correctly
    When I click 'Login' button1
    Then I cannot to the homepage

  Scenario: Login Invalid Pass
    Given I am on the Login page2
    When I enter my username and Password correctly
    When I click 'Login' button2
    Then I cannot to the homepage2

