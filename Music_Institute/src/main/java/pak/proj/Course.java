package pak.proj;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;


<<<<<<< HEAD
=======
import pak.proj.*;
>>>>>>> branch 'master' of https://github.com/batooldshilleh/appointmentmanagementsystem


public class Course {
	 static Logger logger
	   = Logger.getLogger(Course.class.getName());
	private int corse_namber;
	private String corse_name,teacher,start,end,time;
	private int corse_price;
	private int NumberOfStudent;
	DateFormat dateFormat = new SimpleDateFormat("DD/MM/YYYY");
 	public static List<Course> corses =new ArrayList<Course>();
	
 	Date startDate;
 	Date endDate;
    public Course(){
    	Course.corses.add(new Course("playing violin","ali","12/10/2022","12/11/2002","09:00AM",10));
    	Course.corses.add(new Course("playing guitar","batool","12/10/2022","12/11/2002","11:00AM",15));
    	Course.corses.add(new Course("Playing Piano","batool","12/10/2022","12/11/2002","10:00AM",14));
    	Course.corses.add(new Course("Fundamentals of musicology","manar","12/7/2022","17/6/2023","09:00AM",15));	
    	Course.corses.add(new Course("musical dictation","samer","12/10/2022","12/4/2023","09:00AM",15));
    	Course.corses.add(new Course("Singing principles","manar","12/12/2022","12/1/2023","08:00AM",25));
    	
    }
    public Course(String string,String teacher,String start,String end,String time, int string2) {
    	
    	this.NumberOfStudent = string2;
    	this.corse_name = string;
    	this.start=start;
    	this.end=end;
    	this.time=time;
    	this.teacher=teacher;
//    	Date startDate = dateFormat.parse("11/03/2016");
//    	Date endDate = dateFormat.parse("11/23/2016");
    	
    }

	
	public void setCorsname(String string) {
			
			this.corse_name = string;
		} 
	public void setPrice(int p) {
			
			this.corse_price = p;
		}
	public void setNOS(int n) {
		
		this.NumberOfStudent = n;
	}
	public void setCN(int n) {
			
			this.corse_namber = n;
		}
	public String getcorsename() {
			
			return corse_name;
		}
	public int getCN() {
		
		return corse_namber;
	}
	public int getprice() {
		
		return corse_price;
	}
	
	public int getnos() {
			
			return NumberOfStudent;
		}

	 public boolean isnameteacherEqual(String name){
	        return this.teacher.toLowerCase().equals(name);
	    }
	 public boolean isstartEqual(String name){
	        return this.start.toLowerCase().equals(name);
	        
	    }
	 public boolean isendEqual(String name){
	        return this.end.toLowerCase().equals(name);
	        
	    }
	 public boolean istimeEqual(String name){
	        return this.time.toLowerCase().equals(name);
	    }
	 public Course corseinfo(int inp) {
	    	Course c = new Course();
			for (int i = 0;i<corses.size();i++) {
				if (corses.get(i).getCN() == inp) {
					c = corses.get(i);
					break;
				}
			}
			return c;
	    }
	 
	 @Override
	 public String toString() {
	 	
	     return 
	     		 this.corse_name +" "+ this.teacher +" "+ this.start+" "+this.end+" "+this.time+" "+this.NumberOfStudent;
	 }
    
}
