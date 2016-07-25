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
		StaticDemo s2=new StaticDemo();//class StaticDemo�� ���� ��ü ����(�ڱ� �ڽ� class�� ���� ��ü����)
		s1.count++; s2.count++; 
		s1.writeOutput(); s2.writeOutput();
		s1.count_s++; s2.count_s++; //���������� �̿��� static variable ����
		s1.writeOutput(); s2.writeOutput();
		StaticDemo.count_s++; //class �̸����� static variable ���� (static variable �� class variable) 
		s1.writeOutput(); s2.writeOutput();
		//writeOutput();->writeOutput()�� static���� �����ϸ� ���� 
		//���� ���� �� ��� ��ü ������ �ʿ����
	}
	
}
