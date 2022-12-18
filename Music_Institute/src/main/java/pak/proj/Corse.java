package pak.proj;

import java.util.ArrayList;
import java.util.List;

public class Corse {
    
	private int corsenamber;
	private String corsename;
	private int corseprice;
	private int numberOfStudent;
	
	protected static final List<Corse> corses =new ArrayList<Corse>();
    
    public Corse(){
    	Corse.corses.add(new Corse(1,"playing violin",200,10));
    	Corse.corses.add(new Corse(2,"playing guitar",200,15));
    	Corse.corses.add(new Corse(3,"Piano Playing",300,14));
    	Corse.corses.add(new Corse(4,"Fundamentals of musicology",200,15));	
    	Corse.corses.add(new Corse(5,"musical dictation",200,24));
    	Corse.corses.add(new Corse(6,"Singing principles",200,25));
    	
    }
    public Corse(int n ,String string, int string2, int string3) {
    	this.corsenamber = n;
    	this.numberOfStudent = string3;
    	this.corsename = string;
    	this.corseprice = string2;
    	
    }
	
	public void setCorsname(String string) {
			
			this.corsename = string;
		} 
	public void setPrice(int p) {
			
			this.corseprice = p;
		}
	public void setNOS(int n) {
		
		this.numberOfStudent = n;
	}
	public void setCN(int n) {
			
			this.corsenamber = n;
		}
	public String getcorsename() {
			
			return corsename;
		}
	public int getCN() {
		
		return corsenamber;
	}
	public int getprice() {
		
		return corseprice;
	}
	
	public int getnos() {
			
			return numberOfStudent;
		}

	
	 public Corse corseinfo(int inp) {
	    	Corse c = new Corse();
			for (int i = 0;i<corses.size();i++) {
				if (corses.get(i).getCN() == inp) {
					c = corses.get(i);
					break;
				}
			 }

				return c;
		   
	 }
			
		public Corse incstudantNumber() {
		
			
			return new Corse();
	    }

	

}

	

