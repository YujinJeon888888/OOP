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
	void print()//����������x=> default=> ���� ���� �������� ���� ����
	{
		System.out.println("���� ������: "+radius);
		System.out.println("���� ����: "+calcArea());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle obj;
		obj=new Circle();
		obj.setRadius(100);
		
		obj.print();
	}
}
