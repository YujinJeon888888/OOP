package ����;

public class Circle_3 {
	int radius;
	String name;
	//�Ű����� ���� ������
	public Circle_3() {
		radius=1;
		name="";
	};
	//�Ű������� ���� ������
	public Circle_3(int r,String n)
	{
		radius=r;
		name=n;
	}
	
	public double getArea() {
		return 3.14*radius*radius;
	}
	
}
