package pak.proj;

import java.util.ArrayList;
import java.util.List;

public class Login {
	public static List<user> users = new ArrayList<user>();
	
	public static List<user> searchPass(String string) {
		// TODO Auto-generated method stub
		List<user> searched=new ArrayList<user>();
	    for(int i = 0; i< users.size(); i++){
	        if(users.get(i).getpsse().contains(string)) searched.add(users.get(i));

	    }
	    return searched;
	}

	public static List<user> serchName(String string) {
		// TODO Auto-generated method stub
		List<user> searched=new ArrayList<user>();
	    for(int i = 0; i< users.size(); i++){
	        if(users.get(i).getusername().contains(string)) searched.add(users.get(i));

	    }
	    return searched;
	}

}
