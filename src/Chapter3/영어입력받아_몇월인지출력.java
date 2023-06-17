package Chapter3;
import java.util.Scanner;
public class 영어입력받아_몇월인지출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.print("달의 이름을 입력하세요(소문자입력,1~3월까지): ");
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
		System.out.println(s+"는"+month_number+"월");
	}

}
