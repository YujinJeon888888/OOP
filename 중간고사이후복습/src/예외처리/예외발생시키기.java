package ����ó��;

import java.util.InputMismatchException;
import java.util.Scanner;


public class ���ܹ߻���Ű�� {
	static Scanner in=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] ar=new int[5];

		try {
			//1. ArrayIndexOutOfBoundsException
			//ar[10]=500;//ũ�� 5������
			//2. ArithmeticException
			//int result=3/0;
			//3. ArrayStoreException
			//Object x[] = new String[3];
			//x[0] = new Integer(0);
			//4. InputMismatchException
			//System.out.println("���ڸ� �Է��ϼ���");
			//int num=in.nextInt();
			//5. ClassCastException 
			Object a = new Integer(0);
			System.out.println((String)a);
		}
		//1. ArrayIndexOutOfBoundsException
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("�ε��� ���� �ʰ�");
		}
		//2. ArithmeticException
		catch(ArithmeticException e){
			System.out.println("0���� �������� �õ�");
		}
		//3. ArrayStoreException
		catch(ArrayStoreException e){
			System.out.println("�迭 ���� ����");
		}
		//4. InputMismatchException
		catch(InputMismatchException e){
			System.out.println("Ÿ�� �̻��Ѱ�(�ȸ´°�) ����");
			in.nextLine();
		}
		//5. ClassCastException 
		catch(ClassCastException e){
			System.out.println("ĳ����(����ȯ) �̻���");
		}

		System.out.println("���α׷� ��������");
	}

}
