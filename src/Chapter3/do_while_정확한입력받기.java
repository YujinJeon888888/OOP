package Chapter3;
import java.util.Scanner;
public class do_while_��Ȯ���Է¹ޱ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int month=0;
		do
		{
			System.out.println("�ùٸ� ���� �Է��Ͻÿ�(1~12): ");
			month=in.nextInt();
		}while(!(month>=1&&12>=month));
	}

}
