package Object_String;
	
public class ObjectTest {
	
	public static void print(Object obj) {
		System.out.println(obj.getClass().getName());//Ŭ���� �̸�
		System.out.println(obj.hashCode());//�ؽ��ڵ尪(�ּҰ�)
		System.out.println(obj.toString());//��ü ������ ���ڿ��� ����� ���
		System.out.println(obj);//��ü ���(toString�� ����. �ڵ���ȯ��)
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p=new Point(2,3);
		print(p);
	}

}
