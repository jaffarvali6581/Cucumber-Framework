Feature: HomePage feature

  Background: 
    Given user already logged in to application
      | userName   |  | password |
      | mngr369625 |  | ezYnamU  |

  Scenario: Home page title
    Given user is on homepage
    When user gets the homepage title
    Then page title should be"Guru99 Bank Manager HomePage"

  Scenario: selecting new tours section
    Given user is on homepage
    When user click the tours section
    Then tile of tours page section is "Welcome: Mercury Tours"
