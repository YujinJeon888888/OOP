package Chapter5;

import java.util.ArrayList;

public class ArrayListTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Person> list=new ArrayList<Person>();
		list.add(new Person("ȫ�浿","01012345618"));//�� �ε��� ���� �濡 ����. 
		list.add(new Person("������","01012345628"));
		list.add(new Person("������","01012345638"));
		list.add(new Person("�����","01012345648"));
		
		for(Person obj:list)//!!for-each���� ���
			System.out.println("("+obj.name+","+obj.tel+")");
	}		

}
