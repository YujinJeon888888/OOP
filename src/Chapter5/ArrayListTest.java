package Chapter5;

import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String [] args) {
		
		ArrayList<String> list=new ArrayList<String>();// ArrayList�� ������ ���� � ��ü�� ������ �������� <..>�ȿ� �����Ͽ��� �Ѵ�. ���⼭�� String�� �����Ѵٰ� �����Ͽ���.
		list.add("ȫ��");//ArrayList�� ��ü�� �߰��� ���� add()�� ����Ѵ�.
		list.add("�̰�����");
		list.add("��");
		list.add("������");
		list.add("�Ͽ���");
		
		System.out.println("������ ��õ �ý����Դϴ�.");
		int index=(int)(Math.random()*list.size());
		System.out.println("��õ �������� " +list.get(index));//������ �ε������� ��ü�� ���� ���� get()�� ȣ���Ѵ�.
	}
}
