Feature: Login Into OrangeHRM
  In order to access homepage
  as registered user
  I want to login

  Scenario: valid login
    Given The regular user is in the login page of orangeHRM
    When the user enter valid credentials
    Then the user will be redirected to the homepage

  Scenario: Invalid login
    Given The regular user is in the login page of orangeHRM
    When the user enter invalid credentials
    Then the error message will apprear called Invalid credentials

  Scenario:  Login with only username without password
    Given The regular user is in the login page of orangeHRM
    When the user enter valid username without password
    Then the message will apprear under the password field called required

  Scenario:  Login with only password without username
    Given The regular user is in the login page of orangeHRM
    When the user enter valid password without username
    Then the message will apprear under the username field called required

  Scenario:  Login with with no credentials
    Given The regular user is in the login page of orangeHRM
    When the user press on login button
    Then the two messages will apprear under the username field and password field called required

