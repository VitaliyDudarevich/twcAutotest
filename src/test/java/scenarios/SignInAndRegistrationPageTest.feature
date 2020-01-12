Feature: Sign in and registration page

  Scenario: Sign in with valid credentials
    Given I'm on the Sign in and registration page
    When Try to sign in with valid login and valid password
    Then Successfully logged in

#  Scenario: Try to sign in with invalid credentials
#    Given I'm on the Sign in and registration page
#    When Try to sign in with an invalid login and a password
#    Then The validation message is shown
#
#  Scenario: Try to sign in with empty credentials
#    Given I'm on the Sign in and registration page
#    When Try to sign in with empty login and empty password
#    Then The validation message is shown