package Week4;
import java.util.*;
public class ������� {
	static Scanner in=new Scanner(System.in);
	static String �޴�="1. Ʈ�� 2. �׸� 3. ���� 4. �𷡽ð� 5. ���̾Ƹ�� 6. ���ĺ� �𷡽ð� 7. ���ĺ� ���̾Ƹ�� 0. �׸�";
	static int ��=0;	
	static int Ʈ��_��=1;
	static int star_value=0;
	static String �ﰢ��_�޴�="1. ���������ﰢ�� 2. �����������ﰢ�� 3. ���ﰢ��  9. �޴��� ���ư��� 0. �׸� ";
	public static void main(String[] args) {
		�޴�();
	}
	private static void �޴�() {
		// TODO Auto-generated method stub
		int num;
		while(true)
		{	
			System.out.println("================================================");
			System.out.println(�޴�);
			System.out.println("================================================");
			num=in.nextInt();
			if(num==1)
				Ʈ��();
			if(num==2)
				�׸�();
			if(num==3)
			{
				System.out.println("================================================");
				System.out.println(�ﰢ��_�޴�);
				System.out.println("================================================");
				num=in.nextInt();
				if(num==1)
					���������ﰢ��();
				if(num==2)
					�����������ﰢ��();
				if(num==3)
					���ﰢ��();
				if(num==9)
					continue;
				if(num==0)
					break;

			}
			if(num==4)
				�𷡽ð�();
			if(num==5)
				���̾Ƹ��();
			if(num==6)
				�𷡽ð�_���ĺ�();
			if(num==7)
				���̾Ƹ��_���ĺ�();
			if(num==0)
				break;
		}



	}
	private static void �𷡽ð�_���ĺ�() {
		// TODO Auto-generated method stub
		System.out.print("���� �Է��ϼ���: ");
		��=in.nextInt();
		int ��=1;
		int ��1=0;
		int ��2=0;

		��1=��/2+1;
		��2=��/2;
		int count=0;
		char[] star=new char[26];
		char Alpha='A';
		for(int i=0;i<26;i++) {
			star[i]=(char)(Alpha+i);
		}
		for(int i=��1;i>0;i--) {
			System.out.printf("%3d ��: ",��);
			��++;
			for(int j=0;j<��1-i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<((i-1)*2+1);j++) {
				if(count>25)
					count=0;
				System.out.print(star[count]);
				count++;
			}

			System.out.println();
		}
		for(int i=0;i< ��2;i++) {
			System.out.printf("%3d ��: ",��);
			��++;
			for(int j=0;j<��2-(i+1);j++) {
				System.out.print(" ");
			}
			for(int j=0;j<(i+1)*2+1;j++) {
				if(count>25)
					count=0;
				System.out.print(star[count]);
				count++;
			}

			System.out.println();
		}
	}
	private static void �𷡽ð�() {
		// TODO Auto-generated method stub
		System.out.print("���� �Է��ϼ���: ");
		��=in.nextInt();
		int ��=1;
		int ��1=0;
		int ��2=0;

		��1=��/2+1;
		��2=��/2;

		for(int i=��1;i>0;i--) {
			System.out.printf("%3d ��: ",��);
			��++;
			for(int j=0;j<��1-i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<((i-1)*2+1);j++) {
				System.out.print("*");
			}

			System.out.println();
		}
		for(int i=0;i< ��2;i++) {
			System.out.printf("%3d ��: ",��);
			��++;
			for(int j=0;j<��2-(i+1);j++) {
				System.out.print(" ");
			}
			for(int j=0;j<(i+1)*2+1;j++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}
	private static void ���̾Ƹ��_���ĺ�() {
		// TODO Auto-generated method stub
		System.out.print("���� �Է��ϼ���: ");
		��=in.nextInt();
		int ��=1;
		int ��1=0;
		int ��2=0;

		��1=��/2+1;
		��2=��/2;
		int count=0;
		char[] star=new char[26];
		char Alpha='A';
		for(int i=0;i<26;i++) {
			star[i]=(char)(Alpha+i);
		}
		for(int i=0;i<��1;i++) {//���κ�
			System.out.printf("%3d ��: ",��);
			��++;
			for(int j=0;j<��1-(i+1);j++) {
				System.out.print(" ");
			}               
			for(int j=0;j<i*2+1;j++) {
				if(count>25)
					count=0;
				System.out.print(star[count]);
				count++;
				
			}

			System.out.println();
		}
		for(int i=��2;i>0;i--) {
			System.out.printf("%3d ��: ",��);
			��++;
			for(int j=0;j<��2-i+1;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<((i-1)*2)+1;j++) {
				if(count>25)
					count=0;
				System.out.print(star[count]);
				count++;
			}
			System.out.println();
		}
	}
	private static void ���̾Ƹ��() {
		// TODO Auto-generated method stub
		System.out.print("���� �Է��ϼ���: ");
		��=in.nextInt();
		int ��=1;
		int ��1=0;
		int ��2=0;

		��1=��/2+1;
		��2=��/2;
		
		for(int i=0;i<��1;i++) {//���κ�
			System.out.printf("%3d ��: ",��);
			��++;
			for(int j=0;j<��1-(i+1);j++) {
				System.out.print(" ");
			}               
			for(int j=0;j<i*2+1;j++) {
				System.out.print("*");
			}

			System.out.println();
		}
		for(int i=��2;i>0;i--) {
			System.out.printf("%3d ��: ",��);
			��++;
			for(int j=0;j<��2-i+1;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<((i-1)*2)+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	private static void �׸�() {
		// TODO Auto-generated method stub
		System.out.print("���� �Է��ϼ���: ");
		��=in.nextInt();
		int ��=1;
		for(int i=0;i<��;i++) {
			System.out.printf("%3d ��: ",��);
			��++;
			for(int j=0;j<��;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
	private static void �׸�_Ʈ��(int value){
		// TODO Auto-generated method stub
		for(int i=0;i<value/3;i++) {
			System.out.printf("%3d ��: ",Ʈ��_��);
			Ʈ��_��++;
			for(int j=0;j<value/3+value%3/2;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<value/3;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	private static void ���ﰢ��_Ʈ��() {
		// TODO Auto-generated method stub
		System.out.print("���� �Է��ϼ���: ");
		��=in.nextInt();
		Ʈ��_��=1;
		for(int i=0;i<��;i++) {
			System.out.printf("%3d ��: ",Ʈ��_��);
			Ʈ��_��++;
			for(int j=0;j<��-(i+1);j++)//i+1: 1���� �����ؾ� ��.
			{
				System.out.print(" ");
			}
			for(int j=0;j<i*2+1;j++)//Ȧ��. i�� 0���� �����ؾ���
			{
				System.out.print("*");
			}
			System.out.println();//������
			star_value=i*2+1;
		}
	}
	private static void ���ﰢ��() {
		// TODO Auto-generated method stub
		System.out.print("���� �Է��ϼ���: ");
		��=in.nextInt();
		int ��=1;
		for(int i=0;i<��;i++) {
			System.out.printf("%3d ��: ",��);
			��++;
			for(int j=0;j<��-(i+1);j++)//i+1: 1���� �����ؾ� ��.
			{
				System.out.print(" ");
			}
			for(int j=0;j<i*2+1;j++)//Ȧ��. i�� 0���� �����ؾ���
			{
				System.out.print("*");
			}
			System.out.println();//������
		}

	}

	private static void ���������ﰢ��() {
		// TODO Auto-generated method stub
		System.out.print("���� �Է��ϼ���: ");
		��=in.nextInt();
		int ��=1;
		for( int i=1;i<��;i++) {
			System.out.printf("%3d ��: ",��);
			��++;
			for(int j=0;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}
	private static void �����������ﰢ��() {
		// TODO Auto-generated method stub
		System.out.print("���� �Է��ϼ���: ");
		��=in.nextInt();
		int ��=1;
		for( int i=1;i<=��;i++) {
			System.out.printf("%3d ��: ",��);
			��++;
			for(int j=0;j<��-(i);j++)//i: 1���� �����ؾ� ��.
			{
				System.out.print(" ");
			}
			for(int j=0;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	private static void Ʈ��() {
		// TODO Auto-generated method stub
		���ﰢ��_Ʈ��();
		�׸�_Ʈ��(star_value);
	}

}
