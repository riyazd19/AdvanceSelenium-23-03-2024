Feature: To test background keyword in saucedemo site
  
  
  Before: 
  Given User and opens a browser in chrome

  Scenario Outline: To verify background keyword in sauce demo
    Then user is enters sausedemo site
    Then user are populates "<username>" and "<password>"

    Examples: 
      | username                | password     |
      | locked_out_user         | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |
      | error_user              | secret_sauce |
