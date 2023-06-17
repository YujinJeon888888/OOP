package 제너릭_컬렉션;

import java.util.Collections;
import java.util.Vector;

public class VectorExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> vc=new Vector<String>(2);//크기 지정해줌
		
		vc.add("apple");//지정해줘서 인자 String으로 받음
		//vc.add(1);//이러면 에러남
		vc.add("grape");
		vc.add("mango");
		
		
		System.out.println("벡터의 크기 : "+vc.size());
		Collections.sort(vc);//벡터에 저장된 문자열들을 정렬함
		
		for(String s:vc) {
			System.out.print(s+ " ");
		}
	}

}
