#Author:Stephanie Cortes Julio

Feature: Log in web page Codepen
  As a user
  I want to log in web page Codepen

  Scenario: Log in web page Codepen successful
    Given Stephanie has an active account
    When she sends their valid credentials
    Then she should have access to her account

    #Another option is a scenario outline when you have values that can change in the future or doing dynamic scenarios
#  Scenario Outline: Verify Login Functionality
#    Given There is a user "<username>" and <password>"
#    When I login to the application
#    Examples:
#      |username|password|
#      |user1|pass1|
#      |user2|pass2|
#