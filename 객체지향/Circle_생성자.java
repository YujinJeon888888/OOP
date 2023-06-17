package 梓端走狽;

public class Circle_持失切 {

	int radius;
	String name;

	public Circle_持失切() {
		radius=1;
		name="";
	}
	public Circle_持失切(int r,String n) {
		radius=r;
		name=n;
	}
	public double getArea() {
		return 3.14*radius*radius;
	}
}
