package pak.proj;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.logging.Level;

public class main {
    static Logger logger
   = Logger.getLogger(main.class.getName());
	
	public static void main(String[] args) {
		
		String inp,inp2;
		 boolean isValid = false;
		Scanner scanner = new Scanner(System.in);
		user admin = new user();
		corse c = new corse();
		
		for(;;) {
		logger.log(Level.INFO,"welcome\n");
	
			logger.log(Level.INFO,"enter your name\n");
			inp = scanner.next();
			logger.log(Level.INFO,"enter the password\n");
			inp2=scanner.next();
			
			for(int i=0;i<user.users1.size();i++) {
			if(user.users1.get(i).isnameEqual(inp) ) 
			{
				if(user.users1.get(i).ispassEqual(inp2))
				{
				isValid = true;
				admin= admin.userinfo(inp);
		       	break;
				}
			}
			
			}
			if(isValid)
				logger.log(Level.INFO,"HI");
			else
				logger.log(Level.INFO,"the user name or password is wrong");
			
	
		    admin.loginCH(inp,inp2);
		    
		    if(admin.isTechar(admin.getType())) {
		    	System.out.println(" 1-my lectures"
		    			+ "\n "
		    			+ "2-Appointment Reservation");
		    }
		    else {
		    	System.out.println(" 1-my lectures"
		    			+"\n"
		    			+"2-Course List"
		    			+ "\n"
		    			+ "3-Events");
		    	for(int i =1 ; i<7; i++) {
		    		logger.log(Level.INFO,c.corseinfo(i).getcorsename());
		    	}
		    	int ch =scanner.nextInt();
		    	if(c.corseinfo(ch).getnos()==25) {
		    		logger.log(Level.INFO,"full");
		    	}


		    }
		    break;
			    
		}
	}
}
