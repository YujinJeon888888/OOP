package Chapter3;
import java.util.Scanner;
public class �����Է¹޾�_���������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.print("���� �̸��� �Է��ϼ���(�ҹ����Է�,1~3������): ");
		String s;
		s=in.nextLine();
		int month_number=0;
		switch(s) 
		{
		case "january":
			month_number=1;
			break;
		case "fabruary":
			month_number=2;
			break;
		case "march":
			month_number=3;
			break;
		}
		System.out.println(s+"��"+month_number+"��");
	}

}
