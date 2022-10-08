package pak.proj;

import java.util.ArrayList;
import java.util.List;

public class Login {

	private static List <user> users = new ArrayList<user>();
	
	public static List<user> searchPass(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public static List<user> serchName(String string) {
		// TODO Auto-generated method stub
		List <user> theName = new ArrayList<user>();
		for (int i =0 ; i< users.size();i++) {
			if(users.get(i).getusername().contains(string))
				theName.add(users.get(i));
		}
		return theName;
	}

}
