package 예제;
import java.util.Scanner;
public class 예제2_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		
		System.out.print("점수를 입력하세요(0~100): ");
		int score=in.nextInt();
		System.out.println("학년을 입력하세요(1~4): ");
		int year=in.nextInt();
		
		if(score>=60)
		{
			if(year!=4)
				System.out.println("합격!");
			else if(score>=70)
			{
				System.out.println("합격!");
			}
			else
				System.out.println("불합격!");
		}
		else
			System.out.println("불합격!");
	}

}
