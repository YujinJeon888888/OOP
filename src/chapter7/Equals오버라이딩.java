package chapter7;
class Circle2{
	int radius;
	public Circle2(int radius) {
		this.radius=radius;
	}
	public boolean equals(Circle2 c1) {
		if(radius==c1.radius) return true;
		else return false;
	}
}
public class Equals오버라이딩 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle2 c1=new Circle2(10);
		Circle2 c2=new Circle2(10);
		if(c1.equals(c2))
			System.out.println("두 원의 반지름은 같습니다.");
	}

}
