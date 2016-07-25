package lab7_practice;

import java.util.Scanner;

public class TwoCatchsDemo {
	public static void main(String[] args) {
		try{
	System.out.println("Enter number of widgets "+"produced:");
	Scanner keyboard=new Scanner(System.in);
	int widgets=keyboard.nextInt();
	if(widgets<0)
		throw new NegativeNumberException("widgets"); //throwing exception
	System.out.println("How many were defective?");
	double defective=keyboard.nextDouble();
	if(defective<0)
		throw new NegativeNumberException("defective widgets"); //throwing exception 
	double ratio=exceptionalDivision(widgets,defective); //static 메서드 호출 
	System.out.println("One in every "+ratio+"widgets is defective.");
		}
		catch(DivideByZeroException e){ //catch exception 1 
			System.out.println("Congratulations! A perfect record!");	
		}
		catch(NegativeNumberException e){ //catch exception 2 
			System.out.println("Cannot have a negative number of "+e.getMessage());
		}
		System.out.println("End of program");
	}
	public static double exceptionalDivision(int numerator,double denominator) throws DivideByZeroException{
		//throws ExceptionName 
		if(denominator==0)
			throw new DivideByZeroException(); //throw new exception 
		return numerator/denominator;
	}
}
