
import java.util.logging.Logger;
public class user {
	String pass;
	String userName;
	String Type;
    private boolean logged;
    
    Logger logger = Logger.getLogger(user.class.getName());
    
	public void setLogstat(boolean l) {
	
		this.logged = l;
	}

	public boolean getLogstat() {
		// TODO Auto-generated method stub
		return logged;
	}

	public void setUsrname(String string) {
	
		this.userName = string;
	}

	public void setPass(String string2) {
		
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

}
