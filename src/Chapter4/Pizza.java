package Chapter4;

public class Pizza {
	int size;
	String type;

	public Pizza() {//�Ű������� ���� ������
	
	}
	public Pizza(int s,String t)
	{
		size=s;
		type=t;
	}
	
	public static void main(String[]args) {
		Pizza obj1=new Pizza();//�Ű������� ���� ������
		System.out.println("("+obj1.type+","+obj1.size+")");
		Pizza obj2=new Pizza(24,"��������");//�Ű������� �ִ� ������
		System.out.println("("+obj2.type+","+obj2.size+")");
	}
}
