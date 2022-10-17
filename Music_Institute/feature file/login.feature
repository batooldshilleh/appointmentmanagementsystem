Feature: Login
The user wants to access his personal account

Background: 
Given table
|username|password     |
|batool  |b|
|manar   |m      |

@tag1
Scenario: login successfully
	Given that the user is not logged in
	And  The user has entered all the data correctly  "email" , "password"
	Then the user is logged in successfully
	
@tag2
Scenario: username error
  Given that the user is not logged in
	And "username" is not in the database
	Then Show "The username entered is incorrect" message.
	
@tag3
Scenario: password error
  Given that the user is not logged in
	And the "password" not in database
	Then Show masseg "The password entered is incorrect" 