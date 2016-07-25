package labassign9;

import java.util.Scanner;

public class Buyer_main {
	public static void main(String[] args) {
		System.out.println("===========================");
		System.out.println("Major:Computer Engineering");
		System.out.println("ID:1415005");
		System.out.println("Name:Ko Huiwon");
		System.out.println("===========================");
		Scanner s=new Scanner(System.in); //����� input�� ���� Scanner 
		Buyer b=new Buyer(); //Buyer ��ü ����
		Product[] pd=new Product[5]; //Product �� ���� object array 
		pd[0]=new Tv(); //Tv �ν��Ͻ� ���� 
		pd[1]=new Computer(); //Computer �ν��Ͻ� ���� 
		pd[2]=new Video(); //Video �ν��Ͻ� ���� 
		pd[3]=new Audio(); //Audio �ν��Ͻ� ���� 
		pd[4]=new NoteBook(); //NoteBook �ν��Ͻ� ����   
		//polymorphism  
		System.out.println("How much money do you have?");
		int money=s.nextInt(); //money input
		b.money=money; //Buyer�� instance variable�� �Է¹��� ���� set
		int n=0; //n�� 0���� �ʱ�ȭ 
		do{ //do while 
		System.out.println("What do you want to buy? Input 0 to quit.");
		System.out.println("1.Tv(100) 2.Computer(200) 3.Video(110) 4.Audio(50) 5.NoteBook(300)");
			n=s.nextInt(); //��ǰ ����
			switch(n){ //n�� ���� 
			case 0: 
				break; 
			case 1:
				b.buy(pd[n-1]); //Buyer�� buy �޼��� ȣ�� 
				break;
			case 2:
				b.buy(pd[n-1]);
				break;
			case 3:
				b.buy(pd[n-1]);
				break;
			case 4:
				b.buy(pd[n-1]);
				break;
			case 5:
				b.buy(pd[n-1]);
				break;
			default:
					System.out.println("No such item"); //�Է¹��� n�� 0~5�� ���� �ȿ� ���� ��� 
			}
		}while(n!=0); //n�� 0�� �ƴ� ���� ���� 
		b.summary(); //Buyer�� summary �޼��� ȣ�� 
		}
	}

