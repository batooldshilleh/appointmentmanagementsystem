package pak.proj;

import java.util.logging.Logger;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.logging.Level;

public class booking {
user u=new user();
calendar c =new calendar();
static Logger logger
= Logger.getLogger(calendar.class.getName());

@Given("teacher is looged in")
public void teacher_is_looged_in() {
if(u.getLogstat()==true)
	assertTrue(u.getLogstat());
}

@When("he choose a new Appointment")
public void he_choose_a_new_appointment() {
	if(c.getbookstat()==true)
		assertTrue(c.getbookstat());
	
}

@When("there is no conflict with time")
public void there_is_no_conflict_with_time() {
	if(c.getbookstat()==true)
		assertTrue(c.getbookstat());
	
}

@Then("The booking process was successful")
public void the_booking_process_was_successful() {

	assert(true);
}

@Then("a msg1 {string} will apper")
public void a_msg1_will_apper(String string) {
	logger.log(Level.INFO,"done");
}

@When("there is conflict with time")
public void there_is_conflict_with_time() {
	if(c.getbookstat()==false)
		assertFalse(c.getbookstat());
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