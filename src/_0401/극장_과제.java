package _0401;
import java.util.Scanner;
public class ����_���� {
	static Scanner in=new Scanner(System.in);
	private static void initSeats(int[][] ar) {//public:��𼭳� ����, private:��𼭳� ���� ���ϰ�
		// TODO Auto-generated method stub
		for(int row=0;row<ar.length;row++) {
			for(int col=0;col<ar[row].length;col++)
			{
				ar[row][col]=0;
			}
		}
	}
	private static void showSeats(int[][] ar) {
		// TODO Auto-generated method stub
		for(int row=0;row<ar.length;row++) {
			for(int col=0;col<ar[row].length;col++)//�����.
			{
				//���
				if(ar[row][col]==0)
					System.out.print("�� ");
				else
					System.out.print("�� ");
			}
		System.out.println();
		}
	}
	private static int[][] inputSeats(int[][] seats,int ��ȣ,int ��,int ��) {
		// TODO Auto-generated method stub
		System.out.println("== �¼��� �����մϴ�.! ==");
	
		
		while(true)	
		{	
			//��
			System.out.print("���� �Է��ϼ���(0~9): ");
			��=in.nextInt();
			in.nextLine();
			if(!(��>=0&&��<=9))
					{
						System.out.println("�ٽ� �Է��ϼ���.");
						continue;
					}	
			while(true)//��
			{
				
			System.out.print("���� �Է��ϼ���(0~9): ");
			��=in.nextInt();
			in.nextLine();
			if(!(��>=0&&��<=9))
					{
						System.out.println("�ٽ� �Է��ϼ���.");
						continue;
					}
			else
				break;
			}//while(��)
			if(��ȣ==1)//����
			{
				if(seats[��][��]==1)
					{
					System.out.println("�̹� ����Ǿ����ϴ�.");	
					continue;
					}
				else
				{
					seats[��][��]=1;
					break;
				}
			}
			if(��ȣ==2)//���
			{
				if(seats[��][��]==0)
					{
					System.out.println("�̹� ������� ���� �ڸ��Դϴ�.");	
					continue;
					}
				else
					{
						seats[��][��]=0;
						break;
					}
			}
		}//while(��)
		return seats;
	}	
	private static void welcome() {
		// TODO Auto-generated method stub
		System.out.println("�������~*^^*");
	}
	private static int show�޴�(String �޴�,int ��ȣ) {
		// TODO Auto-generated method stub
		�޴�="##########################################################\n1. �����ϱ� , 2. ����ϱ�, 3. �¼����̱�,  0. �׸��ϱ�\n##########################################################";
		System.out.println(�޴�);
		System.out.print("�Է°�: ");
		��ȣ=in.nextInt();
		in.nextLine();
		return ��ȣ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] seats=new int [10][10];
		String �޴�="";
		int ��ȣ=0;
		int ��=0,��=0;
		initSeats(seats);//�ʱ�ȭ	
		welcome();
		while(true)
		{	
			��ȣ=show�޴�(�޴�,��ȣ);//������ �ؾ� ���� ����.(���� �� �� ���-> ��� 0)//�����ϱ�
			if(��ȣ==1)
			{
				inputSeats(seats,��ȣ,��,��);
			}
			else if(��ȣ==2)
			{
				inputSeats(seats,��ȣ,��,��);
			}
			else if(��ȣ==3)
			{
				showSeats(seats);
			}
			else if(��ȣ==0)
			{
				break;
			}
		}
	}//main
	
}//class
