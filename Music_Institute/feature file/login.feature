Feature: Login
The user wants to access his personal account

Background: 
|username|password     |type|
|batool  |"batool@2001"|"s"   |
|manar   |"m2#m"       |"t"   |

@tag1
Scenario: The login process has been completed successfully1
	Given that the admin is not logged in
	And  The user has entered all the data correctly  "email"," password"
	When the Type "t"
	Then show tehar menu
	
	
#@tag2
#Scenario: Incomplete request
	#When  The user left one of the fields blank  Password , Email 
	#And user clicks login1 button
	#Then Show "Please fill in all required fields" message.

@tag3
Scenario: Email error
  Given that the admin is not logged in
	And "username" is not in the database
	Then Show "The email entered is incorrect" message.
	
#@tag4
#Scenario: password error
  #Given The user has entered all the data correctly email, password
	#And password is not in the database
	#When user clicks register1 button
	#Then Show "The password entered is incorrect" message.
