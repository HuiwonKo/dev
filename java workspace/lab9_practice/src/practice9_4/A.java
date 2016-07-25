package practice9_4;

public class A {
	public static void main(String[] args) {
		FireEngine fe=new FireEngine();
		Ambulance am=new Ambulance();
		Car c=new Car();
		if(fe instanceof FireEngine){
			System.out.println("Fire");		
		}
		
		if(fe instanceof Car){
			System.out.println("Car");
		}
		
		if(fe instanceof Object){
			System.out.println("Object");
		}
		method(fe);
		method(am);
		method(c);
	}
	public static void method(Object obj){
		if(obj instanceof FireEngine){
			FireEngine fe=(FireEngine)obj;
			fe.water();
		}
		else if (obj instanceof Car){
			Car c=(Car)obj;
			c.drive();
		}
	}
}
