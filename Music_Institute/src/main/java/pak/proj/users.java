package pak.proj;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;




public class users {

	 static Logger logger = Logger.getLogger(users.class.getName());
	String password;
	String username;
	String Type;
   private boolean logged;
 	static boolean n;
 	static boolean m;
 	public static List<users> users1 =new ArrayList<users>();
 	public static List<String> commint =new ArrayList<String>();
   public users(){
   	        users1.add(new users("batool","123","t"));
   	     users1.add(new users("ali","185","t"));
		users.users1.add(new users("manar","1234","t"));
		users1.add(new users("samer","123","t"));
		users.users1.add(new users("ahmad","1234","s"));
		users.users1.add(new users("saja","1234","s"));	
   	
   }
 
   public users(String name, String pass,String type){
   	this.username=(name);
   	this.password=(pass);
       this.Type=(type);

   	
   }
  
	public void setType(String string) {
		
		this.Type = string;
	}
   
	public void setLogstat(boolean l) {
		
		this.logged = l;
	}

	public boolean getLogstat() {
		
		return logged;
	}

	public void setUsrname(String string) {
		
		this.username = string;
	}

	public void setPass(String string2) {
		
		this.password= string2;
	}
	


	public boolean loginCH(String string, String string2) {
		
		if(string.equals(username) && string2.equals(password)) {
			logged = true;
		}
		
		else logged = false;
		
		setLogstat(logged);
		return logged;
	}


	public String getusername() {
		
		return username;
	}

	public String getpass() {
		
		return password;
	}
	
	public String getType() {
		return Type;
	}
	
	public static void adduser(users l) {
	users u =new users();
		if(u.getLogstat())
		{
			users1.add(l);
			
		}
		else
			logger.log(Level.INFO,"you Should login first");
	}
	
  
	
	 public boolean isnameEqual(String name){
	        return this.username.toLowerCase().equals(name);
	    }
	    public boolean ispassEqual(String pass){
	        return this.password.toLowerCase().equals(pass);
	    }

	    
	    public boolean isTechar(String ut) {
	    	return ut.toLowerCase().equals("t");
	    }
	    
	    
	    
	    public users userinfo(String inp) {
	    	users b = new users();
			for (int i = 0;i<users1.size();i++) {
				if (users1.get(i).getusername().equals(inp)) {
					b = users1.get(i);
					break;
				}
			}
			return b;
	    }

	
	    public boolean istybeEqual(String type){
	        return this.Type.toLowerCase().equals(type);
	    }
	
	
	
	    public void note(String commint) {
	    	
	    	   
	    	users.commint.add(commint+"\n");	
	    }
	
	
	
	
	
	
	
}