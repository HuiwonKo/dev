package labassign4;

public class Circle {
	final double PI=3.14159;
	private double radius;
	double area;
	public double getRadius (){ //private instance variable�� radius�� ���� getter 
		return radius;
	}
	public void setRadius (int radius){ //radius �� ���� setter
		this.radius=radius; //���� set
	}
	public void area(int radius){ //area�� ����ϴ� �޼���
		 
		area=PI*radius*radius;
	}
	public void showCircle (int radius){ //radius�� area�� ����� ����ϴ� �޼���
		System.out.println("Radius:"+radius);
		area(radius); //area method ȣ��
		System.out.println("Area:"+area);
	} 
}
