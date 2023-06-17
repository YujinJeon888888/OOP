package 상속_다형성_인터페이스_랩;

public class Circle implements Geometry {

	private double radius;
	
	public Circle() {
		radius=0.0;
	}
	public Circle(double r) {
		this.radius=r;
	}
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return PI*radius*radius;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2*PI*radius;
	}

}
