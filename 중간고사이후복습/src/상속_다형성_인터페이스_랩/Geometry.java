package ���_������_�������̽�_��;
public interface Geometry {

	public static final double PI=3.14159;//�������̽�->��ü ����� �� �ƴ�->������� ��� �Ұ�->����� ����
	
    public double area();

    public double perimeter();

    public default void showInfo() {
    	System.out.println("���� PI��: "+PI);
    }

}
