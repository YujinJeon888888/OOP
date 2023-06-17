package 예제;
import java.util.Scanner;
public class 예제2_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		
		System.out.print("점수를 입력하세요(0~100): ");
		int score=in.nextInt();
		char grade;
		switch(score/10)
		{
		case 10: //score=100
		case 9:
			grade='A';
			break;//10,9=>'A'
		case 8:
			grade='B';
			break;
		case 7:
			grade='C';
			break;
		case 6:
			grade='D';
			break;
		default:
			grade='F';
		}
		System.out.println("학점은"+grade+"입니다.");
	}
}