package Generic_Collection;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box <Integer>box=new Box<Integer>();//<>������ �⵿��Ϲڽ�
		
		box.set(1);
		//box.set("aaa");//���� �� ��(<>���� ��.T�� ������� �ʾƼ�). �����ϸ� �̷��� ���� ��.
	
		//��ĳ���ý��Ѽ� �þ� �����ϱ�(�������ϰ�)
		List <String>ar=new ArrayList<String>();//String�� �����ž�
		List <Integer> nr=new ArrayList<Integer>();//Integer�� �����ž�	
		List <Integer> nnr=new LinkedList<Integer>();
		String[ ] s= {"ad","ccd"};
		System.out.println(s.length);
		System.out.println(s.length);
		ar.toArray();
		ar.add("aaa");
		ar.add("bbb");
		ar.add("ccc");
	
		System.out.println(ar);
		ar.add(1,"QQQ");
		ar.toArray();
		System.out.println(ar);//�з���, �迭������ ���� ó���ؾ��ϴµ� ���⼭�� �˾Ƽ� ó������
		ar.add(2, "!!!!");
		System.out.println(ar);//�� �� �������� �з���
		ar.set(1, "***");//���õ�. �� ���� �ٲ�
		System.out.println(ar);
		ar.remove(1);//�����. �ε����� ����ؼ� ����
		System.out.println(ar);
		ar.remove("!!!!");//������Ʈ�� �˷��༭ ����
		System.out.println(ar);
		
		
	}
}
