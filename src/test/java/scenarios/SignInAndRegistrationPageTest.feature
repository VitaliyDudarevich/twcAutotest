 Feature: Sign in and registration page



  Scenario Outline: Sign in with valid credentials
    Given I'm on the "sign in and registration page"
    When Try to sign in with valid <email> and <password>
    Then Successfully logged in
    Examples:
      |email        |password   |
      |DV@test.test |Test922922 |

 #Scenario Outline: Try to sign in with invalid credentials
 #  Given I'm on the "sign in and registration page"
 #  When Try to sign in with invalid <email> or invalid <password>
 #  Then The validation message "We don't recognise your details. Please check your email and password and try again" is shown
 # Examples:
 #  | email                 |password           |
 #  |email                  |password           |
 #  |email@                 |password           |
 #   |email@test             |password           |
 #   |                       |password           |
 #   |DV@test.test           |                   |
 #   |                       |                   |
 #   |email@test.            |password           |
 #   |email@@test.test       |password           |
 #   |email email@test.test  |password           |
 #   |DV@test.test           |incorrectpassword  |
 #   |DV@test.test           |""                 |


#
#  Scenario: Try to sign in with empty credentials
#    Given I'm on the Sign in and registration page
#    When Try to sign in with empty login and empty password
#    Then The validation message is shown