Feature: To test "saucedemo" site

  Scenario Outline: To verify saucedemo site
    Given User opens up the browser
    Then user enters saucedemo site
    Then I enter "<username>" and "<password>"

    Examples: 
      | username                | password     |
      | locked_out_user         | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |
      | error_user              | secret_sauce |
