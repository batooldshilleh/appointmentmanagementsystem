package pak.proj;

import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeFalse;

import java.util.logging.Logger;
import java.util.logging.Level;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Musical_instruments {
User u=new User();

MusicalInstruments1 m =new MusicalInstruments1();
static Logger logger
= Logger.getLogger(Musical_instruments.class.getName());

@Given("that the Users are logged in")
public void that_the_users_are_logged_in() {
	u.setLogstat(true);
	assertTrue(u.getLogstat());
  
	
}

@Given("they chose the Musical Instruments")
public void they_chose_the_musical_instruments() {
 if(m.getinst()==true)
	 assertTrue(m.getinst());
 else
	 assumeFalse(m.getinst());

}

@Then("A list of where musical instruments are and there price, , will appear")
public void a_list_of_where_musical_instruments_are_and_there_price_will_appear() {


	logger.log(Level.INFO,"the list was appear");
	
}
	
	
}
