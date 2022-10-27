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
    
     static String inp, inp2,inp3;
	
	 static boolean isValid = false;
	 
	static Scanner scanner = new Scanner(System.in);
	
	static user admin = new user();
	
	static corse c = new corse();
	
	static Student s = new Student();
	
	static Musical_instruments1 m = new Musical_instruments1() ;
	
	//static calendar cc = new calendar();
	
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
    	
    	 else if (ch == 4) {
    		 m.printinfo();
    	 }
    	 else {
    		 System.exit(1);
    	 }
    }
    
    public static void techar_choise(int ch) {
 	
    	if ( ch == 1) {
    		
    		logger.log(Level.INFO,"techar luc");
	    	
    	}
    	
    	else if(ch==2) {}
    	 else if (ch == 3 ) {
    		 m.printinfo();
    	}
    	
    	 else if (ch==0) {
    		 System.exit(1);
    	 }
    }
    
    public static void login() {
    	
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
				admin= admin.userinfo(inp);
		    	while (true) {
		    		
		    		boolean t=admin.isTechar(admin.getType());
		    		
		    	 if(t) {
		    		 
		    		 logger.log(Level.INFO,
		    				 	"\n "	
						    	+ "0- logout"
						    	+ "\n "
				    			+ "1- my lectures"
				    			+ "\n "
				    			+ "2- Appointment Reservation"
				    			+ "\n "
				    			+ "3- Show Musical Instruments "
				    			);
		    		 
		    		 int ch =scanner.nextInt();
		    		 techar_choise( ch);
				    		}
		    	   
				    else {
				    	
				    	logger.log(Level.INFO,
				    			"\n"
				    			+ "0- logout"
								+ "\n "
				    			+ "1- my lectures"
				    			+ "\n"
				    			+ "2- Course List"
				    			+ "\n"
				    			+ "3- Events"
				    			+ "\n"
				    			+ "4- Show Musical Instruments "
				    			+ "\n "
				    			+ "5- logout"); 
				    	
				    	int ch =scanner.nextInt();
				    	
				    	student_choise(ch);
				    	
				    	}
				    	
		    	       }
			   
			    }
			
			else
				
				logger.log(Level.INFO,"the user name or password is wrong");
			
			    System.exit(1);
	
		    admin.loginCH(inp,inp2);
 
			    
		}
	
    }
    
    public static void reg_or_log(int ch) {
    	
    	if(ch == 1) {
    		logger.log(Level.INFO,"enter your name\n");
    		
    		inp = scanner.next();
    		
    		logger.log(Level.INFO,"enter the password\n");
    		
    		inp2=scanner.next();
    		
    		logger.log(Level.INFO,"enter the your type\n");
    		
    		inp3=scanner.next();
    		
    		if(admin.isRegest(inp)) {
    			logger.log(Level.INFO,"go to login you are regist\n");
    			login();
    		}
    		
    		else {
    			
    		admin.setUsrname(inp);
    		admin.setPass(inp2);
    		admin.setType(inp3);
    			login();
    		}
    	}
    	else if (ch==2) {
    		login();
    	}
    	
    	
    }
    
	public static void main(String[] args) {
		logger.log(Level.INFO,
				"\n"+
				"1- Register \n"
    			+ "2- login");
		int usch = scanner.nextInt();
		reg_or_log(usch);

	}

}
