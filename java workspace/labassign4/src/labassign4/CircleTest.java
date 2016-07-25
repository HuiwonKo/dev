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
		Circle c=new Circle(); //Circle 에 대한 객체 생성
		Scanner s=new Scanner(System.in); //사용자 입력을 위한 Scanner 
		System.out.println("Input the radius"); 
		radius=s.nextInt(); //radius 입력받음
		c.showCircle(radius); //showCircle 메서드 호출 
	} 
}
