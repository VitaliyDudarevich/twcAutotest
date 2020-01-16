 Feature: Sign in and registration page5



  Scenario Outline: Sign in with valid credentials 2
    Given I'm on the "sign in and registration page"
    When Try to sign in with valid <email> and <password>
    Then Successfully logged in
    Examples:
      |email        |password   |
      |DV@test.test |Test922922 |

#  Scenario: Try to sign in with invalid credentials
#    Given I'm on the Sign in and registration page
#    When Try to sign in with an invalid login and a password
#    Then The validation message is shown
#
#  Scenario: Try to sign in with empty credentials
#    Given I'm on the Sign in and registration page
#    When Try to sign in with empty login and empty password
#    Then The validation message is shown