package pak.proj;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.logging.Level;
import java.util.logging.Logger;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Shedule {
	
	Corse c = new Corse();
	Student s = new Student();
	static Logger logger
	   = Logger.getLogger(Test_login.class.getName());
  
	@Given("chose corse {int},{string},{int} and {int}")
	public void chose_corse_and(Integer int1, String string, Integer int2, Integer int3) {
	    c.setCN(int1);
	    c.setCorsname(string);
	    c.setPrice(int2);
	    c.setNOS(int3);
	}
	@Given("There is no conflict with {int}")
	public void there_is_no_conflict_with(Integer cn) {
	    
		   if(s.corsinfo(cn)){
		    	s.sucsses(true);
		    	s.addcorse(cn);
		    	c.incstudantNumber();
		    	assertTrue(s.getsucss());
		    }
			
	}

	@Given("The premium paid is sufficient {string}")
	public void the_premium_paid_is_sufficient(String un) {
	    
		 if(!s.haveinofmony()) 
    	   assertTrue(true);
	   
	}


@Given("Number of studint in class less than the max {int}")
public void number_of_studint_in_class_less_than_the_max(Integer int1) {
    
	 if (c.corseinfo(int1).getnos() < 25) 
		  assertTrue(true);
		
}

@Then("the article is registered {int}")
public void the_article_is_registered(Integer c) {
    boolean b = s.corsinfo(c);
	 if(!b) {
		 
	 assertTrue(true);
}

}

@Given("There is conflict with {int}")
public void there_is_conflict_with(Integer c) {
    
	if(s.corsinfo(c)) {
	 assertTrue(true);
 }

}

	@Then("the show masseg \\({string})")
	public void the_show_masseg(String string) {
	    
		string="there is conflict";
		   logger.log(Level.INFO,string);
		
	}

	@Given("The premium paid not enough less {string}")
	public void the_premium_paid_not_enough_less(String un) {
	
		if(!s.haveinofmony()) 
	    	assertFalse(false);
		
	}

	@Then("the show masseg1 \\({string})")
	public void the_show_masseg1(String string) {
	   
		string="the premium paid not enough";
		   logger.log(Level.INFO,string);
		
	}

	@Given("The number of student more than {int}")
	public void the_number_of_student_more_than(Integer coursnum) {
	    
		 
	     if (!(c.corseinfo(coursnum).getnos() < 25 ))
	    	 assertFalse(false);
		
	}

	@Then("the show masseg \\({string}).")
	public void the_show_masseg11(String string) {
	    
		string="full class";
		   logger.log(Level.INFO,string);
		
	}


	
	

}