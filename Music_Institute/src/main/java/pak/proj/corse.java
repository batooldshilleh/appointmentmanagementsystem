package pak.proj;

import java.util.ArrayList;
import java.util.List;

public class corse {
    
	private int corse_namber;
	private String corse_name;
	private int corse_price;
	private int NumberOfStudent;
	
 	public static List<corse> corses =new ArrayList<corse>();
    
    public corse(){
    	corse.corses.add(new corse(1,"playing violin",200,10));
    	corse.corses.add(new corse(2,"playing guitar",200,15));
    	corse.corses.add(new corse(3,"Piano Playing",300,14));
    	corse.corses.add(new corse(4,"Fundamentals of musicology",200,15));	
    	corse.corses.add(new corse(5,"musical dictation",200,24));
    	corse.corses.add(new corse(6,"Singing principles",200,25));
    	
    }
    public corse(int n ,String string, int string2, int string3) {
    	this.corse_namber = n;
    	this.NumberOfStudent = string3;
    	this.corse_name = string;
    	this.corse_price = string2;
    	
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

	
	
		  public corse corseinfo(int inp) {
		    	corse c = new corse();
				for (int i = 0;i<corses.size();i++) {
					if (corses.get(i).getCN() == inp) {
						c = corses.get(i);
						break;
					}
				}
				return c;
		    }
		public void incstudantNumber(int cn) {
			// TODO Auto-generated method stub
			
			corse c = new corse();
			
			int n = c.corseinfo(cn).NumberOfStudent;
			n++;
			System.out.println(n);
			
		}
	

}

	

