package labassign9;

public class Ambulance extends Car{ //Car Class ��ӹ��� Ambulance class(Child Class)
	Ambulance(String Emg, int number, String car_type, String req){ //data�� �ʱ�ȭ�ϱ� ���� constructor  
		super(Emg,number,car_type,req); //super ( Car�� constructor ȣ��) 
	}
	
	public String toString(){ //toString overriding 
		return getStr(); //getStr return 
	}
}
