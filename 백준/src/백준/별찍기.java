package ����;
import java.util.*;
public class ����� {
//��, �����̽�, �� ���ÿ� �����ϱ�(�ݺ�Ƚ���� ����)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int ����=in.nextInt();
		for(int i=1;i<=����;i++)//��
		{
			for(int j=1;j<=����-i;j++)//space
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)//star
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

