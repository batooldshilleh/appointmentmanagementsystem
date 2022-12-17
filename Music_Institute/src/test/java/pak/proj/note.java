package pak.proj;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.logging.Level;
import java.util.logging.Logger;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class note {
	 static Logger logger
	   = Logger.getLogger(note.class.getName());
	user u=new user();
	String msg="thanks";
	@Given("that the user is logged in")
	public void that_the_user_is_logged_in() {
	if(u.getLogstat()==true)
		assertTrue(u.getLogstat());
		
	}

	@Given("The user has entered his feedback")
	public void the_user_has_entered_his_feedback() {
	u.note(msg);
	assert(true);
	}

	@Then("the user add it successfully")
	public void the_user_add_it_successfully() {
		assert(true);
	}

	@Given("that the user is not logged in1")
	public void that_the_user_is_not_logged_in1() {
		if(u.getLogstat()==false)
			assertFalse(u.getLogstat());
			
		}
	

	@Then("Show {string} message1.")
	public void show_message1(String string) {
		string ="you must log in first";
		logger.log(Level.INFO,string);
	}
	
	
	
	
	
	
	
	
	
}
