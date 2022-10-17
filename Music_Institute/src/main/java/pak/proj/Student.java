package pak.proj;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import pak.proj.*;
public class Student {

	static Logger logger = Logger.getLogger(Student.class.getName());
	
	
	    private String name;
	    public static List<Course> Course1 ;
		protected final int maxCourses = 4;
		
	    public Student( String name, ArrayList<Course> Course1){  
	        this.name = name;
	        this.Course1= Course1;
	    }
	    
	    
	    public String getstudentName(){
	        return this.name;
	    }
	    public void setstudentName(String Name){
	        this.name = Name;
	    }
	  
	  
	    public boolean addco(Course Course){

			if (!Course1.contains(Course)){
				Course1.add(Course);
				return true;
			}
			return false;
		}  
	
	
	
	    
//	    public boolean dropCourse(Course course) { 
//			if (course.removeStudent(Student)) {
//				for(int i=0; i<courses.length; i++) {
//					if(courses[i] == course)
//						courses[i] = null;
//				}
//				numCoursesEnrolled--;
//				return true;
//			}
//			else return false;
//		}
	
	
}
