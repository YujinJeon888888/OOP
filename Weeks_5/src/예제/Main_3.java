package ����;

public class Main_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Circle_3 pizza=new Circle_3(10,"�ڹ�����");//Circle ��ü ����, ������ 10(�ְ� ����)
	
	double area=pizza.getArea();
	System.out.println(pizza.name+"�� ������ "+area);
	
	Circle_3 donut=new Circle_3();//Circle ��ü ����, ������ 1//Circle ��ü ����, �⺻ ������ ȣ��(���)
	donut.name="��������";
	area=donut.getArea();
	System.out.println(donut.name+"�� ������"+area);
	
	}

}
