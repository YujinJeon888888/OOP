package Chapter3;
import java.util.Scanner;
public class ProgrammingExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		//1���� 100������ ���� �߿��� 3�Ǵ� 4�� ����� ���� ���
		/*
		 * int[] num=new int[100]; int sum=0; for(int i=0;i<100;i++) { num[i]=i+1;
		 * if(num[i]%3==0) { sum+=num[i]; } else if(num[i]%4==0) { sum+=num[i]; } }
		 * System.out.println(sum);
		 */
		
		
		//1���� 9������ ���� �����ڷ� ���
		/*
		 * int[] num= {1,2,3,4,5,6,7,8,9}; String[] s=
		 * {"one","two","three","four","five","six","seven","eight","nine"};
		 * 
		 * 
		 * while(true) { System.out.print("������ �Է��ϼ���: "); int user=in.nextInt();
		 * in.nextLine(); if(user<1||user>9) {System.out.println("�ٽ� �Է��ϼ��� ");
		 * continue;} if(user==num[user-1]) {System.out.println(s[user-1]); break;} }
		 */
	//	2���� �ֻ����� ������ ������ �ִٰ� ��������. 2���� �ֻ����� ���� 6�� �Ǵ� ���� �� ������ ������? 
		//���� 6�� �Ǵ� ����� ���� ����ϴ� ���α׷��� �ۼ��غ���.
		/*
		 * int[] dice1= {1,2,3,4,5,6}; int[] dice2= {1,2,3,4,5,6}; for(int i=0;i<6;i++)
		 * { for(int j=0;j<6;j++) { if(dice1[i]+dice2[j]==6)
		 * System.out.println(dice1[i]+"+"+dice2[j]); } }
		 */
	
		//4. ����ڷκ��� Ű�� �Է¹޾� ǥ�� ü���� ����� �Ŀ� ������� ü�߰� ���Ͽ� ��ü������, ǥ������,
		//��ü������ �Ǵ��ϴ� ���α׷��� �ۼ��϶�. ǥ�� ü�� ������ ������ ����϶�.
		/*
		 * System.out.print("Ű�� �Է��ϼ���: "); double Ű=in.nextDouble();
		 * System.out.print("�����Ը� �Է��ϼ���: "); double ������=in.nextDouble(); double
		 * ǥ��ü��=(Ű-100)*0.9; if(������>ǥ��ü��) System.out.println("��ü��"); else if(������==ǥ��ü��)
		 * System.out.println("����ü��"); else System.out.println("��ü��");
		 */
		
		//5. 1�� ������ 3x+10y=100�� �����ϴ� ��� �ظ� ���ϴ� ���α׷��� �ۼ��� ����. ���⼭ 
		//x�� y�� �����̰� 0<=x<=10, 0<=y<=10 �̶�� ��������.
		/*
		 * int[] x=new int[11]; int[] y=new int[11]; for(int i=0;i<=10;i++) { x[i]= i;
		 * for(int j=0;j<=10;j++) { y[i]= j; if(3*x[i]+10*y[i]==100) {
		 * System.out.println("("+x[i]+","+y[i]+")" ); } } }
		 */
		//6. 2�� 100 ���̿� �ִ� ��� �Ҽ��� ã�� ���α׷��� �ۼ��϶�. �־��� ���� k�� 
		//2���� k-1������ ���ڷ� ����� �������� 0�� ���� �ϳ��� ������ �Ҽ��� �ƴϴ�.(�Ҽ�:1�� �ڽ��� �����ϰ� ���� �� �ִ� ���� ���� ��)
		int k;
		int num=0;
		for(k=2;k<100;k++)
		{	
			for(int i=1;i<k;i++)
			{		
				if(i!=1)
				{
					if(k%i==0)
						{
						num=0;
						break;//break������ 0���� ����������� ���� �ִ��� ++�ϰ��� �ʱ�ȭ��->�ᱹ k-1��ŭ�� ���ڷ� ���� �͸� ����.
						}
					else
						num=1;
				}
			}
			if(num==1)
				System.out.println(k);
		}
		
	}
}
