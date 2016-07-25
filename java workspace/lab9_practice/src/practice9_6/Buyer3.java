package practice9_6;

public class Buyer3 {
	public static void main(String[] args) {
		Buyer b=new Buyer();
		Product pd[]=new Product[3];
		
		pd[0]=new Tv();
		pd[1]=new Computer();
		pd[2]=new Audio();
		
		for(int i=0;i<3;i++){
			b.buy(pd[i]);
			
			System.out.println(pd[i].toString());
			System.out.println("Cost:"+pd[i].price);
		}
			System.out.println("Money left: "+b.money);
			System.out.println("Current bonus point:"+b.bonusPoint);
	}
}
