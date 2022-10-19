Feature: schedule
Create an appointment schedule

Background:
Given the table of artical
|artical name|
|playing violin|
|Piano Playing|
|playing guitar|
|Fundamentals of musicology|
|musical dictation|
|Singing principles|

@tag1
Scenario: successful course registration
	And   There is no conflict
	And The premium paid is sufficient
	And Number of studint in class less than the max
	Then the article is registered
	
@tag2
Scenario: conflict 
	And There is conflict
	Then the show masseg ("there is conflict ")
	
	@tag3
Scenario: premium paid not enough
	And The premium paid not enough
	Then the show masseg1 ("the premium paid not enough ")
	
@tag4
Scenario: full class  
	And The number of student more than 25 
	Then the show masseg ("full class ").