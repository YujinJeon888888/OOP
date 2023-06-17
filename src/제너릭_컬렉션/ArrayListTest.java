package 제너릭_컬렉션;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Point> list=new ArrayList<Point>();//Point 만 들어가는 ArrayList
		
		list.add(new Point(2,3));
		list.add(new Point(1,3));
		list.add(new Point(2,9));
		list.add(new Point(2,7));
		list.add(new Point(1,3));
		
		System.out.println(list);
	}

}
