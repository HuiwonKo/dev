package lab7_practice;

import java.util.Scanner;

public class TimeTest {
	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		System.out.println("How many times do you want to generate?");
		int n=keyboard.nextInt();
		Time[] t=new Time[n];
		int i;
		for(i=0;i<t.length;i++){
			t[i]=new Time(); //generating instance !! 제일 중요
			t[i].hour=randNum(24); //randNum 이 static 이므로 그냥 바로 호출
			t[i].minute=randNum(60);
			t[i].second=randNum(60);
		}
		for(i=0;i<t.length;i++){
			System.out.println("<Time"+(i+1)+"Hour:"+t[i].hour+"\tMin:"+t[i].minute+"\tSec:"+t[i].second);
		}
	}
	public static int randNum(int n){
		return (int)(Math.random()*n); //Math.random()*n 
	}
}
