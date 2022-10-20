package pak.proj;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;


import softw1.*;


public class Course {
	private int corse_namber;
	private String corse_name,teacher;
	private int corse_price;
	private int NumberOfStudent;
	
 	public static List<Course> corses =new ArrayList<Course>();
    
    public Course(){
    	Course.corses.add(new Course(1,"playing violin","ali",200,10));
    	Course.corses.add(new Course(2,"playing guitar","batool",200,15));
    	Course.corses.add(new Course(3,"Playing Piano","batool",300,14));
    	Course.corses.add(new Course(4,"Fundamentals of musicology","manar",200,15));	
    	Course.corses.add(new Course(5,"musical dictation","samer",200,15));
    	Course.corses.add(new Course(6,"Singing principles","manar",200,25));
    	
    }
    public Course(int n ,String string,String teacher, int string2, int string3) {
    	this.corse_namber = n;
    	this.NumberOfStudent = string3;
    	this.corse_name = string;
    	this.corse_price = string2;
    	this.teacher=teacher;
    	
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
	     		this.corse_namber+" "+ this.corse_name +" "+ this.teacher +" "+ this.corse_price+" "+this.NumberOfStudent;
	 }
    
}
