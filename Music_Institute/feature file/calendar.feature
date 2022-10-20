Feature: Calendar
Description: The teacher can book course date
Actor: teacher
	
Scenario: book a new Appointment
Given teacher is looged in 
When he choose a new Appointment
And there is no conflict with time
Then The booking process was successful
And a msg1 "successful process  " will apper

Scenario: conflict
Given teacher is looged in 
When he choose a new Appointment
And there is conflict with time
Then The booking process was not successful
And a msg "choose another time " will apper

