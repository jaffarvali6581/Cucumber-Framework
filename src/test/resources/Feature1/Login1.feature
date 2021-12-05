Feature: Login functionality test

  Scenario: Check login with valid credential
    Given user is on login page
    When user user enters url "http://demo.guru99.com/V4/"
    And user enters username "mngr369625" and password "ezYnamU"
    Then user gets the homepage title "Guru99 Bank Manager HomePage"
    When user clicks the logout link
    Then user  enters gets the login page title "Guru99 Bank Home Page"
