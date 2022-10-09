Feature: Login
The user wants to access his personal account

Background: 
Given table
|username|password     |type|
|batool  |"2001"|"s"   |
|manar   |"m2#m"       |"t"   |

@tag1
Scenario: The login process has been completed successfully1
	Given that the user is not logged in
	And  The user has entered all the data correctly  "email"," password"
	When the Type "t"
	Then show tehar menu

@tag2
Scenario: username error
  Given that the user is not logged in
	And "username" is not in the database
	Then Show "The email entered is incorrect" message.
	
@tag3
Scenario: password error
  Given that the user is not logged in
	And the "password" not in database
	Then Show masseg "The password entered is incorrect" 
