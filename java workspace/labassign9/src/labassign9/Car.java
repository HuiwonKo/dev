package labassign9;

public class Car { //Car Class (Ambulance, PoliceCar, FireEngine �� ���� class) 
	private String Emg;
	private int number;
	private String car_type;
	private String req; //Car class�� instance variable �� private���� ���� 
	
	Car(String Emg, int number, String car_type, String req){ //Constructor  
		this.Emg=Emg; 
		this.number=number;
		this.car_type=car_type;
		this.req=req; //parameter�� ������ ������ set
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
	public String getStr(){ //Car�� ������ �ִ� ��� instance variable�� ���� ����
		return getEmg()+"\t"+getNumber()+"\t"+getCar_Type()+"\t\t"+getReq();
	}

}
