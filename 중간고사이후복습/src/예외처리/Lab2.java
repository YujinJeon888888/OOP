package ����ó��;
import java.util.Scanner;
public class Lab2 {
	static Scanner input=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=readInt();
		double d=readDouble();
		
		System.out.println(num);
		System.out.println(d);
	}
	public static int readInt() {
		boolean correct=false;
		String number;
		int value=0;
		while(!correct) {//��ȿ�� ���� �Էµɶ�����
			try {
				System.out.println("input(����) : ");
				number=input.nextLine();
				value=Integer.parseInt(number);//String�� int�� �ؼ�
				correct=true;//��ȿ�� ���� �ԷµǸ� ������� �������µ�, �ƴϸ� �� �ڵ忡�� �ɸ��� catch�� ���ϱ�
			}
			catch(NumberFormatException e) {
				System.out.println("����! ����!!!!!!!!!!!!!!!");
			}
		}
		return value;
	}
	
	public static double readDouble() {
		boolean correct=false;
		String number;
		double value=0.0;
		while(!correct) {
			try {
				System.out.println("input(�Ǽ�) : ");
				number=input.nextLine();
				value=Double.parseDouble(number);
				correct=true;
				
			}
			catch(NumberFormatException e) {
				System.out.println("�ٽ��Է��ϼ���");
			}
		}
		return value;
	}
}
