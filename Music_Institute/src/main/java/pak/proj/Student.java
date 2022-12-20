package pak.proj;

import java.util.ArrayList;
import java.util.List;


public class Student {


	
	    User u = new User();
	    private String name;
	    protected static  List<Corse> coursee= new ArrayList<Corse>() ;
		protected static final  int MAXCOURSES = 4;
		protected boolean sucss;
		protected int amontofmony;
		
	    public Student(String name){  
	        this.name = name;
	        
	    }
	    
	    
	    public Student() {
			
	    	Student.coursee.add(new Corse(1,"playing violin",200,10));
	    	Student.coursee.add(new Corse(1,"playing violin",200,25));
		}


		
	  
	  
	 


		public void sucsses(boolean b) {
		
			this.sucss = b ;
		}


		public boolean getsucss() {
		
			
			return sucss;
		}


		public int itsRegest(int n) {
		
			
			int c = 0;
			for (int i = 0;i<coursee.size();i++) {
				if ((coursee.get(i)).getCN() == n) {
					c = coursee.get(i).getCN();
					break;
				}
			}
			return c;
		}


		public void addcorse(int cn) {
	
			Corse c = new Corse();
			String n=c.corseinfo(cn).getcorsename();
			int con =c.corseinfo(cn).getCN();
			int p =c.corseinfo(cn).getprice();
			int sn =c.corseinfo(cn).getnos();
			Student.coursee.add(new Corse(con,n,p,sn));
			
		}


		public boolean haveinofmony() {
			
			int n = u.userinfo(name).getaom();
			n--;
		    boolean falg = true;
			if(n != 0) {
				falg = false;
			}
			return falg;
		}  
	
	    public boolean corsinfo(int inp) {
	    	boolean b =false ;
			for (int i = 0;i<coursee.size();i++) {
				if (coursee.get(i).getCN()==inp) {
					b = true;
					break;
				}
				else b = false;
			}
			return b;
	    
	
	    }
}
