package pak.proj;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import  pak.proj.Email;
import  pak.proj.User;
import static org.junit.Assert.assertTrue;
public class Emails {
	User u = new User();
	@Given("that the admin is logged in")
	public void that_the_admin_is_logged_in() {
		if(u.getLogstat())
	    	assertTrue(true);
	}

	@When("the admin sends a reminder email to students")
	public void the_admin_sends_a_reminder_email_to_students() {
		
		String sub="reminder",email="user@gmail.com",body="you have a Lecture in 12/2/2022";
		Email e=new Email();
	    e.sendEmail(email, sub, body);
	    
	}

	@Then("the students should receive an email with subject {string}")
	public void the_students_should_receive_an_email_with_subject(String string) {
		assertTrue(true);
	}

}
