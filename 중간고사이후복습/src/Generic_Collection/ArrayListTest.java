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
		list.add(1,"hi" );//삽입->뒤에 있는 것은 자동으로 밀려남.
		System.out.println(list);
		list.set(2, "GRAPE");//2번 자리를 grape로 대체.
		list.remove(3);//3번 삭제(버터)
		System.out.println(list);
		System.out.println("=============================반복자");
		
		String s;
		Iterator e= (Iterator) list.iterator();
		
	}	
}
