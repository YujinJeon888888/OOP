package Chapter5;

import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String [] args) {
		
		ArrayList<String> list=new ArrayList<String>();// ArrayList를 생성할 때는 어떤 객체를 저장할 것인지를 <..>안에 지정하여야 한다. 여기서는 String을 저장한다고 지정하였다.
		list.add("홍콩");//ArrayList에 객체를 추가할 때는 add()를 사용한다.
		list.add("싱가포르");
		list.add("괌");
		list.add("사이판");
		list.add("하와이");
		
		System.out.println("여행지 추천 시스템입니다.");
		int index=(int)(Math.random()*list.size());
		System.out.println("추천 여행지는 " +list.get(index));//지정된 인덱스에서 객체를 꺼낼 때는 get()을 호출한다.
	}
}
