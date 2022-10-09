package pak.proj;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
 
public class Test_login {

	user u ;
	 List <user> usernames = new ArrayList<user>();
	 List <user> passwords = new ArrayList<user>();
	 List <user> flag = new ArrayList<user>();
	 public List<String> users=new ArrayList<String>();
	 Logger logger = Logger.getLogger(Test_login.class.getName());
	 boolean Assert_UN = false;
	 
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
	
	/*-----------------------------------------------*/
	@Given("table")
	public List<String> table(io.cucumber.datatable.DataTable dataTable) {
		
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		users=dataTable.asList(String.class);
		return users;
	    
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
	    	assertFalse(Assert_UN);
	    }
	    else
	    {
	    	Assert_UN  = true;
	    	assertTrue(Assert_UN);
	    }
	}
	
	/*-------------------------------------------------*/


	@Given("the {string} not in database")
	public void the_not_in_database(String string) {
	    // Write code here that turns the phrase above into concrete actions
		
	}

	@Then("Show masseg {string}")
	public void show_masseg(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

}


