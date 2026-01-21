Feature: Wikipedia Search

Scenario Outline: Search for programming languages

	Given I am on Wikipedia homepage
	When I search for "<keyword>"
	Then I should see a heading that says "<expectedMessage>"

	Examples:
		| keyword | expectedMessage |
		| Selenium (software) | Selenium (software) |
      	| Python (programming language) | Python (programming language) |