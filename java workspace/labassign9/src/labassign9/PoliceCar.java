package labassign9;

public class PoliceCar extends Car{ //Car Class ��ӹ��� PoliceCar class(Child Class)
	public PoliceCar(String Emg, int number, String car_type, String req){ //data�� �ʱ�ȭ�ϱ� ���� constructor
		super(Emg,number,car_type,req); //super ( Car�� constructor ȣ��)
	}
	public String toString(){ //toString overriding 
		return getStr(); //getStr return 
	}
}
