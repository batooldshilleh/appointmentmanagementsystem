package pak.proj;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.logging.Level;
import java.util.logging.Logger;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class schedule_Test {
	
	corse c = new corse();
	static Logger logger
	   = Logger.getLogger(Test_login.class.getName());

	@Given("the table of artical")
	public void the_table_of_artical(io.cucumber.datatable.DataTable dataTable) {
	    
	}

	@Given("There is no conflict")
	public void there_is_no_conflict() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Given("The premium paid is sufficient")
	public void the_premium_paid_is_sufficient() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("Number of studint in class less than {int}")
	public void number_of_studint_in_class_less_than(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the article is registered")
	public void the_article_is_registered() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("There is conflict")
	public void there_is_conflict() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the show masseg \\({string})")
	public void the_show_masseg2(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("The premium paid not enough")
	public void the_premium_paid_not_enough() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("the show masseg1 \\({string})")
	public void the_show_masseg1(String string) {
	    // Write code here that turns the phrase above into concrete actions
		string="the premium paid not enough";
		   logger.log(Level.INFO,string);
	}

	@Given("The number of student more than {int}")
	public void the_number_of_student_more_than() {
	    // Write code here that turns the phrase above into concrete actions
	     boolean full = true;
	     if (c.getnos() == 25 )
	    	 full = true;
	     assertTrue(full);
	}

	@Then("the show masseg \\({string}).")
	public void the_show_masseg(String string) {
	    // Write code here that turns the phrase above into concrete actions
		string="full class";



	
	}
}

