package ����;

public class Main_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle pizza;
		pizza=new Circle();//Circle ��ü ����
		pizza.radius=10;//������ �������� 10���� ����
		pizza.name="�ڹ�����";//������ �̸��� ����
		double area=pizza.getArea();//������ ���� �˾Ƴ���
		System.out.println(pizza.name+"�� ������"+area);
		
		Circle dounut;
		dounut=new Circle();//���� ��ü ����
		dounut.radius=2;
		dounut.name="�ڹٵ���";//������ �̸� ����
		area=dounut.getArea();//������ ���� �˾Ƴ���
		System.out.println(dounut.name+"�� ������"+area);
	}

}
