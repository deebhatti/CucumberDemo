Feature: Testing the login functionality of the application

  Background:
    Given the user is on the home page of the application

   @regression
  Scenario: Testing the application with valid username and valid password
    When he enter is valid username
    And his valid password
    Then he must be able to login into the application successfully

  @pizza
  Scenario Outline: Testing the application with invalid usernames and passwords
    When he enters invalid "<username>"
    And he enters his invalid "<password>"
    Then he must not be able to login
    Examples:
    |username         |password     |
    |test1            |password1    |
    |test2            |password2    |
    |test3            |password3    |