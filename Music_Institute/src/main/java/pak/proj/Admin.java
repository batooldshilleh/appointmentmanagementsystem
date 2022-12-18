package pak.proj;

import java.util.logging.Logger;

public class Admin {

	  String pass;
	    private boolean logged;
	    
	    Logger logger
        = Logger.getLogger(Admin.class.getName());
	    
	public void setLogged(boolean b) {
		
		this.logged = b;
	}


	
	public boolean getLogged() {
    	return logged;
    }
    public String getPass() {
    	return pass;
    }

}
