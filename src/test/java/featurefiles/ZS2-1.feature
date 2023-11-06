@BDDSTORY-ZS2-1
Feature: Login page functionality



	@BDDTEST-ZS2-3
	@BDDVER-10004
	@BDDCYC-79f2c96b-14cd-4075-aeef-56c135b5763a
	Scenario Outline: Verify Login with Valid and Invalid Credentials
	
		Given the user is on the login page
		When  the user enters username "<username>" and password "<password>"
		Then  the user should receive "<expected message>"
		   Examples:
		     | username      | password     | expected message          |
		     | standard_user | secret_sauce | Login successful!         |
		     | abc           | secret_sauce | Invalid username/password |
		     | standard_user | abc          | Invalid username/password |
		     | abc           | abc          | Invalid username/password |

