package ����;

public class Ȧ�������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1;i<=10;i+=2)
		{
			sum+=i;
			System.out.print(i);//���ϴ� �� ���
			if(i<9)//1~9������
				System.out.print(" + ");//'+'���
			else//i�� 10�ΰ��
			{
				System.out.print(" = ");
				System.out.println(sum);
			}
		}
	}

}
