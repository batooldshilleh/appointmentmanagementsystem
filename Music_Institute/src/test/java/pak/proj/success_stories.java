package pak.proj;

import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeFalse;

import java.util.logging.Level;
import java.util.logging.Logger;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class success_stories {
	User u = new User();
	About s = new About();
	static Logger logger
	= Logger.getLogger(Musical_instruments.class.getName());

	
	@Given("they chose the  success stories")
	public void they_chose_the_success_stories() {
	    s.setinst(true);
		if(s.getsto()==true)
			 assertTrue(s.getsto());
		 
	}

	@Then("A list of  success stories, , will appear")
	public void a_list_of_success_stories_will_appear() {
	    s.printall();
		logger.log(Level.INFO,"the list was appear");
	}
}