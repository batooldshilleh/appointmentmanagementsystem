package pak.proj;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.lang.System.Logger.Level;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Test_login {
	user u = new user();
	 List <user> usernames = new ArrayList<user>();
	 List <user> passwords = new ArrayList<user>();
	 List <user> tayps = new ArrayList<user>();
	 
	 Logger logger = Logger.getLogger(Test_login.class.getName());
	 boolean Assert_pass = false;
	 
	 
	@Given("that the admin is not logged in")
	public void that_the_admin_is_not_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
		 u.setLogstat(false);
         assertFalse(u.getLogstat());
	}

	@Given("The user has entered all the data correctly  {string},{string}")
	public void the_user_has_entered_all_the_data_correctly(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    u.setUsrname(string);
	    u.setPass(string2);
	    u.loginCH(string,string2);
	}

	@When("the Type {string}")
	public void the_type(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    u.setType(string);
	    u.TypeCH(string);
	}

	@Then("show tehar menu")
	public void show_tehar_menu() {
	    // Write code here that turns the phrase above into concrete actions
	    u.setLogstat(true);
	    assertTrue( u.getLogstat());
	}
	
	//*****************
	
	@Given("{string} is not in the database")
	public void is_not_in_the_database(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    usernames = Login.serchName(string);
	}

	@Then("Show {string} message.")
	public void show_message(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
}


