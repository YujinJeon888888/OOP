package ����;
import java.util.Scanner;
public class break���̿��ؼ�while������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String text;
		System.out.println("exit�� �Է��ϸ� �����մϴ�.");
		while(true)
		{
			System.out.print(">>");
			text=scanner.nextLine();
			if(text.equals("exit"))//���ڿ� �񱳽� equals()���
				break;
		}
		System.out.println("�����մϴ�.");
			
	}
}
