package labassign9;

import java.util.Scanner;

public class Emergency { //Emergency class (Main method 포함)
	public static Car[] c1=new Car[10]; //사용자의 input을 저장할 Object array 선언 
	public static int j=0; //array variable 0으로 초기화 
	public static void main(String[] args) {
		System.out.println("===========================");
		System.out.println("Major:Computer Engineering");
		System.out.println("ID:1415005");
		System.out.println("Name:Ko Huiwon");
		System.out.println("===========================");
		int n=0; //사용자 입력 숫자 0으로 초기화
		Scanner s=new Scanner(System.in); //사용자 input을 위한 Scanner 
		Car[] c=new Car[3]; //Car type의 object array 
		c[0]=new FireEngine("Fire",119,"FireEngine","Firemen");
		c[1]=new PoliceCar("Thief",112,"PoliceCar","Policemen");
		c[2]=new Ambulance("Patient",119,"Ambulance","Doctor");
		//객체 생성-> polymorphism 이용 
		while(n!=5){ //n이 5가 아닐 동안 수행
		System.out.println("What kind of Emergency?");
		System.out.println("1.Fire 2.Patient 3.Thief 4.Record 5.End");
		n=s.nextInt(); //사용자 입력 n 
		switch(n){ //n에 따라 
		case 1:
		EM_Call(c[0]); //Call메서드 호출 
			break;
		case 2:
		EM_Call(c[1]);
			break;
		case 3:
		EM_Call(c[2]);
			break;
		case 4:
		EM_record(); //record 메서드 호출 
			break;
		case 5:
			break;
		}
		}
		System.out.println("Finished");
	}
	public static void EM_Call(Car c){ //main 메서드에서 접근해야 하므로 static으로 선언 
		System.out.println("Call "+c.getNumber()); //번호 출력
		c1[j++]=c; //array에 저장 
	}
	public static void EM_record(){ //main 메서드에서 접근해야 하므로 static으로 선언 
		System.out.println("Emergency\tNumber\tCar_Type\tRequired");
		for(int i=0;i<j;i++){ 
		System.out.println(c1[i].getStr());//array에 저장된 String 출력 (record) 
		}
		}
}
