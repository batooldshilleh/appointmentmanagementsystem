	package pak.proj;
	
	import java.text.ParseException;
	import java.text.SimpleDateFormat;
	import java.util.Date;
	import java.util.Locale;
	import java.util.logging.Level;
	import java.util.logging.Logger;

	public class Calender 
	{

		
		 static Logger logger
		   = Logger.getLogger(Calender.class.getName());
		 boolean v;
		 boolean book;
		 String time;
		 Date strt, end;
		public Calender() {
			v = true;
			
		}
	@SuppressWarnings("unlikely-arg-type")
	public boolean booking (Date start,Date end,String time) throws ParseException {
		
		for(int i=0;i<Corse.corses.size();i++) {
			String date1=Corse.corses.get(3).toString();
			String date2=Corse.corses.get(4).toString();
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MMM/yyyy", Locale.ENGLISH);
	        Date date3 = formatter.parse(date1);
	        Date date4 = formatter.parse(date2);
	        
	        if (date3.after(start)||date4.before(end)||start.equals(date3)||end.equals(date4))	
	        {	

	        	logger.log(Level.INFO,"choose anther date or time\n");

	        	v=false;
	        }
	        else {
	        
	        	logger.log(Level.INFO,"booking done\n");
	        	v=true;
	        	
	        }
	        
	       
		}
		return v;
	}
    
	public void setbookstat(boolean l) {
		
		this.book = l;
	}

	public boolean getbookstat() {
		
		return book;
	}
  
	
	}