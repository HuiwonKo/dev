package labassign9;

public class Video extends Product{
	public Video(){//default constructor 
		super(110);//parent constructor 호출 110으로 value set
	}
	public String toString(){//toString overriding 
		return "Video";
	}
}
