Feature: Login


Scenario Outline: As an admin user I want to login to the system

  Given I navigate to the site
  Then I capture "<username>" and "<password>"
  Then I click login button
  And I see the actual message
  Examples:
    | username                    | password   |
    | nmagidi@inspiredtesting.com | Agnes1952! |
