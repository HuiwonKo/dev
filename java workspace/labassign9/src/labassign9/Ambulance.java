package labassign9;

public class Ambulance extends Car{ //Car Class 상속받은 Ambulance class(Child Class)
	Ambulance(String Emg, int number, String car_type, String req){ //data를 초기화하기 위한 constructor  
		super(Emg,number,car_type,req); //super ( Car의 constructor 호출) 
	}
	
	public String toString(){ //toString overriding 
		return getStr(); //getStr return 
	}
}
