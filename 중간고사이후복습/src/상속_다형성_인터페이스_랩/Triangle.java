package ���_������_�������̽�_��;
public class Triangle implements Geometry {
	
	private double a,b,c;
	
	public Triangle() {
		
	}
	public Triangle(double a,double b,double c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		double s=(a+b+c)/2.0;
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 0;
	}

}
