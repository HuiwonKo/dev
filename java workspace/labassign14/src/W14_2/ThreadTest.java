package W14_2;

import java.util.Scanner;

public class ThreadTest {
	public static void main(String[] args) {
		System.out.println("===========================");
		System.out.println("Major:Computer Engineering");
		System.out.println("ID:1415005");
		System.out.println("Name:Ko Huiwon");
		System.out.println("===========================");
		Scanner s=new Scanner(System.in);
		System.out.println("Input the number of coin toss:");
		int num=s.nextInt(); //number of coin toss 
		SharedArea sharedArea=new SharedArea(); //SharedArea instance 
		SimulThread t1=new SimulThread(num,sharedArea); //SimulThread instance 
		PrintThread t2=new PrintThread(sharedArea); //PrintThread instance 
		
		t1.start(); 
		t2.start(); //start (call run())
	}
}
