package practice9_5;

public class Buyer2 {
	public static void main(String[] args) {
	Buyer b=new Buyer();
	Product tv=new Tv();
	Product cp=new Computer();
	Product ad=new Audio();
	
	b.buy(tv);
	b.buy(cp);
	b.buy(ad);
	
	System.out.println(tv.toString());
	System.out.println("Cost:"+tv.price);
	System.out.println(cp.toString());
	System.out.println("Cost:"+cp.price);
	System.out.println(ad.toString());
	System.out.println("Cost:"+ad.price);
	System.out.println("Money left: "+b.money);
	System.out.println("Current bonus point:"+b.bonusPoint);
	}
}
