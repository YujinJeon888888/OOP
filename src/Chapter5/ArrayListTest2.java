package Chapter5;

import java.util.ArrayList;

public class ArrayListTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Person> list=new ArrayList<Person>();
		list.add(new Person("홍길동","01012345618"));//각 인덱스 붙은 방에 넣음. 
		list.add(new Person("김유신","01012345628"));
		list.add(new Person("유관순","01012345638"));
		list.add(new Person("김순자","01012345648"));
		
		for(Person obj:list)//!!for-each구문 사용
			System.out.println("("+obj.name+","+obj.tel+")");
	}		

}
