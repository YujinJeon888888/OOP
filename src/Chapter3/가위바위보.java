package Chapter3;
import java.util.Scanner;
public class ���������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int ����=1;
		final int ����=2;
		final int ��=3;
		
		Scanner in=new Scanner(System.in);
		System.out.println("����(1)����(2)��(3): ");
		int user=in.nextInt();
		
		int computer=(int)Math.random()*3+1;//Math.random():double��
		System.out.println("��ǻ�Ͱ� �� ��: "+computer);
		if(user==computer)
			System.out.println("�����ϴ�");
		else if(user==(computer+1)%3)
			System.out.println("����� �̰���ϴ�.");
		else
			System.out.println("����� �����ϴ�.");
	}
}
