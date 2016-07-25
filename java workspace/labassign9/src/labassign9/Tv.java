package labassign9;

public class Tv extends Product{
	public Tv(){//default constructor 
		super(100); //parent constructor 호출 100으로 value set
	}
	public String toString(){//toString overriding 
		return "Tv";
	}
}
