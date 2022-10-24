package pak.proj;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import pak.proj.*;
public class Student {

	static Logger logger = Logger.getLogger(Student.class.getName());
	
	    user u = new user();
	    private String name;
	    public static List<corse> Course1= new ArrayList<corse>() ;
		protected final int maxCourses = 4;
		public boolean sucss;
		public int amontofmony;
	    public Student( String name, ArrayList<corse> Course1){  
	        this.name = name;
	        this.Course1= Course1;
	    }
	    
	    
	    public Student() {
			// TODO Auto-generated constructor stub
	    	Student.Course1.add(new corse(1,"playing violin",200,10));
		}


		public String getstudentName(){
	        return this.name;
	    }
	    public void setstudentName(String Name){
	        this.name = Name;
	    }
	  
	  
	    public boolean addco(corse Course){

			if (!Course1.contains(Course)){
				Course1.add(Course);
				return true;
			}
			return false;
		}


		public void Sucsses(boolean b) {
			// TODO Auto-generated method stub
			this.sucss = b ;
		}


		public boolean getsucss() {
			// TODO Auto-generated method stub
			
			return sucss;
		}


		public int itsRegest(int n) {
			// TODO Auto-generated method stub
			
			int c = 0;
			for (int i = 0;i<Course1.size();i++) {
				if (((corse) Course1.get(i)).getCN() == n) {
					c = Course1.get(i).getCN();
					break;
				}
			}
			return c;
		}


		public void addcorse(int cn) {
			// TODO Auto-generated method stub
			corse c = new corse();
			String n=c.corseinfo(cn).getcorsename();
			int con =c.corseinfo(cn).getCN();
			int p =c.corseinfo(cn).getprice();
			int sn =c.corseinfo(cn).getnos();
			Student.Course1.add(new corse(con,n,p,sn));
			
		}


		public boolean haveinofmony(String un) {
			
			int n = u.userinfo(name).getaom();
			n--;
			// TODO Auto-generated method stub
			if(n != 0) {
				return false;
			}
			else{
				return true;
			}
		}  
	
	
	
	
}
