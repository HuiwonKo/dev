package labassign9;

import java.util.Scanner;

public class Emergency { //Emergency class (Main method ����)
	public static Car[] c1=new Car[10]; //������� input�� ������ Object array ���� 
	public static int j=0; //array variable 0���� �ʱ�ȭ 
	public static void main(String[] args) {
		System.out.println("===========================");
		System.out.println("Major:Computer Engineering");
		System.out.println("ID:1415005");
		System.out.println("Name:Ko Huiwon");
		System.out.println("===========================");
		int n=0; //����� �Է� ���� 0���� �ʱ�ȭ
		Scanner s=new Scanner(System.in); //����� input�� ���� Scanner 
		Car[] c=new Car[3]; //Car type�� object array 
		c[0]=new FireEngine("Fire",119,"FireEngine","Firemen");
		c[1]=new PoliceCar("Thief",112,"PoliceCar","Policemen");
		c[2]=new Ambulance("Patient",119,"Ambulance","Doctor");
		//��ü ����-> polymorphism �̿� 
		while(n!=5){ //n�� 5�� �ƴ� ���� ����
		System.out.println("What kind of Emergency?");
		System.out.println("1.Fire 2.Patient 3.Thief 4.Record 5.End");
		n=s.nextInt(); //����� �Է� n 
		switch(n){ //n�� ���� 
		case 1:
		EM_Call(c[0]); //Call�޼��� ȣ�� 
			break;
		case 2:
		EM_Call(c[1]);
			break;
		case 3:
		EM_Call(c[2]);
			break;
		case 4:
		EM_record(); //record �޼��� ȣ�� 
			break;
		case 5:
			break;
		}
		}
		System.out.println("Finished");
	}
	public static void EM_Call(Car c){ //main �޼��忡�� �����ؾ� �ϹǷ� static���� ���� 
		System.out.println("Call "+c.getNumber()); //��ȣ ���
		c1[j++]=c; //array�� ���� 
	}
	public static void EM_record(){ //main �޼��忡�� �����ؾ� �ϹǷ� static���� ���� 
		System.out.println("Emergency\tNumber\tCar_Type\tRequired");
		for(int i=0;i<j;i++){ 
		System.out.println(c1[i].getStr());//array�� ����� String ��� (record) 
		}
		}
}
