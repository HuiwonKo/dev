package labassign4;

import java.util.Scanner;

public class CircleTest {
	public static void main(String[] args) {
		System.out.println("===========================");
		System.out.println("Major:Computer Engineering");
		System.out.println("ID:1415005");
		System.out.println("Name:Ko Huiwon");
		System.out.println("===========================");
		int radius;
		Circle c=new Circle(); //Circle �� ���� ��ü ����
		Scanner s=new Scanner(System.in); //����� �Է��� ���� Scanner 
		System.out.println("Input the radius"); 
		radius=s.nextInt(); //radius �Է¹���
		c.showCircle(radius); //showCircle �޼��� ȣ�� 
	} 
}
