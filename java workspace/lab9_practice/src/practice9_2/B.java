package practice9_2;

public class B extends A{
	private int y=300;
	private int z=400;
	
	public void setY(int y){
		this.y=y;
	}
	public void setZ(int z){
		this.z=z;
	}
	public void disp(){
		super.disp();
		System.out.println("y="+y+" z="+z);		
	}
}
