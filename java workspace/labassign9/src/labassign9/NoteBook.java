package labassign9;

public class NoteBook extends Product{
	public NoteBook(){ //default constructor
		super(300); //parent constructor ȣ���ؼ� 300���� ���� set
	}
	public String toString(){ //toString overriding
		return "NoteBook";
	}
}
