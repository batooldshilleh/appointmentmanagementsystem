package pak.proj;

import java.util.ArrayList;
import java.util.List;

public class Login {
	private static List <user> users = new ArrayList<user>();
	static boolean n;
	static boolean m;
	public static List<user> searchPass(String string) {
		List <user> pass = new ArrayList<user>();
		for (int i =0 ; i< users.size();i++) {
			if(users.get(i).getpsse().contains(string))
				pass.add(users.get(i));
		}
		return pass;
	}

	public static List<user> serchName(String string) {
		
		List <user> theName = new ArrayList<user>();
		for (int i =0 ; i< users.size();i++) {
			if(users.get(i).getusername().contains(string))
				theName.add(users.get(i));
		}
		return theName;
	}

		 public static boolean isnameAvailable(String name) {
		    	for (int i = 0 ; i<users.size();i++) {
					if (users.get(i).getusername().equals(name))
						n= true;
				}
				return n;
		 }
		   	 public static boolean ispassAvailable(String pass) {
		   	    	for (int i = 0 ; i<users.size();i++) {
		   				if (users.get(i).getpsse().equals(pass))
		   					m= true;
		   			}
					return m;
		   	 }

			public static void addloog(user user) {
				// TODO Auto-generated method stub
				users.add(user);
			}

}
