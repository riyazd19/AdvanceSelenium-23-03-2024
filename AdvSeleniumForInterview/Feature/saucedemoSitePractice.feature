Feature: To test saucedemo site

  Scenario Outline: To verify saucedemo site
    Given User opens up the browser
    Then user enters saucedemo site
    Then I enter "<username>" and "<password>"

    Examples: 
      | username      | password     |
      | standard_user | secret_sauce |
