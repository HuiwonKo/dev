package labassign9;

import java.util.Scanner;

public class Buyer_main {
	public static void main(String[] args) {
		System.out.println("===========================");
		System.out.println("Major:Computer Engineering");
		System.out.println("ID:1415005");
		System.out.println("Name:Ko Huiwon");
		System.out.println("===========================");
		Scanner s=new Scanner(System.in); //사용자 input을 위한 Scanner 
		Buyer b=new Buyer(); //Buyer 객체 생성
		Product[] pd=new Product[5]; //Product 에 대한 object array 
		pd[0]=new Tv(); //Tv 인스턴스 생성 
		pd[1]=new Computer(); //Computer 인스턴스 생성 
		pd[2]=new Video(); //Video 인스턴스 생성 
		pd[3]=new Audio(); //Audio 인스턴스 생성 
		pd[4]=new NoteBook(); //NoteBook 인스턴스 생성   
		//polymorphism  
		System.out.println("How much money do you have?");
		int money=s.nextInt(); //money input
		b.money=money; //Buyer의 instance variable에 입력받은 값을 set
		int n=0; //n을 0으로 초기화 
		do{ //do while 
		System.out.println("What do you want to buy? Input 0 to quit.");
		System.out.println("1.Tv(100) 2.Computer(200) 3.Video(110) 4.Audio(50) 5.NoteBook(300)");
			n=s.nextInt(); //제품 선택
			switch(n){ //n에 따라 
			case 0: 
				break; 
			case 1:
				b.buy(pd[n-1]); //Buyer의 buy 메서드 호출 
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
					System.out.println("No such item"); //입력받은 n이 0~5의 범위 안에 없을 경우 
			}
		}while(n!=0); //n이 0이 아닐 동안 수행 
		b.summary(); //Buyer의 summary 메서드 호출 
		}
	}

