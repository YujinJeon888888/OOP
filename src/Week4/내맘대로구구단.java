package Week4;
import java.util.*;
public class ������α����� {
	static Scanner in=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		�޴�();
	}

	private static void �޴�() {
		// TODO Auto-generated method stub
		int num=0;
		while(true) {
			System.out.println("====================================");
			System.out.println("1. Ȧ����/¦���ܸ� ����ϱ�");
			System.out.println("2. 19�ܱ���, 2�� �ǳʼ� ����ϱ�");
			System.out.println("3. �Ųٷ� ���");
			System.out.println("0. ����");
			System.out.println("====================================");
			num=in.nextInt();
			if(num==1)
				{
				System.out.println("1.Ȧ���ܸ� ����ϱ� 2. ¦���ܸ� ����ϱ� 9.ó�� �޴��� ���ư��� 0.����");
				num=in.nextInt();
				if(num==1)
					Ȧ���ܸ�����ϱ�();
				else if(num==2)
					Ȧ���ܸ�����ϱ�();
				else if(num==9)
					continue;
				else if(num==0)
					break;
				}
			if(num==2)
			{
				_19�ܱ����ǳ����();
			}
			if(num==3)
				�Ųٷ����();
			if(num==0)
				break;
		}

	}

	private static void �Ųٷ����() {
		// TODO Auto-generated method stub
		for(int i=9;i>0;i--)
		{
			for(int j=1;j<=9;j++)
				System.out.print(i+"*"+j+" = "+i*j+"\t");
			System.out.println();
		}
		
	}

	private static void _19�ܱ����ǳ����() {
		// TODO Auto-generated method stub
		for(int i=1;i<=19;i+=2)
		{
			for(int j=1;j<=9;j++)
				System.out.print(i+"*"+j+" = "+i*j+"\t");
			System.out.println();
		}
	}

	private static void Ȧ���ܸ�����ϱ�() {
		// TODO Auto-generated method stub
		for(int i=1;i<=9;i+=2) {
			for(int j=1;j<=9;j++)
				System.out.print(i+"*"+j+" = "+i*j+"\t");
			System.out.println();
	}
}
}
