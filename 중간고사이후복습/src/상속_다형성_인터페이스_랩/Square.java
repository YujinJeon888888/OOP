package ���_������_�������̽�_��;
public class Square implements Geometry {
	private double side;
	
	public Square() {
		
	}
	public Square(double s) {
		this.side=s;
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return side*side;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 4*side;
	}

}
