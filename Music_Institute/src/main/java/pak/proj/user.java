package pak.proj;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class user {
	
	 static Logger logger = Logger.getLogger(user.class.getName());
	String password;
	String username;
	String Type;
    private boolean logged;
  	static boolean n;
  	static boolean m;
  	public int amontofmony;
  	public static List<user> users1 =new ArrayList<user>();
   
    public user(){
    	user.users1.add(new user("batool","123","t"));
		user.users1.add(new user("manar","1234s","t"));
		user.users1.add(new user("ahmad","1234","s",500));
		user.users1.add(new user("saja","1234","s",600));	
    	
    }
  
    public user(String name, String pass,String type,int i){
    	this.username=(name);
    	this.password=(pass);
        this.Type=(type);
        this.amontofmony=i;

    	
    }
    public user(String name, String pass,String type){
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
	
	public void setamontofmony(int string2) {
		
		this.amontofmony= string2;
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
		return Type;
	}
	
	public static void adduser(user l) {
	user u =new user();
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
	    
	    public user userinfo(String inp) {
	    	user b = new user();
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
	
	

	
	
	
}