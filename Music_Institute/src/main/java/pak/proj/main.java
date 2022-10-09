package pak.proj;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class main {
	
	static Logger logger = Logger.getLogger(main.class.getName());
	 
	 public static void main(String[] args) {
	 user u = new user();
	
		String userN  , userp;
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			logger.log(Level.INFO,"welcome \n");
				logger.log(Level.INFO,"enter User Name \n");
				userN = scanner.next();
				logger.log(Level.INFO,"enter the password");
				userp = scanner.next();
				if(!u.getpsse().equals(userp)||!u.getusername().equals(userN)) 
				{
				logger.log(Level.INFO,"the User Name OR password is wrong"); 
				
				}
				else 
					logger.log(Level.INFO,"Welcome"+userN);	
			    u.loginCH(userp,userN);
				
		
				
		
		
}	
	 }
}
