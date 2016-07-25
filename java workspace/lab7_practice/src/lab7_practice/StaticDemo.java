package lab7_practice;

public class StaticDemo {
	public int count=0;
	public static int count_s=0; 
	
	public void writeOutput(){
		System.out.print("count="+count);
		System.out.println("count_s="+count_s);
	} 
	
	public static void main(String[] args){
		StaticDemo s1=new StaticDemo(); 
		StaticDemo s2=new StaticDemo();//class StaticDemo에 대한 객체 생성(자기 자신 class에 대한 객체생성)
		s1.count++; s2.count++; 
		s1.writeOutput(); s2.writeOutput();
		s1.count_s++; s2.count_s++; //참조변수를 이용한 static variable 접근
		s1.writeOutput(); s2.writeOutput();
		StaticDemo.count_s++; //class 이름으로 static variable 접근 (static variable 은 class variable) 
		s1.writeOutput(); s2.writeOutput();
		//writeOutput();->writeOutput()을 static으로 선언하면 가능 
		//위와 같이 할 경우 객체 생성이 필요없음
	}
	
}
