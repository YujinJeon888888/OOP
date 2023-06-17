package 예제;
import java.util.Scanner;
public class 예제2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//초 단위의 정수를 입력받고, 몇 시간, 몇 분, 몇 초인지 출력하는 프로그램 작성
		Scanner input=new Scanner(System.in);
		
		int hour;
		int minute;
		int second;
		System.out.println("초를 입력하세요");
		second=input.nextInt();
		input.nextLine();
		minute=second/60;
		hour=minute/60;
		System.out.printf("초: %d\n",second);
		System.out.printf("분: %d\n",minute);
		System.out.printf("시간: %d\n",hour);
	}

}
