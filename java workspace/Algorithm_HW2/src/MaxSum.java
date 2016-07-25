import java.util.Scanner;

public class MaxSum {
public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in); //키보드 입력을 위한 Scanner class 객체 생성 
	int number; //배열의 원소의 갯수
	number=keyboard.nextInt(); //사용자로부터 배열의 원소의 갯수 입력받음 
	int[] array=new int[number]; //원소들을 저장할 배열 생성
	for(int i=0;i<number;i++){
		array[i]=keyboard.nextInt();
	} //사용자로부터 배열의 원소들을 입력받음 
	
	
	Method1 m1=new Method1(number,array); //Method1 
	long startTime=System.currentTimeMillis(); //compute 메서드 실행 직전 현재 시각 측정 (단위는 milli second) 
	m1.compute(); //Method1 수행 
	long endTime=System.currentTimeMillis(); //compute 메서드 실행 직후 시각 측정 (단위는 milli second)
	System.out.println("The execution time = "+(endTime-startTime)/(double)1000+" msec"); //milli second를 second 로 단위 변환하여 수행시간 출력
	
	Method2 m2=new Method2(number,array); //Method2
	startTime=System.currentTimeMillis(); //compute 메서드 실행 직전 현재 시각 측정 (단위는 milli second)
	m2.print(); //Method2 수행 및 결과 출력 
	endTime=System.currentTimeMillis(); //compute 메서드 실행 직후 시각 측정 (단위는 milli second) 
	System.out.println("The execution time = "+(endTime-startTime)/(double)1000+" msec"); //milli second를 second 로 단위 변환하여 수행시간 출력
	
	Method3 m3=new Method3(number,array); //Method3
	startTime=System.currentTimeMillis(); //compute 메서드 실행 직전 현재 시각 측정 (단위는 milli second) 
	m3.compute(); //Method3 수행 
	endTime=System.currentTimeMillis(); //compute 메서드 실행 직후 시각 측정 (단위는 milli second)
	System.out.println("The execution time = "+(endTime-startTime)/(double)1000+" msec"); //milli second를 second 로 단위 변환하여 수행시간 출력
	
}
}
