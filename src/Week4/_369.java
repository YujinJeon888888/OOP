package Week4;

public class _369 {

	public static void main(String args[]) {



		int num=0;



		while(num<100){

			int n=num;

			int flag=0;    

			//���� �񱳹� ��� �ݺ����� ����Ѵ�.

			while(n>0){



				if(n%10 ==3 || n%10==6 || n%10==9 )  {

					System.out.print("¦");

					flag+=1;  // �����ڸ��� 3�� ��������� ǥ��.

				} 

				n/=10; //n�� 10���� ������� ���� �ڸ����� ���Ѵ�.



			}

			//�ѹ��̶� �������� ���� ������ ���ڸ� ���

			if(flag ==0) System.out.printf("%4d", num);

			else System.out.print("!");



			//�� �ٿ� 10���� ���

			if(num%10==0 ) System.out.println();

			else System.out.print("  ");



			num++;

		}





	}
}
