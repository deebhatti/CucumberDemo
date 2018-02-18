Feature: Various validations on Linkedin

  Background:
    Given the user is on the login page

  @sanity
  Scenario: Verify if Sign In button is enabled or not
    And he checks if the signin button is enabled or not
    Then it must not be enabled

  @regression
  Scenario: Verify the title of landing page
    And he checks the title
    Then it must be equal to "LinkedIn: Log In or Sign Up"