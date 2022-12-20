package pak.proj;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class logout {

	
	User u =new User();
	@Given("that the user is logged_in")
	public void that_the_user_is_logged_in() {
	    if (u.getLogstat()== true)
	    	assert(true);
	}

	@When("the user logs out")
	public void the_user_logs_out() {
	if(u.getLogstat()==true)
		assert(true);
	}

	@Then("the user is not logged in")
	public void the_user_is_not_logged_in() {
	 u.setLogstat(false);
	 u.setLogstat(true);
	 
	 
	}
	
		
	
}