package Generic_Collection;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("MILK");
		list.add("BREAD");
		list.add("BUTTER");
		list.add(1,"hi" );//����->�ڿ� �ִ� ���� �ڵ����� �з���.
		System.out.println(list);
		list.set(2, "GRAPE");//2�� �ڸ��� grape�� ��ü.
		list.remove(3);//3�� ����(����)
		System.out.println(list);
		System.out.println("=============================�ݺ���");
		
		String s;
		Iterator e= (Iterator) list.iterator();
		
	}	
}
