@activity6

Feature: Data driven test with table

Scenario: Testing the to-do app
	Given user is on the to-do list page
	When user provides the following tasks
		|Task1|
		|Task2|
		|Task3|
	Then they can see the task added to the list