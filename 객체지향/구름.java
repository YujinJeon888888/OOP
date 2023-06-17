package ��ü����;
import java.util.*;

class Circle {
	private int radius;
	public  String name;
	public Circle() { }
	public Circle(int r, String name){
		this.radius=r;
		this.name=name;
	}
	public int getRadius(){
		return this.radius;
	}
	public void setRadius(int r){
		this.radius = r;
	}
	public double getArea(){
		return 3.14 * this.radius * this.radius;
	}
	public void show(){
		System.out.println("radius : "+ this.radius);
		System.out.println("area : "+ getArea());
	}
}
//CircleŬ������ �̿��Ͽ� Color_CircleŬ������ �����մϴ�. 
class Color_Circle extends Circle {
	public String color;
	public Color_Circle(String color,int radius){
		this.color=color;
		super.setRadius(radius);
	}
		public void show(){
			super.show();
			System.out.println("color: "+color);
		}	
	}




//�����׽�Ʈ�� ���� MainŬ����
class ���� {
	public static void main(String[] args) throws Exception {

		Scanner input= new Scanner(System.in);
		String color= input.next();
		int radius = input.nextInt();

		Color_Circle c = new Color_Circle(color,radius);	

		c.show();

	}
}
