package labassign9;

public class Car { //Car Class (Ambulance, PoliceCar, FireEngine 이 하위 class) 
	private String Emg;
	private int number;
	private String car_type;
	private String req; //Car class의 instance variable 을 private으로 선언 
	
	Car(String Emg, int number, String car_type, String req){ //Constructor  
		this.Emg=Emg; 
		this.number=number;
		this.car_type=car_type;
		this.req=req; //parameter로 가져온 값들을 set
	}
	
	public String getEmg(){ //getter of Emg
		return Emg;
	}
	public int getNumber(){ //getter of Number
		return number;
	}
	public String getCar_Type(){ //getter of Car_Type
		return  car_type;
	}
	public String getReq(){ //getter of req
		return req;
	}
	public String getStr(){ //Car이 가지고 있는 모든 instance variable의 정보 리턴
		return getEmg()+"\t"+getNumber()+"\t"+getCar_Type()+"\t\t"+getReq();
	}

}
