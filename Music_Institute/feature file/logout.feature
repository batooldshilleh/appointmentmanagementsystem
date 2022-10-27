Feature: user logout
	Actor: Admin
	
Scenario: user logs out
	Given that the user is logged_in
	When the user logs out
	Then the user is not logged in