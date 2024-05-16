Feature: Login funtionlity

@Test
Scenario Outline: Verify successful login when username and password is correct
Given User Launch site URL
When Enter correct "<username>" and "<password>"
And Click on login button
Then Validate successful login

Examples:
|username | password|
|Demo1 | Azhar123|	
|Demo2 | Azhar234|
|Demo3 | Azhar345|
|standard_user | secret_sauce|