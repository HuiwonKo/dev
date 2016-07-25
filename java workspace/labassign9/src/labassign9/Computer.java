package labassign9;

public class Computer extends Product{ //Product 상속받은 Computer class
	public Computer(){ //default constructor
		super(200); //200으로 값 set
	}
	public String toString(){ //toString overriding
		return "Computer";
	}
}
