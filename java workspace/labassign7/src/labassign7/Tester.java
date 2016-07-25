package labassign7;

import java.util.Scanner;

public class Tester {
	public static void main(String[] args) {
		Animal[] zoo=new Animal[5]; //Animal Ŭ������ ���� ��ü ���� ���� �迭 ���� 
		Scanner s=new Scanner(System.in); //����� input�� ���� Scanner
		System.out.println("Input animal list");
		for(int i=0;i<5;i++){ //instance variable �ʱ�ȭ
 			zoo[i]=new Animal(); //�� Animal �� ���� ��ü ���� 
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
		printAnimal(zoo,i); //printAnimal �޼��� ȣ�� (Animal List ���)
		}
		System.out.println("Male or Female?");
		try{
			String answer=s.next(); //����ڷκ��� gender �Է¹���
			System.out.println(answer+"animals are..."); 
			if(answer.equalsIgnoreCase("M")||answer.equalsIgnoreCase("F")){ //����� �Է��� M�Ǵ� F�̸� 
				System.out.println("Name	Species	Gender	Weight	");
			printMaleOrFemale(zoo,answer); //printMaleOrFemale �޼��� ȣ��
			}
			else //������ ��� 
				throw new Exception(); //���� throw
			}
		catch(Exception e){ //���� ó�� 
			System.out.println("Your input is wrong!"); //��� 
		}
		System.out.println("End of program");
	}
	public static void printAnimal(Animal zoo[], int i){ //Animal �迭�� i��° �ν��Ͻ� ���� ��� 
		System.out.println(zoo[i].name+"	"+zoo[i].species+"	"+zoo[i].gender+"	"+zoo[i].weight);
		}
	public static void printMaleOrFemale(Animal arr[],String gender){ //�Ѱܹ��� gender �� ��ġ�� ��� printAnimal ȣ���ϴ� �޼���
		for(int i=0;i<5;i++){
		if(arr[i].gender.equalsIgnoreCase(gender)) //�Ѱܹ��� gender �� instance variable gender�� ��ġ�� ��� 
			printAnimal(arr,i); //printAnimal ȣ�� 
		}
	}
}
