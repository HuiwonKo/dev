package labassign13;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Student {
	String name;
	int ID;
	int age; //instance variable
	public static void main(String[] args) {
		ArrayList<Student> list=new ArrayList<Student>(); //List instance 
		Scanner s=new Scanner(System.in); 
		System.out.println("Input Student Name,ID,and age. 0 for name to quit.");
		while(true) //infinite loop
		{
		Student st=new Student(); //Student instance
		st.name=s.next();
		if(st.name.equals("0")) //if name is 0 
			break;
		st.ID=s.nextInt();
		st.age=s.nextInt();
		list.add(st); //add to list
		}
		System.out.println("NUMBER\tNAME\tID\tAGE");
		PrintResult(list); //print list
		System.out.println("Input new Student Name,ID,and age, and the location");
		Student st=new Student(); //Student instance
		st.name=s.next();
		st.ID=s.nextInt();
		st.age=s.nextInt();
		int location=s.nextInt(); 
		list.add((location-1),st); //add to list 
		PrintResult(list); //print list
		System.out.println("Input Student Number to delete");
		int n=s.nextInt();
		list.remove((n-1)); //remove nth element of list
		PrintResult(list); //print list
	}
	public static void PrintResult(ArrayList<Student> student){ //print list
		for(int index=0;index<student.size();index++)
		System.out.println((index+1)+"\t"+student.get(index).name+"\t"+student.get(index).ID+"\t"+student.get(index).age);
	}
}
