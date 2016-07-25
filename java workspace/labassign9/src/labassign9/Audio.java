package labassign9;

public class Audio extends Product{ //Product 상속받은 Audio class
	public Audio(){ //default constructor 
		super(50); //parent constructor 호출 50으로 value set
	}
	public String toString(){ //toString overriding 
		return "Audio";
	}
}
