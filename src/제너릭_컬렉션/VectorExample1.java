package ���ʸ�_�÷���;

import java.util.Collections;
import java.util.Vector;

public class VectorExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> vc=new Vector<String>(2);//ũ�� ��������
		
		vc.add("apple");//�������༭ ���� String���� ����
		//vc.add(1);//�̷��� ������
		vc.add("grape");
		vc.add("mango");
		
		
		System.out.println("������ ũ�� : "+vc.size());
		Collections.sort(vc);//���Ϳ� ����� ���ڿ����� ������
		
		for(String s:vc) {
			System.out.print(s+ " ");
		}
	}

}
