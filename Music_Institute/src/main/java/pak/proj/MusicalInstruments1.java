package pak.proj;

import java.util.ArrayList;
import java.util.List;

public class MusicalInstruments1 {
	

	 
 String name;
 String name2;
 String name3;
 int price;
 boolean inst;
 protected static final List<MusicalInstruments1> music =new ArrayList<MusicalInstruments1>();
	public MusicalInstruments1(){
		String n ="Nablus:Sofian Street";
		MusicalInstruments1.music.add(new MusicalInstruments1("Piano",n,"Music Store Pro",700));
		MusicalInstruments1.music.add(new MusicalInstruments1("Guitar",n,"MUSIC GATE",300));
		MusicalInstruments1.music.add(new MusicalInstruments1("Organ",n,"Music Store Pro",200));
		MusicalInstruments1.music.add(new MusicalInstruments1("Saxophone",n,"Soul",400));
		MusicalInstruments1.music.add(new MusicalInstruments1("Violin",n,"Soul",300));
	}
	
	MusicalInstruments1(String name,String name2,String name3,int price){
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
	
	for (int i = 0;i<music.size();i++) {
			music.get(i);
	
	}	
		
	
	
}

}
