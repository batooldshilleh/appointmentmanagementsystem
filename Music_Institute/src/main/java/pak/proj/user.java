package pak.proj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.util.logging.Level;
import java.util.logging.Logger;
public class user {
	String pass;
	String userName;
	String Type;
    private boolean logged;
    public static List<user> users = new ArrayList<user>();
    user(){}
    
    user(String name, String pass , String type){
    	userName = name;
    	this.pass = pass;
    	Type = type;
    }
    
    static Logger logger = Logger.getLogger(user.class.getName());
    
	public void setLogstat(boolean l) {
		// TODO Auto-generated method stub
		this.logged = l;
	}

	public boolean getLogstat() {
		// TODO Auto-generated method stub
		return logged;
	}

	public void setUsrname(String string) {
		// TODO Auto-generated method stub
		this.userName = string;
	}

	public void setPass(String string2) {
		// TODO Auto-generated method stub
		this.pass= string2;
	}

	public boolean loginCH(String string, String string2) {
		// TODO Auto-generated method stub
		if(string.equals(userName) && string2.equals(pass)) {
			logged = true;
		}
		
		else logged = false;
		return logged;
	}

	public void setType(String string) {
		// TODO Auto-generated method stub
		this.Type = string;
	}

	public boolean TypeCH(String string) {
		// TODO Auto-generated method stub
		if(string == "t" || string =="T")
			return true ;
		else return false;
			
	}

	public String getusername() {
		// TODO Auto-generated method stub
		return userName;
	}
	

	public boolean TypeCS(String string) {
		// TODO Auto-generated method stub
		if(string == "s" || string =="S")
			return true ;
		else return false;
			
	}

	public String getpsse() {
		// TODO Auto-generated method stub
		return pass;
	}

	public static void adduser(user l) {
		// TODO Auto-generated method stub
	users.add(l);
       
	}
	
	public static void printus() {
       for(int i =0 ; i< users.size();i++)
    	   System.out.print(users.get(i));
}
}