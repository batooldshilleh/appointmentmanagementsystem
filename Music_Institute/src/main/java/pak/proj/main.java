package pak.proj;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

import pak.proj.*;

import java.util.logging.Level;

public class main {
    static Logger logger
   = Logger.getLogger(main.class.getName());
	
	public static void main(String[] args) {
		
		String inp,inp2,Ncousre;
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
		       	break;
				}
			}
			
			}

			if(isValid) {
				logger.log(Level.INFO,"HI");
				admin= admin.userinfo(inp);
				
			}
			else

			if(isValid)
				logger.log(Level.INFO,"HI"+ inp+"\n");
			else {

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
		  	
			    admin.loginCH(inp,inp2);
				
				break;
				 }
		        admin.loginCH(inp,inp2);
		    
		    
		    for (int i=0;i<user.users1.size();i++) {
		    	if(user.users1.get(i).istybeEqual("t")&&user.users1.get(i).isnameEqual(inp)) {
		    		
		    	    int key;
		    	    logger.log(Level.INFO,"\n1-Your Course\n2-All Course\n3-Book another course\n");
				    key=scanner.nextInt();		    
				    switch (key) {
					case 1:
						
					String findteacher = "";
				
			        for (int j=0;j<Course.Course.size();j++) {			   
			        if(Course.Course.get(j).isteacherEqual(inp)) {
				    findteacher += Course.Course.get(j) + "\n";	   
								   
			        }   
				
		            }		
		           	logger.log(Level.INFO,findteacher);				
	            	break;
					case 2:			
						 for (int j=0;j<Course.Course.size();j++) {	
								logger.log(Level.INFO,Course.Course.get(j).toString());	  
						 }	
						
						 break;
					case 3:
						String findcourse= "";	
						 logger.log(Level.INFO,"Available Courses\n");
						 for (int j=0;j<Course.Course2.size();j++) {	
								logger.log(Level.INFO,Course.Course2.get(j).toString());	  
						 }	
						
						 logger.log(Level.INFO,"\n\nWrite the name of the course you want to book \n");
						 Ncousre=scanner.next();
						 for (int j=0;j<Course.Course2.size();j++) {	
								if(Course.Course2.get(j).isnamecourseEqual(Ncousre)) {
									
									findcourse += Course.Course2.get(j)+ " "; break;	
									
								}	
								
						 }
							
						 
					
						
						
					}
		    		
		    		
		    		
		    		
		    	}
		    	
		    	
		    }
		
		    
		    int key;
		    key=scanner.nextInt();		    
		    switch (key) {
			case 1:
				
				
				
				
				

			default:
				break;
			}
		    
		    
		   
		    break;
			    
			    

		}
		
	
	}
}
