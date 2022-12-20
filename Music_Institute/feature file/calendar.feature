Feature: Calendar
Description: The teacher can book course date
Actor: teacher
	
Scenario: book a new Appointment
Given teacher is looged in 
When he set day "1" monthe "5" houre "4" menet "5" 
And there is no conflict with time day "1" monthe "5" houre "4" menet "5"
Then The booking process was successful
And a msg1 "successful process  " will apper

Scenario: conflict
Given teacher is looged in 
When he choose a new Appointment day "1" monthe "5" houre "4" menet "5"
And there is conflict with time day "1" monthe "5" houre "4" menet "5"
Then The booking process was not successful
And a msg "choose another time " will apper

