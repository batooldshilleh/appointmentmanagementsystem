package pak.proj;

import java.util.logging.Logger;

public class Admin {

	  String pass;
	    private boolean logged;
	    
	    Logger logger
        = Logger.getLogger(Admin.class.getName());
	    
	public void setLogged(boolean b) {
		// TODO Auto-generated method stub
		this.logged = b;
	}

	private void setPass(String string) {
		// TODO Auto-generated method stub
		this.pass = string;
	}
	
	public boolean getLogged() {
    	return logged;
    }
    public String getPass() {
    	return pass;
    }

}
