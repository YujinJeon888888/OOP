package ����;

import java.util.Scanner;
public class ������Ѱ���
{
	static Scanner in=new Scanner(System.in);
	public static void main(String[]args)
	{
		Scanner in=new Scanner(System.in);
		int �׽�Ʈ���̽�=0,�л���=0,sum=0,count=0;
		float ���=0,����=0;
		int [] ����;
		�׽�Ʈ���̽�=in.nextInt();
		in.nextLine();//������->�Ծ����
		for(int i=0;i<�׽�Ʈ���̽�;i++)
		{
			
			sum=0;
			count=0;
			�л���=in.nextInt();
			����=new int[�л���];
			//��������
			for(int j=0;j<�л���;j++)
			{
				����[j]=in.nextInt();
				sum+=����[j];
			}
			//���� ���
			���=(float)sum/(float)�л���;
			for(int j=0;j<�л���;j++)
			{
				if(���<����[j])
					count++;
			}
			//����
			����= (float)count/(float)�л���*100;//�����
			//���
			System.out.printf("%.3f%%\n",����);		
			in.nextLine();//������(���� �׽�Ʈ���̽�)
		}
	}
}