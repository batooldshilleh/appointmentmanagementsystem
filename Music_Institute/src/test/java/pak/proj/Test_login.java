package pak.proj;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
 
public class Test_login {

	Login a;
	user u ;
	 List <user> usernames = new ArrayList<user>();
	 List <user> passwords = new ArrayList<user>();
	 List <user> flag = new ArrayList<user>();
	
	 Logger logger = Logger.getLogger(Test_login.class.getName());
	 boolean Assert_UN = false;
	 boolean Assert_P = false;
	 public Test_login() {
		u= new user(); 
	 }
	 
	 
	@Given("that the user is not logged in")
	public void that_the_user_is_not_logged_in() {
		 u.setLogstat(false);
         assertFalse(u.getLogstat());
	}

	@Given("The user has entered all the data correctly  {string},{string}")
	public void the_user_has_entered_all_the_data_correctly(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		usernames=Login.serchName(string);
		passwords=Login.searchPass(string2);
		if (usernames.isEmpty()) {
	        logger.log(Level.INFO,"no user");
	        Assert_UN = false;
	        assertFalse( Assert_UN);
	    } else {
	        Assert_UN = true;
	        assertTrue( Assert_UN);
	    }
		
		if (passwords.isEmpty()) {
	        logger.log(Level.INFO,"no user");
	        Assert_P= false;
	        assertFalse( Assert_P);
	    } else {
	        Assert_P = true;
	        assertTrue( Assert_P);
	    }
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
	
	/*-----------------------------------------------*/
	@Given("table")
	public void table(List<Map<String, String>> players) {
		
		for(Map<String, String> player : players) {
			 player.get("username");
	            
	            
		}
	}
	/*-----------------------------------------------*/
	
	@Given("{string} is not in the database")
	public void is_not_in_the_database(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    usernames = Login.serchName(string);
	}

	@Then("Show {string} message.")
	public void show_message(String string) {
	    // Write code here that turns the phrase above into concrete actions
	
	    flag = Login.serchName(string);
	    if(flag.isEmpty()) {
	    	logger.log(Level.INFO, "The email entered is incorrect");
	    	Assert_UN  = false;
	    	
	    }
	    
	    assertFalse(Assert_UN);
	}

	
	/*-------------------------------------------------*/


	@Given("the {string} not in database")
	public void the_not_in_database(String string) {
	   // Write code here that turns the phrase above into concrete actions
		passwords = Login.searchPass(string);
	}

	@Then("Show masseg {string}")
	public void show_masseg(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    flag = Login.serchName(string);
	    if(flag.isEmpty()) {
	    	logger.log(Level.INFO, "The pass entered is incorrect");
	    	Assert_P  = false;
	    	
	    }
	    
	    assertFalse(Assert_P);
}
}


