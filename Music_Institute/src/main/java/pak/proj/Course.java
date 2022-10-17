package pak.proj;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import pak.proj.*;

public class Course {
	private String courseName;
    private int numStudents;
    private String teacher,day,time;
    public static List<Course> Course =new ArrayList<Course>();
    public static List<Course> Course2 =new ArrayList<Course>();
    public static List<Student> Student ;
    static Logger logger = Logger.getLogger(Course.class.getName());
    
    public Course() {
    	
    	Course.add(new Course("Piano","Mohamad Omar",20,"Wednesday","09:00 AM"));
    	Course.add(new Course("How to Play Guitar","Manar jber",27,"Thursday","10:00 AM"));
    	Course.add(new Course("Music Production","Anas Toma",30,"Thursday","12:00 PM"));
    	Course.add(new Course("Classical Music","Batool Shilh",20,"Monday","11:00 AM"));
    	Course.add(new Course("Fundamentals of Music Theory","Ahmad ALNjar",15,"Monday","08:00 PM"));
    	
    	Course2.add(new Course("How to play the saxophone  ","Not booked",20,"Wednesday","10:00 AM"));
    	Course2.add(new Course("Oriental Music","Not booked",27,"Sunday","10:00 AM"));
    	
    	
    	
    	
    }
    
    public Course(String courseName,String teacher ,int noOfStudents,String day,String time){
      
        this.numStudents = noOfStudents;
        this.courseName = courseName;
        this.teacher =teacher;
        this.day=day;
        this.time=time;
        this.Student=new ArrayList<Student>();
    }
   
    public String getCourseName(){
        return this.courseName;
    }
    public int getNoOfStudents(){
        return this.numStudents;
    }
    public String getTeacher(){
        return this.teacher;
    }

    public void setCourseName(String courseName){
        this.courseName = courseName;
    }
    public void setNoOfStudents(int noOfStudents){
        this.numStudents = noOfStudents;
    }
    public void setTeacher(String teacher){
        this.teacher = teacher;
    }
    
    public boolean add(Student student){

		if (!Student.contains(student)){
			Student.add(student);
			return true;
		}
		return false;
	}  
    public void remove(Student student){
    	Student.remove(student);
	}
    
    public boolean isteacherEqual(String name){
        return this.teacher.toLowerCase().equals(name);
    }
    public boolean isnamecourseEqual(String name){
        return this.courseName.toLowerCase().equals(name);
    }
    
}
