Feature: email to User 
Scenario: Send reminder email
 Given that the admin is logged in 
  When the admin sends a reminder email to students 
  Then the students should receive an email with subject ""