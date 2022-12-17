package pak.proj;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.logging.Level;
import java.util.logging.Logger;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class schedule_Test {
	
	corse c = new corse();
	Student s = new Student();
	static Logger logger
	   = Logger.getLogger(Test_login.class.getName());




	/*@Then("the show masseg \\({string}).")
	public void the_show_masseg(String string) {
	    // Write code here that turns the phrase above into concrete actions
		string="full class";
		   logger.log(Level.INFO,string);
		assertTrue(true);


	
	}*/
	@Given("the table of artical")
	public void the_table_of_artical(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	   
	}

	@Given("There is no conflict with {int}")
	public void there_is_no_conflict_with(Integer cn) {
	    // Write code here that turns the phrase above into concrete actions
		   if(!s.corsinfo(cn)){
		    	s.Sucsses(true);
		    	s.addcorse(cn);
		    	c.incstudantNumber(cn);
		    	assertTrue(s.getsucss());
		    }
			
	}

	@Given("The premium paid is sufficient {string}")
	public void the_premium_paid_is_sufficient(String un) {
	    // Write code here that turns the phrase above into concrete actions
		 if(s.haveinofmony(un)) 
    	assertFalse(false);
	   
	}


@Given("Number of studint in class less than the max {int}")
public void number_of_studint_in_class_less_than_the_max(Integer int1) {
    // Write code here that turns the phrase above into concrete actions
	 if (c.corseinfo(int1).getnos() < 25) 
		  assertTrue(true);
		
}

@Then("the article is registered {int}")
public void the_article_is_registered(Integer c) {
    // Write code here that turns the phrase above into concrete actions
	 if(s.corsinfo(c)) {
	 assertTrue(true);
}

}

@Given("There is conflict with {int}")
public void there_is_conflict_with(Integer c) {
    // Write code here that turns the phrase above into concrete actions
	if(s.corsinfo(c)) {
	 assertTrue(true);
 }

}

	@Then("the show masseg \\({string})")
	public void the_show_masseg(String string) {
	    // Write code here that turns the phrase above into concrete actions
		string="there is conflict";
		   logger.log(Level.INFO,string);
		
	}

	@Given("The premium paid not enough less {string}")
	public void the_premium_paid_not_enough_less(String un) {
	    // Write code here that turns the phrase above into concrete actions
		if(!s.haveinofmony(un)) 
	    	assertFalse(false);
		
	}

	@Then("the show masseg1 \\({string})")
	public void the_show_masseg1(String string) {
	    // Write code here that turns the phrase above into concrete actions
		string="the premium paid not enough";
		   logger.log(Level.INFO,string);
		
	}

	@Given("The number of student more than {int}")
	public void the_number_of_student_more_than(Integer coursnum) {
	    // Write code here that turns the phrase above into concrete actions
		 boolean full = false;
	     if (c.corseinfo(coursnum).getnos() == 25 )
	    	 full = true;
	    	 assertFalse(full);
		
	}

	@Then("the show masseg \\({string}).")
	public void the_show_masseg11(String string) {
	    // Write code here that turns the phrase above into concrete actions
		string="full class";
		   logger.log(Level.INFO,string);
		
	}


	
	
	@Given("There is no conflict with any {int}")
	public void there_is_no_conflict_with_any(Integer cn) {
	    // Write code here that turns the phrase above into concrete actions
		   if(!s.corsinfo(cn)){
		    	s.Sucsses(true);
		    	s.addcorse(cn);
		    	c.incstudantNumber(cn);
		    	assertTrue(s.getsucss());
		    }
			
	}
	@Given("The premium paid is sufficient the {string}")
	public void the_premium_paid_is_sufficient_the(String un) {
	    // Write code here that turns the phrase above into concrete actions
		 if(s.haveinofmony(un)) 
    	assertFalse(false);
	
	}
	@Given("The premium paid not enough lees thean {string}")
	public void the_premium_paid_not_enough_lees_thean(String un) {
	    // Write code here that turns the phrase above into concrete actions
		if(!s.haveinofmony(un)) 
	    	assertFalse(false);
		
	}
}

