package Chapter3;

import java.util.Scanner;

public class ������ȯ_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		//90>= a 80>= b 70>=c..d���� ������ f
		int num;
		System.out.println("������ �Է��ϼ���");
		num=in.nextInt();
		int number=num/10;//��switch�� �ٲ� ��� �߿� ����Ʈ.
		switch(number)
		{
		case 10://break��� �� ������. �Ȱ��� print "A"�����.
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");break;
		case 7:
			System.out.println("C");break;
		case 6:
			System.out.println("D");break;
		default:
			System.out.println("F");break;
		}
	}

}
