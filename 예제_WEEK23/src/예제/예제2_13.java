package ����;
import java.util.Scanner;
public class ����2_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���(0~100): ");
		int score=in.nextInt();
		System.out.println("�г��� �Է��ϼ���(1~4): ");
		int year=in.nextInt();
		
		if(score>=60)
		{
			if(year!=4)
				System.out.println("�հ�!");
			else if(score>=70)
			{
				System.out.println("�հ�!");
			}
			else
				System.out.println("���հ�!");
		}
		else
			System.out.println("���հ�!");
	}

}
