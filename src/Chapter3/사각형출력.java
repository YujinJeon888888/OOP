package Chapter3;
import java.util.Scanner;
public class �簢����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��ø�� ���->�ܺιݺ���:��, ���ιݺ���:* ����
		int ����;
		int ����;
		System.out.print("���θ� �Է��ϼ���: ");
		Scanner in=new Scanner(System.in);
		����=in.nextInt();
		System.out.print("���θ� �Է��ϼ���: ");
		����=in.nextInt();
		
		for(int i=1;i<=����;i++)
		{
			for(int j=1;j<=����;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
