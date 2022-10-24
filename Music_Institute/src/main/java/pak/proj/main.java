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
    
     static String inp, inp2;
	
	 static boolean isValid = false;
	 
	static Scanner scanner = new Scanner(System.in);
	
	static user admin = new user();
	
	static corse c = new corse();
	
	static Student s = new Student();
	
	static calendar cc = new calendar();
	
    public static void chikeuserType(){
 
    	while (true) {
    		
    	 if(admin.isTechar(admin.getType())) {
    		 
    		 logger.log(Level.INFO,
    				 	"\n "
		    			+ "1- my lectures"
		    			+ "\n "
		    			+ "2- Appointment Reservation"
		    			+ "\n "
		    			+ "3- prss any key to logout");
    		 
    		 int ch =scanner.nextInt();
    		 techar_choise( ch);
		    		}
    	   
		    else {
		    	
		    	logger.log(Level.INFO,
		    			"\n"
		    			+ "1- my lectures"
		    			+ "\n"
		    			+ "2- Course List"
		    			+ "\n"
		    			+ "3- Events"
		    			+ "4- prss any key to logout"); 
		    	
		    	int ch =scanner.nextInt();
		    	
		    	student_choise(ch);
		    	
		    	}
		    	
    	       }
		    }
    
    public static void student_choise(int ch) {
    	
    	if ( ch == 2) {
    		
    		int cn ;
    				
	    	for(int i =1 ; i<7; i++) {
	    		
	    		logger.log(Level.INFO,c.corseinfo(i).getcorsename());
	    		
	    	}
	    	
	    	cn = scanner.nextInt();
            
	    	
	    	if(c.corseinfo(cn).getnos()==25) {
	    		
	    		logger.log(Level.INFO,"full");
	    		
	    	}

	    	if(s.itsRegest(cn) == cn) {
	    		
	    		logger.log(Level.INFO,"you are rigest");
	    		
	    	}
	    	
	    	else if(cn==0) {
	    		
	    		System.exit(1);
	    		
	    	}
	    	
	    	else {
	    		
	    		s.addcorse(cn);
	    		c.incstudantNumber(cn);
	    		s.haveinofmony(inp);
	    		s.Sucsses(true);
	    		
	    		}
	    	}
    	
    	
    	 else if (ch == 1 ) {
    		 logger.log(Level.INFO,"there is your corse");
    	}
    	
    	 else if(ch == 3) {
    		 logger.log(Level.INFO,"event");
    	 }
    	 else {
    		 System.exit(1);
    	 }
    }
    
    public static void techar_choise(int ch) {
 	
    	if ( ch == 1) {
    		
    		logger.log(Level.INFO,"techar luc");
	    	
    	}
    	
    	 else if (ch == 2 ) {
    		 cc.fun();
    	}
    	
    	 else {
    		 System.exit(1);
    	 }
    }
    
	public static void main(String[] args) {
		
		logger.log(Level.INFO,"welcome\n");
		
		logger.log(Level.INFO,"enter your name\n");
		
		inp = scanner.next();
		
		logger.log(Level.INFO,"enter the password\n");
		
		inp2=scanner.next();
		
		for(;;) {
			
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
			
			if(isValid) {
				
				logger.log(Level.INFO,"HI");
				
			    chikeuserType();
			   
			    }
			
			else
				
				logger.log(Level.INFO,"the user name or password is wrong");
			
			    System.exit(1);
	
		    admin.loginCH(inp,inp2);
 
			    
		}

	}

}
