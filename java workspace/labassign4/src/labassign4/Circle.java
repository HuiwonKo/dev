package labassign4;

public class Circle {
	final double PI=3.14159;
	private double radius;
	double area;
	public double getRadius (){ //private instance variable인 radius에 대한 getter 
		return radius;
	}
	public void setRadius (int radius){ //radius 에 대한 setter
		this.radius=radius; //값을 set
	}
	public void area(int radius){ //area를 계산하는 메서드
		 
		area=PI*radius*radius;
	}
	public void showCircle (int radius){ //radius와 area의 결과를 출력하는 메서드
		System.out.println("Radius:"+radius);
		area(radius); //area method 호출
		System.out.println("Area:"+area);
	} 
}
