Feature: schedule
Create an appointment schedule



@tag1
Scenario: successful course registration
  And chose corse 1,"c",200 and 10
	And   There is no conflict with 1
	And The premium paid is sufficient "80"
	And Number of studint in class less than the max 1
	Then the article is registered 5
	
@tag2
Scenario: conflict 
	And There is conflict with 1
	Then the show masseg ("there is conflict ")
	
	@tag3
Scenario: premium paid not enough
	And The premium paid not enough less "20"
	Then the show masseg1 ("the premium paid not enough ")
	
@tag4
Scenario: full class  
	And The number of student more than 25 
	Then the show masseg ("full class ").
	 
	

	

