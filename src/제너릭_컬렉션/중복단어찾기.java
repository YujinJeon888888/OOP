package ���ʸ�_�÷���;

import java.util.HashSet;
import java.util.Set;

public class �ߺ��ܾ�ã�� {
	public static void main(String[] args) {
		Set<String> s=new HashSet<String>();
		String[] sample= {"���","���","�ٳ���","Ű��"};
		for(String a:sample) {
			if(!s.add(a)) {//���տ� �߰����� ������ �ߺ��� �ܾ�
				System.out.println("�ߺ��� �ܾ�: "+s);
			}
	
		}
		System.out.println(s.size()+" �ߺ����� ���� �ܾ� : "+s);
	}
	
}
