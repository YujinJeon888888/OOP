package ����ó��;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ������_���� {

	public static void main(String[] args) throws EOFException, FileNotFoundException, java.lang.ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
		
		//����Ŭ������ 
		//���� �̸�
		//java.lang.		

		try {
			//java.lang.NullPointerException
			//null�� ���� ���������� ��ü ���� �������� ��Ʈ(.)������� �� �߻�
			//String data=null;//���۷���x
			//System.out.println(data.toString());
			
			//ArrayIndexOutOfBoundsException
			//�迭���� �ε��� ���� �ʰ��Ͽ� ����� ��� �߻�
			//int[] ar=new int[10];
			//ar[10]=1;
			
			//java.lang.ClassCastException
			//Ÿ�� ��ȯ�� ���� ���� ��� �߻�(ĳ���� �Ұ���)
			���_������_�������̽�_��.���� animal=new ���_������_�������̽�_��.������();
			���_������_�������̽�_��.��� human=(���_������_�������̽�_��.���) animal;
			
			//���������� ū �������� ���. ū ���ܴ� ���� �Ʒ���(�� ���)
		}catch(java.lang.NullPointerException e) {
			System.out.println("null�� ���� ���������� ��ü ���� �������� ��Ʈ(.)������� �� �߻�");
		}catch(java.lang.ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭���� �ε��� ���� �ʰ��Ͽ� ����� ��� �߻�");
		}catch(ClassCastException e) {
			System.out.println("Ÿ�� ��ȯ�� ���� ���� ��� �߻�(ĳ���� �Ұ���)");
		}catch(java.lang.ArithmeticException|java.lang.IllegalThreadStateException e) {//�Ǵ� ������ ����!  
			System.out.println("������� ����");
		}catch(java.lang.Exception e) {
			System.out.println("�ƹ�ư ���ܰ� �߻��߳׿�");
		}finally {
			System.out.println("������� ����Ǹ� �������~");
		}
		
	}

}
