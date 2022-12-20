	package pak.proj;
	
	
import java.util.ArrayList;

import java.util.List;

	
	import java.util.logging.Logger;

	public class Calender 
	{

		
		 static Logger logger
		   = Logger.getLogger(Calender.class.getName());
		 
		 String day;
		 String month;
		 String hours;
		 String menet;
		 protected static List<Calender> date1 =new ArrayList<Calender>();
		 
		public Calender() {
			Calender.date1.add(new Calender("1","5","12","30"));
			
		}
	public Calender(String day2, String month2, String hours2, String menet2) {
			this.month=month2;
			this.day=day2;
			this.menet=menet2;
			this.hours=hours2;
		}

    
	

	
	public void setDay(String string) {
		this.day = string;
		
	}
	public void setMonth(String string) {
		this.month =string;
		
	}
	public void setTime(String string3, String string4) {
		this.hours=string3;
		this.menet=string4;
		
	}
	public String getDay() {
		
		return day;
	}
	public String getMonth() {
		
		return month;
	}
public String getMenet() {
		
		return menet;
	}
public String getHours() {
	
	return hours;
}

	public boolean isBooked(String string, String string2, String string3, String string4) {
		 
		 for (int i = 0 ; i<date1.size();i++) {
				if (date1.get(i).getMonth().equals(string) && date1.get(i).getDay().equals(string2)&& date1.get(i).getMenet().equals(string3) && date1.get(i).getHours().equals(string4))
					
					   return true;
			}
		 
		return false;
	}
	

	
  
	
	}