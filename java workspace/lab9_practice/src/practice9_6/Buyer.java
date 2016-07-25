package practice9_6;

public class Buyer {
	int money=1000;
	int bonusPoint=0;
	
	void buy(Product pd){
		if(pd.price>money){
			System.out.println("Money is not enough");
			System.exit(0);
		}
		money=money-pd.price;
		bonusPoint+=pd.bonusPoint;
	}
}
