package ����;
import java.util.Scanner;
public class Ʈ����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String �޴�="1. Ʈ�� 2. �׸� 3. ���� 0. �׸�";
		String �ﰢ��_�޴�="1. ���������ﰢ�� 2. �����������ﰢ�� 3. ���ﰢ�� 0. �׸� ";
				
		while(true)
		{
			int ����;
			int ��ȣ;
			Scanner in=new Scanner(System.in);
			
			System.out.println("�޴�: "+�޴�);
			��ȣ=in.nextInt();
			
			if(��ȣ==1)	
			{
				System.out.print("Ʈ���� ����κ��� ���̸� �Է��ϼ���: ");
				����=in.nextInt();
				Ʈ��_����(����);
			}
			if(��ȣ==2)	
			{
				System.out.print("���簢���� ���̸� �Է��ϼ���: ");
				����=in.nextInt();
				�׸�(����);
			}
			if(��ȣ==3)	
			{	
				int �ﰢ��_��ȣ;
				System.out.println("�޴�: "+�ﰢ��_�޴�);
				�ﰢ��_��ȣ=in.nextInt();
				if(�ﰢ��_��ȣ==1)
				{
					System.out.print("���������ﰢ���� ���̸� �Է��ϼ���: ");
					����=in.nextInt();
					���������ﰢ��(����);
				}
				if(�ﰢ��_��ȣ==2)
				{
					System.out.print("�����������ﰢ���� ���̸� �Է��ϼ���: ");
					����=in.nextInt();
					�����������ﰢ��(����);
				}
				if(�ﰢ��_��ȣ==3)
				{
					System.out.print("���ﰢ���� ���̸� �Է��ϼ���: ");
					����=in.nextInt();
					���ﰢ��(����);
				}
				if(�ﰢ��_��ȣ==0)
					continue;
			}
			if(��ȣ==0)
				break;
		}//main
		
		
	}

	private static void �����������ﰢ��(int ����) {
		// TODO Auto-generated method stub
		System.out.println("==============");
		System.out.println("�����������ﰢ�����");
		System.out.println("==============");
		int num=1;
		for(int i=1;i<=����;i++)//��
		{
			System.out.printf("%2d��:",num);
			num++;
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

	private static void ���������ﰢ��(int ����) {
		// TODO Auto-generated method stub
		System.out.println("==============");
		System.out.println("���������ﰢ�����");
		System.out.println("==============");
		int num=1;
		for(int i=1;i<=����;i++)//��
		{
			System.out.printf("%2d��:",num);
			num++;
			for(int j=1;j<=i;j++)
				{
				System.out.print("*");
				}
			System.out.println();
		}
	}

	private static void Ʈ��_����(int ����) {
		// TODO Auto-generated method stub
		System.out.println("==============");
		System.out.println("Ʈ�����");
		System.out.println("==============");
		
		int num=1;
		int star=0;
		for(int i=1;i<=����;i++)
		{
			System.out.printf("%2d��:",num);
			num++;
			for(int j=1;j<=����-i;j++)//space
			{
				System.out.print(" ");
			}
			star=(i-1)*2+1;//Ȧ��(Ȧ���� 1���� �����ϵ���)
			for(int j=1;j<=star;j++)//star
			{
				System.out.print("*");
			}
			System.out.println();
		}
		Ʈ��_�׸�(star,num);
	}

	private static void Ʈ��_�׸�(int width,int num) {
		// TODO Auto-generated method stub
		int star=width/3;
		int space=(width-star)/2;
		for(int i=1;i<=star;i++)//star����:�׸��ǰ��α���(���簢��):�׸��� �� ����
		{
			System.out.printf("%2d��:",num);
			num++;
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	private static void ���ﰢ��(int ����) {
		// TODO Auto-generated method stub
		System.out.println("==============");
		System.out.println("���ﰢ�����");
		System.out.println("==============");
		
		int num=1;
		int star=0;
		for(int i=1;i<=����;i++)
		{
			
			System.out.printf("%2d��:",num);
			num++;
			for(int j=1;j<=����-i;j++)//space
			{
				System.out.print(" ");
			}
			star=(i-1)*2+1;//Ȧ��(Ȧ���� 1���� �����ϵ���)
			for(int j=1;j<=star;j++)//star
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	private static void �׸�(int ����) {
		// TODO Auto-generated method stub
		System.out.println("==============");
		System.out.println("�׸���");
		System.out.println("==============");
		
		int num=1;
		for(int i=1;i<=����;i++)//star����:�׸��ǰ��α���(���簢��):�׸��� �� ����
		{
			
			System.out.printf("%2d��:",num);
			num++;
			for(int j=1;j<=����;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}//class