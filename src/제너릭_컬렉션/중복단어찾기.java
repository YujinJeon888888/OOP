package 제너릭_컬렉션;

import java.util.HashSet;
import java.util.Set;

public class 중복단어찾기 {
	public static void main(String[] args) {
		Set<String> s=new HashSet<String>();
		String[] sample= {"사과","사과","바나나","키위"};
		for(String a:sample) {
			if(!s.add(a)) {//집합에 추가되지 않으면 중복된 단어
				System.out.println("중복된 단어: "+s);
			}
	
		}
		System.out.println(s.size()+" 중복되지 않은 단어 : "+s);
	}
	
}
