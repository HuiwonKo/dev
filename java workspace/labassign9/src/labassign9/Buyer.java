package labassign9;

public class Buyer { //Buyer Class 
	int money, i; 
	int bonusPoint=0;
	Product item[] =new Product [10]; //����ڰ� �Է��� item�� ������ array ���� 
	void buy(Product pd){ //buy �޼��� 
		if(pd.price>money){ //money���� price�� Ŭ ��� 
			System.out.println("Money is not enough.\n");
			summary(); //summary ȣ�� 
			System.exit(0); //���� ���� 
		}
		System.out.println("You bought "+pd+"("+pd.price+")");
		money=money-pd.price; //�� �����ϰ� ���� �ݾ� ��� 
		bonusPoint=bonusPoint+pd.bonusPoint; //���ʽ� ����Ʈ ��� 
		item[i++]=pd; //array�� product ���� 
	}
	void summary(){ //summary �޼��� 
		System.out.print("Shopping list: ");
		for(int j=0;j<i;j++) 
		System.out.print(item[j]+" "); //item print
		
		System.out.println("\nMoney left: "+money); //money print
		System.out.println("Current bonus point: "+bonusPoint); //bonus point print
	}
}
