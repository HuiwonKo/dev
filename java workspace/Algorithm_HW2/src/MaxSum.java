import java.util.Scanner;

public class MaxSum {
public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in); //Ű���� �Է��� ���� Scanner class ��ü ���� 
	int number; //�迭�� ������ ����
	number=keyboard.nextInt(); //����ڷκ��� �迭�� ������ ���� �Է¹��� 
	int[] array=new int[number]; //���ҵ��� ������ �迭 ����
	for(int i=0;i<number;i++){
		array[i]=keyboard.nextInt();
	} //����ڷκ��� �迭�� ���ҵ��� �Է¹��� 
	
	
	Method1 m1=new Method1(number,array); //Method1 
	long startTime=System.currentTimeMillis(); //compute �޼��� ���� ���� ���� �ð� ���� (������ milli second) 
	m1.compute(); //Method1 ���� 
	long endTime=System.currentTimeMillis(); //compute �޼��� ���� ���� �ð� ���� (������ milli second)
	System.out.println("The execution time = "+(endTime-startTime)/(double)1000+" msec"); //milli second�� second �� ���� ��ȯ�Ͽ� ����ð� ���
	
	Method2 m2=new Method2(number,array); //Method2
	startTime=System.currentTimeMillis(); //compute �޼��� ���� ���� ���� �ð� ���� (������ milli second)
	m2.print(); //Method2 ���� �� ��� ��� 
	endTime=System.currentTimeMillis(); //compute �޼��� ���� ���� �ð� ���� (������ milli second) 
	System.out.println("The execution time = "+(endTime-startTime)/(double)1000+" msec"); //milli second�� second �� ���� ��ȯ�Ͽ� ����ð� ���
	
	Method3 m3=new Method3(number,array); //Method3
	startTime=System.currentTimeMillis(); //compute �޼��� ���� ���� ���� �ð� ���� (������ milli second) 
	m3.compute(); //Method3 ���� 
	endTime=System.currentTimeMillis(); //compute �޼��� ���� ���� �ð� ���� (������ milli second)
	System.out.println("The execution time = "+(endTime-startTime)/(double)1000+" msec"); //milli second�� second �� ���� ��ȯ�Ͽ� ����ð� ���
	
}
}
