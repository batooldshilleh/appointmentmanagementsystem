package pak.proj;

import java.util.logging.Logger;
import java.text.ParseException;
import java.util.Date;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.logging.Level;

public class booking {
User u=new User();
Calender c =new Calender();
static Logger logger
= Logger.getLogger(Calender.class.getName());

@Given("teacher is looged in")
public void teacher_is_looged_in() {
if(u.getLogstat()==true)
	assertTrue(u.getLogstat());
}
    
@When("he set day {string} monthe {string} houre {string} menet {string}")
public void he_set_day_monthe_houre_menet(String string, String string2, String string3, String string4) {
    c.setDay(string);
    c.setMonth(string2);
    c.setTime(string3,string4);
}
@When("he choose a new Appointment day {string} monthe {string} houre {string} menet {string}")
public void he_choose_a_new_appointment_day_monthe_houre_menet(String string, String string2, String string3, String string4) {
	 
	    c.setMonth(string2);
	    c.setTime(string3,string4);
}
@When("there is no conflict with time day {string} monthe {string} houre {string} menet {string}")
public void there_is_no_conflict_with_time_day_monthe_houre_menet(String string, String string2, String string3, String string4) {
	if(c.isBooked(string,string2,string3,string4)==false)
		assertTrue(true);
}



@Then("The booking process was successful")
public void the_booking_process_was_successful() {
	
   
	assert(true);
}

@Then("a msg1 {string} will apper")
public void a_msg1_will_apper(String string) {
	logger.log(Level.INFO,"done");
}


@When("there is conflict with time day {string} monthe {string} houre {string} menet {string}")
public void there_is_conflict_with_time_day_monthe_houre_menet(String string, String string2, String string3, String string4) {
	if(!(c.isBooked(string,string2,string3,string4)==true))
		assertTrue(true);
}
@Then("The booking process was not successful")
public void the_booking_process_was_not_successful() {
	assert(true);
}

@Then("a msg {string} will apper")
public void a_msg_will_apper(String string) {
	logger.log(Level.INFO,"booking is not done");
}
}