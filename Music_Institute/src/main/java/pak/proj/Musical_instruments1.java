package pak.proj;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Musical_instruments1 {
	
	 static Logger logger
	   = Logger.getLogger(main.class.getName());
	 
 String name,name2,name3;
 int price;
 boolean inst;
	public static List<Musical_instruments1> music =new ArrayList<Musical_instruments1>();
	public Musical_instruments1(){
		
		Musical_instruments1.music.add(new Musical_instruments1("Piano","Nablus:Sofian Street","Music Store Pro",700));
		Musical_instruments1.music.add(new Musical_instruments1("Guitar","Nablus:Sofian Street","MUSIC GATE",300));
		Musical_instruments1.music.add(new Musical_instruments1("Organ","Nablus:Old Town ","Music Store Pro",200));
		Musical_instruments1.music.add(new Musical_instruments1("Saxophone","Nablus:Old Town ","Soul",400));
		Musical_instruments1.music.add(new Musical_instruments1("Violin","Nablus:Sofian Street","Soul",300));
	}
	
	Musical_instruments1(String name,String name2,String name3,int price){
		this.name=name;
		this.price=price;	
		this.name2=name2;
		this.name3=name3;
	}

public void setinst(boolean l) {
		
		this.inst = l;
	}
	
	
public boolean getinst() {
	
	return inst;
}
	
@Override
public String toString() {
	
    return 
    		this.name+" " + this.name2 +" "+ this.name3 +" "+ this.price;
}

public void printinfo() {
	Musical_instruments1 b = new Musical_instruments1();
	for (int i = 0;i<music.size();i++) {
			b = music.get(i);
			logger.log(Level.INFO,b.toString());
	}	
		
	
	
}

}
