package Generic_Collection;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box <Integer>box=new Box<Integer>();//<>없으면 잡동사니박스
		
		box.set(1);
		//box.set("aaa");//에러 안 남(<>없을 때.T를 명시하지 않아서). 정의하면 이렇게 오류 남.
	
		//업캐스팅시켜서 시야 좁게하기(보기편하게)
		List <String>ar=new ArrayList<String>();//String만 넣을거야
		List <Integer> nr=new ArrayList<Integer>();//Integer만 넣을거야	
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
		System.out.println(ar);//밀려남, 배열에서는 내가 처리해야하는데 여기서는 알아서 처리해줌
		ar.add(2, "!!!!");
		System.out.println(ar);//들어간 것 다음부터 밀려남
		ar.set(1, "***");//세팅됨. 즉 새로 바꿈
		System.out.println(ar);
		ar.remove(1);//지우기. 인덱스로 명령해서 지움
		System.out.println(ar);
		ar.remove("!!!!");//오프젝트로 알려줘서 지움
		System.out.println(ar);
		
		
	}
}
