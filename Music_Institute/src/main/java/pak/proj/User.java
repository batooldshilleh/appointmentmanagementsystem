package pak.proj;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class User {
	
	 static Logger logger = Logger.getLogger(User.class.getName());
	String password;
	String username;
	String type;
    private boolean logged;
  	static boolean n;
  	static boolean m;
  	protected static int amontofmony ;
  	protected static List<User> users1 =new ArrayList<User>();
  	protected static List<String> commint =new ArrayList<String>();
  	
    public User(){
    	User.users1.add(new User("batool","123","t"));
		User.users1.add(new User("manar","1234s","t"));
		User.users1.add(new User("ahmad","1234","s",500));
		User.users1.add(new User("saja","1234","s",600));	
    	
    }
  
    public User(String name, String pass,String type,int i){
    	this.username=(name);
    	this.password=(pass);
        this.type=(type);
        User.amontofmony=i;

    	
    }
    public User(String name, String pass,String type){
    	this.username=(name);
    	this.password=(pass);
        this.type=(type);
       
    }
   
	public void setType(String string) {
		
		this.type = string;
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
	
	public static void setamontofmony(int string2) {
		
		User.amontofmony= string2;
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
	
	public int getaom() {
		
		return amontofmony;
	}

	public String getpass() {
		
		return password;
	}
	
	public String getType() {
		return type;
	}
	
	public static void adduser(User l) {
	User u =new User();
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
	    	return ut.toLowerCase().equalsIgnoreCase("t");
	    }
	    
	    public User userinfo(String inp) {
	    	User b = new User();
			for (int i = 0;i<users1.size();i++) {
				if (users1.get(i).getusername().equals(inp)) {
					b = users1.get(i);
					break;
				}
			}
			return b;
	    }

	
	    public boolean istybeEqual(String type){
	        return this.type.toLowerCase().equals(type);
	    }

		public boolean isRegest(String string) {
			
			for (int i = 0 ; i<users1.size();i++) {
				if (users1.get(i).getusername().equals(string))
					return true;
			}
			return false;
		}
		
		
		  public void note(String commint) {


		    	User.commint.add(commint+"\n");	
		    }
	
		  public void noteshow() {
			  for (int i = 0 ; i<commint.size();i++) {
				  logger.log(Level.INFO,commint.get(i));
			  }
		  }

	
	
	
}