package Chapter4;

public class Circle {
	int radius; 

	void setRadius(int r)
	{
		radius=r;
	}
	double calcArea() {
		return radius*radius*3.14;
	}
	void print()//형식지정자x=> default=> 같은 폴더 내에서만 접근 가능
	{
		System.out.println("원의 반지름: "+radius);
		System.out.println("원의 면적: "+calcArea());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle obj;
		obj=new Circle();
		obj.setRadius(100);
		
		obj.print();
	}
}
