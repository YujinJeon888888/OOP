package Weeks9;

public class ColorPoint_2 extends Point_2 {
	private String color;
	
	public ColorPoint_2() {
		super();//����Ŭ������ �⺻ ������ ȣ��
		System.out.println("ColorPoint�� ����� �⺻ ������");
		
	}
	public ColorPoint_2(int x,int y,String color) {
		super(x,y);//����Ŭ������ ���� �ִ� ������ ȣ��
		this.color=color;
		System.out.println("������ "+color);
	}
}
