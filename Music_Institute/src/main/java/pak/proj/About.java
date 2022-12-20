package pak.proj;

import java.util.logging.Level;
import java.util.logging.Logger;

public class About {
	boolean ab;
	
	static Logger logger
	= Logger.getLogger(About.class.getName());
	
public void setinst(boolean l) {
		
		this.ab = l;
	}

	public boolean getsto() {
		
		return ab;
	}

	
public void printall() {
	logger.log(Level.INFO,"Manar Mohammad /n"
			+ "programmer/n"
			+ "manarmohamd@gmail.com /n"
			+ "https://github.com/Manar960 /n");
	logger.log(Level.INFO,"Batool D Shilleh/n"
			+ "Team manegar/n"
			+ "batoolshilleh@gmail.com /n"
			+ "https://github.com/batooldshilleh /n");
	logger.log(Level.INFO, "Ahmad Rashed/n"
			+ "ahmad2001@gmail.com /n"
			+ "https://github.com/ahmadrasheedd/n");
}
	
}
