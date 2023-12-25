@login
Feature: verifying the Adactin Hotel Automation

  Scenario Outline: verifying the Login with valid Credentials
    Given User is on the Hotel page
    When User Enter the "<username>" and "<password>"
    Then User Should verify the login success message "Welcome to Adactin Group of Hotels"

    Examples: 
      | username  | password |
      | vignesh94 | ED1P32   |

  Scenario Outline: verifying the login with Invalid credenntials
    Given User is on the Hotel page
    When User Enter the invalid  "<username>" and "<password>"
    Then User Should verify the error message "Invalid Login details or Your Password might have expired"

    Examples: 
      | username  | password |
      | vignesh94 | qwerwer  |
