package Week4;
import java.util.*;
public class ���忹��ý��� {
	static Scanner in=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		�޴�();
	}

	private static void �޴�() {
		// TODO Auto-generated method stub
		int num;
		int[][] seats=new int[10][10];
		welCome();
		while(true) {
			System.out.println("============================");
			System.out.println("1. �����ϱ�, 2. ����ϱ�, 3. �¼����̱�, 0. �׸��ϱ�");
			System.out.println("============================");
			num=in.nextInt();
			
			if(num==1) {
				�����ϱ�(seats);
			}
			if(num==2) {
				����ϱ�(seats);
			}
			if(num==3) {
				�¼����̱�(seats);
			}
			if(num==4) {
				break;
			}
			
		}
	}

	private static void welCome() {
		System.out.println("**************************************");
		System.out.println("         Welcome to Ewha Movie");
		System.out.println("**************************************");
	}

	private static void �¼����̱�(int seats[][]) {
		// TODO Auto-generated method stub
		for(int row=0;row<seats.length;row++) {
			for(int col=0;col<seats[row].length;col++)
				{
				if(seats[row][col]==1)
					System.out.print("�� ");
				else if(seats[row][col]==0)
					System.out.print("�� ");
				}
			System.out.println();
		}
	}

	private static void ����ϱ�(int seats[][]) {
		// TODO Auto-generated method stub
		int row,col;
		while(true) {
			System.out.print("����� ��: ");
			row=in.nextInt();
			
			if(row<0||row>seats.length-1) {
				System.out.println("�׷� ���� �����ϴ�.");
				continue;
			}
			System.out.print("����� ��: ");
			col=in.nextInt();
			if(col<0||col>seats[row].length-1) {
				System.out.println("�׷� ���� �����ϴ�.");
				continue;
			}
			if(seats[row][col]==0) {
				System.out.println("�̹� ���� �ڸ��Դϴ�.");
				continue;
			}
			else//���ܻ��׿� �ɸ��� ������ �ݺ� ����
				break;
		}
		seats[row][col]=0;
	}

	private static void �����ϱ�(int seats[][]) {
		// TODO Auto-generated method stub
		int row,col;
		while(true) {
			System.out.print("������ ��: ");
			row=in.nextInt();
			
			if(row<0||row>seats.length-1) {
				System.out.println("�׷� ���� �����ϴ�.");
				continue;
			}
			System.out.print("������ ��: ");
			col=in.nextInt();
			if(col<0||col>seats[row].length-1) {
				System.out.println("�׷� ���� �����ϴ�.");
				continue;
			}
			if(seats[row][col]==1) {
				System.out.println("�̹� ����� �ڸ��Դϴ�.");
				continue;
			}
			else//���ܻ��׿� �ɸ��� ������ �ݺ� ����
				break;
		}
		seats[row][col]=1;
	}

}
