package labassign9;

public class Buyer { //Buyer Class 
	int money, i; 
	int bonusPoint=0;
	Product item[] =new Product [10]; //사용자가 입력한 item을 저장할 array 선언 
	void buy(Product pd){ //buy 메서드 
		if(pd.price>money){ //money보다 price가 클 경우 
			System.out.println("Money is not enough.\n");
			summary(); //summary 호출 
			System.exit(0); //수행 종료 
		}
		System.out.println("You bought "+pd+"("+pd.price+")");
		money=money-pd.price; //돈 지불하고 남은 금액 계산 
		bonusPoint=bonusPoint+pd.bonusPoint; //보너스 포인트 계산 
		item[i++]=pd; //array에 product 저장 
	}
	void summary(){ //summary 메서드 
		System.out.print("Shopping list: ");
		for(int j=0;j<i;j++) 
		System.out.print(item[j]+" "); //item print
		
		System.out.println("\nMoney left: "+money); //money print
		System.out.println("Current bonus point: "+bonusPoint); //bonus point print
	}
}
