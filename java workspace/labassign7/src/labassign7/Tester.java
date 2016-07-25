package labassign7;

import java.util.Scanner;

public class Tester {
	public static void main(String[] args) {
		Animal[] zoo=new Animal[5]; //Animal 클래스에 대한 객체 참조 변수 배열 선언 
		Scanner s=new Scanner(System.in); //사용자 input을 위한 Scanner
		System.out.println("Input animal list");
		for(int i=0;i<5;i++){ //instance variable 초기화
 			zoo[i]=new Animal(); //각 Animal 에 대한 객체 생성 
		System.out.print("Name:");
		zoo[i].name=s.next(); //name input
		System.out.print("Species:");
		zoo[i].species=s.next(); //species input 
		System.out.print("Gender:");
		zoo[i].gender=s.next();//gender input
		System.out.print("Weight:");
		zoo[i].weight=s.nextDouble();//weight input
		}	
		System.out.println("<Animal List>");
		System.out.println("Name	Species	Gender	Weight	");
		for(int i=0;i<5;i++){
		printAnimal(zoo,i); //printAnimal 메서드 호출 (Animal List 출력)
		}
		System.out.println("Male or Female?");
		try{
			String answer=s.next(); //사용자로부터 gender 입력받음
			System.out.println(answer+"animals are..."); 
			if(answer.equalsIgnoreCase("M")||answer.equalsIgnoreCase("F")){ //사용자 입력이 M또는 F이면 
				System.out.println("Name	Species	Gender	Weight	");
			printMaleOrFemale(zoo,answer); //printMaleOrFemale 메서드 호출
			}
			else //나머지 경우 
				throw new Exception(); //예외 throw
			}
		catch(Exception e){ //예외 처리 
			System.out.println("Your input is wrong!"); //출력 
		}
		System.out.println("End of program");
	}
	public static void printAnimal(Animal zoo[], int i){ //Animal 배열의 i번째 인스턴스 변수 출력 
		System.out.println(zoo[i].name+"	"+zoo[i].species+"	"+zoo[i].gender+"	"+zoo[i].weight);
		}
	public static void printMaleOrFemale(Animal arr[],String gender){ //넘겨받은 gender 과 일치할 경우 printAnimal 호출하는 메서드
		for(int i=0;i<5;i++){
		if(arr[i].gender.equalsIgnoreCase(gender)) //넘겨받은 gender 와 instance variable gender이 일치할 경우 
			printAnimal(arr,i); //printAnimal 호출 
		}
	}
}
