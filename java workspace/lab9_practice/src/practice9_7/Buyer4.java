package practice9_7;

public class Buyer4 {
	public static void main(String[] args) {
		Buyer b=new Buyer();
		
		Tv t=new Tv();
		Computer c=new Computer();
		Audio a=new Audio();
		
		b.buy(t);
		b.buy(c);
		b.buy(a);
		
		b.summary();
	}
}
