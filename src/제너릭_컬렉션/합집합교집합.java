package ���ʸ�_�÷���;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class �����ձ����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> s1=new HashSet<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,22));
		Set<Integer> s2=new HashSet<Integer>(Arrays.asList(2,4,6,8,11));
		
		s1.retainAll(s2);//������ ���
		System.out.println("������: "+s1.toString());
	
		
	}

}
