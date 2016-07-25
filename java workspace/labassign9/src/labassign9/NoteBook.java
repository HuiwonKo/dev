package labassign9;

public class NoteBook extends Product{
	public NoteBook(){ //default constructor
		super(300); //parent constructor 호출해서 300으로 값을 set
	}
	public String toString(){ //toString overriding
		return "NoteBook";
	}
}
