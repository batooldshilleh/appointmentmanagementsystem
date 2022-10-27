

import java.util.ArrayList;
import java.util.List;

public class Purchase_invoice {
private String name;
private int price,Amount,remainder;
public static List<Purchase_invoice> bill =new ArrayList<Purchase_invoice>();

public Purchase_invoice() {
	bill.add(new Purchase_invoice("saja",250,300,250));
	bill.add(new Purchase_invoice("ahmad",250,250,0));
	
}
public Purchase_invoice(String name ,int price,int amount,int re) {
	this.Amount=amount;
	this.name=name;
	this.price=price;
	this.remainder=re;
	
}


public int ammount(int n) {
	
	int t=n*250;
	
	return t;
	
	
	
}


public boolean isname1Equal(String name){
    return this.name.toLowerCase().equals(name);
}











}
