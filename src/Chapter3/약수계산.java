package Chapter3;
import java.util.Scanner;
public class ������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*a�� 0�̾ƴ� ���� b�� ������ ������. b��  a�� ���. �� ������ �������� ����� ��:�������� 0�� ��*/
		int i=1;
		int num=0;
		Scanner in=new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ���: ");
		num=in.nextInt();
		System.out.print("�����: ");
		for(i=1;i<=num;i++)
		{
			if(num%i==0)
			System.out.printf(i+" ");
		}
	}

}
