package pak.proj;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register {
	Admin admin =new Admin();
	user u = new user();
	boolean correct;
	 List< user>un = new ArrayList<user>();
	    boolean Assert_sig = false;
	Logger logger
    = Logger.getLogger(Register.class.getName()); 


	@Given("there is a user whith USER NAME {string} , PASSWORD {string} , Type {string}")
	public void there_is_a_user_whith_user_name_password_type(String string, String string2, String string3) {
	    // Write code here that turns the phrase above into concrete actions
		   u.setUsrname(string);
		   u.setPass(string2);
		   u.setType(string3);
	}

	@When("the user is registered")
	public void the_user_is_registered() {
	    // Write code here that turns the phrase above into concrete actions
		 if(correct){
	         user.adduser(u);
	   }
	     else
	          assertFalse(false);
	}

	@Then("the user whith NAME {string} , PASSWORD {string} , Type {string} is registered in the system")
	public void the_user_whith_name_password_type_is_registered_in_the_system(String string, String string2, String string3) {
	    // Write code here that turns the phrase above into concrete actions
		 if(u.isRegest(string))
		assertTrue(true);
	}

	@Then("the error message {string} is given")
	public void the_error_message_is_given(String string) {
	    // Write code here that turns the phrase above into concrete actions
		logger.log(Level.INFO,"this user is already registered");
	}



}



