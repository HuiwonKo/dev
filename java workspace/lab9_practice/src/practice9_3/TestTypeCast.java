package practice9_3;

public class TestTypeCast {
	public static void main(String[] args) {
		Car car=null;
		FireEngine fe=new FireEngine();
		FireEngine fe2=null;
		
		fe.water();
		car=fe; //up-casting (생략 가능) 
		//car.water();
		fe2=(FireEngine)car; //down-casting (생략 불가)   
		fe2.water();
		//(FireEngine)car.water();
	}
}
