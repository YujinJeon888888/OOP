package ����ó��;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Exception;

public class Lab1 {

	public static int getInt(String msg) {
		int num=0;
		Scanner input=new Scanner(System.in);
		
		while(true) {
			try {
				System.out.println(msg);
				num=input.nextInt();
			}
			catch(InputMismatchException e){
				System.out.println("�Է����� ����! �ٽ� �Է��ϼ���");
				input.nextLine();//���͸Ա�
				continue;//try�� �ٽ� �ö�
			}
			break;
			
		}
		
		return num;
	}	
	public static void main(String[] args) {
		int num1=getInt("���� 1�� �Է��ϼ���");
		int num2=getInt("���� 2�� �Է��ϼ���");

		
	}

}
