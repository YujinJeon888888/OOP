package ����;
import java.util.Scanner;

public class ������ιݺ� {
	static Scanner in=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				�������ø���Ʈ();	
				������α�����();
	}//main

	private static void �������ø���Ʈ() {
		// TODO Auto-generated method stub
		//���� ���ø���Ʈ
		String[] obj=new String[3];
		int[] price=new int[3];
		int sum=0;
		
		for(int i=0;i<3;i++)
		{
			System.out.print("������� ������ �Է��ϼ���: ");
			obj[i]=in.nextLine();
			System.out.print("������ �Է��ϼ���: ");
			price[i]=in.nextInt();
			in.nextLine();
			sum+=price[i];				
			System.out.println("�� �ʿ��� �ݾ�: "+sum);
			System.out.println();
		}
		System.out.println();
	}

	private static void ������α�����() {
		// TODO Auto-generated method stub
		
				//�� ����� ������
				int num;
				System.out.print("��ܱ��� ������ �Է��ϼ���: ");
				num=in.nextInt();
				//��Ȧ���ܸ�.
				System.out.println("=========");
				System.out.println("Ȧ���ܸ� ���");
				System.out.println("=========");
				
				for(int i=1;i<=num;i+=2)
				{
					for(int j=1;j<=9;j++)
					{
						System.out.printf("%d x %d = %3d\t",i,j,i*j);
					}
					System.out.println();
				}
				//��Ȧ���� ���
				System.out.println("=========");
				System.out.println("��갪 Ȧ���� ���");
				System.out.println("=========");
				for(int a=1;a<=num;a++)
				{
					for(int b=1;b<=9;b++)
					{
						if(a*b%2==1)
						System.out.print(a+"x"+b+"="+a*b+"\t");
					}
					System.out.println();
				}
				
				//�ϰŲٷ� ���
				System.out.println("=========");
				System.out.println("�Ųٷ� ���");
				System.out.println("=========");
				for(int i=num;i>0;i--)
				{
					for(int j=1;j<=9;j++)
					{
						System.out.printf("%d x %d = %3d\t",i,j,i*j);
					}
					System.out.println();
				}
				System.out.println();
	}
}//class
