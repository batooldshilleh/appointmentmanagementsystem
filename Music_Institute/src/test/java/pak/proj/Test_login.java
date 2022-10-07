package pak.proj;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Test_login {
user u = new user();
	@Given("that the admin is not logged in")
	public void that_the_admin_is_not_logged_in() {
	    
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
}
