package ����ó��;

import java.util.Scanner;

public class lab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=divideNum();
		System.out.println("�����: "+num);
		
		System.out.println("���α׷� ��������");
	}
	public static int divideNum() {
		int result=0;
		Scanner in=new Scanner(System.in);
		boolean correct=false;
		int num1,num2;
		while(!correct) {
			try {
				System.out.println("a�� b�� �����ſ���. a�� �Է��ϼ���: ");
				num1=in.nextInt();
				System.out.println("a�� b�� �����ſ���. b�� �Է��ϼ���: ");
				num2=in.nextInt();
				result=num1/num2;
				//���� ������ correct=true;�ڵ� �����
				correct=true;
			}
			catch(java.lang.ArithmeticException e) {
				System.out.println("0���� �������. �ٽ� �Է��ϼ���");
			}
		}
		return result;
	}

}
