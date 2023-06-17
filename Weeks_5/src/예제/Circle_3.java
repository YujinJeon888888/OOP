package 예제;

public class Circle_3 {
	int radius;
	String name;
	//매개변수 없는 생성자
	public Circle_3() {
		radius=1;
		name="";
	};
	//매개변수를 가진 생성자
	public Circle_3(int r,String n)
	{
		radius=r;
		name=n;
	}
	
	public double getArea() {
		return 3.14*radius*radius;
	}
	
}
