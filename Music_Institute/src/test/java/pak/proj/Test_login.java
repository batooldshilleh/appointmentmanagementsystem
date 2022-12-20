package pak.proj;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.logging.Level;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
//import  pak.proj.main;
import pak.proj.User;
import java.util.logging.Logger;
import java.util.logging.Level;




public class Test_login {
	 User u = new User();
	 
	 static Logger logger
	   = Logger.getLogger(Test_login.class.getName());
	
	@Given("table")
	
	public void table(io.cucumber.datatable.DataTable dataTable) {
		
	}

	@Given("that the user is not logged in")
	public void that_the_user_is_not_logged_in() {
		 u.setLogstat(false);
	     assertFalse(u.getLogstat());
	}

	@Given("The user has entered all the data correctly  {string} , {string}")
	public void the_user_has_entered_all_the_data_correctly(String string, String string2) {
	u.setUsrname(string);
	u.setPass(string2);
	u.loginCH(string, string2);
	}

	@Then("the user is logged in successfully")
	public void the_user_is_logged_in_successfully() {
		 u.setLogstat(true);
		    assertTrue( u.getLogstat());
	}
	
	@Given("{string} is not in the database")
	public void is_not_in_the_database(String string) {
	   
		if (!User.users1.equals(string)) {
			 
			 u.setLogstat(false);
		}
		
	     assertFalse(u.getLogstat());
		
	}

	@Then("Show {string} message.")
	public void show_message(String string) {
	   string="the username is wrong";
	   logger.log(Level.INFO,string);
	}

	@Given("the {string} not in database")
	public void the_not_in_database(String string) {
		if (!User.users1.equals(string)) {
			 
			 u.setLogstat(false);
		}
		
	     assertFalse(u.getLogstat());
	}

	@Then("Show masseg {string}")
	public void show_masseg(String string) {
		  string="the password is wrong";
		   logger.log(Level.INFO,string);
	}


}