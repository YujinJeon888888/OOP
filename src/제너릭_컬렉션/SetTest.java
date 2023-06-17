package 제너릭_컬렉션;
import java.util.*;
public class SetTest {
//Set(집합)은 순서가 없고 , 중복을 허용하지 않음
//순서 상관없이 데이터만 저장하고 싶을 때 사용
//{1,2,3,4,5}는 집합이고 {1,1,1,3,4}는 집합이 아니니까(수학적으로)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set=new HashSet<String>();
		
		set.add("milk");
		set.add("수박");
		set.add("참외");
		set.add("장조림");
		set.add("김치");
		set.add("김치");//두 번 추가되지만 하나만 들어간다. 
		//LinkedHashSet쓰면 입력한 순서대로 출력됨
		//TreeSet쓰면 입력한 순서대로 출력됨
		System.out.println(set);
		if(set.contains("김치")) {
			System.out.println("김치도 포함되어 있음");
		}
	}

}
