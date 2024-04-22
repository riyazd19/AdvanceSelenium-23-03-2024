Feature: To verify random things in google
    
   # @high
  Scenario: verify random things in google page
    Given user fires up the laptop and browser is open
    When user enters "https://google.com" as url
    Then user is navigated to google page user needs to check the title of page to verify

		#@medium
  #Scenario: To create a facebook account
   # Given user enters facebook keyword in google page
   # Then facebook login page is displayed and user is have to verify the page is correct
  #  Then user clicks on signIn option and verify the page

	#	@low
  #Scenario Outline: To verify the various functionality in saucedemo site
  #  Given user enters the sausedemo site in browser
  # Then user verifies sausedemo  page is dispalyed
   # When enters "<username>" and "<password>" in respective fields

   # Examples: 
    #  | username      | Passowrd     |
   #   | standard_user | secret_sauce |
