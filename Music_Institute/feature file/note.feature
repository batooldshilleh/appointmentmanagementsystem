Feature: notes
The user wants to write his notes


@tag1
Scenario: write successfully
	Given that the user is logged in
	And  The user has entered his feedback
	Then the user add it successfully
	
@tag2
Scenario: not logged
  Given that the user is not logged in1
	And The user has entered his feedback
	Then Show "you are not logged in our system" message1.
	
