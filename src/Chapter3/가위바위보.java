package Chapter3;
import java.util.Scanner;
public class 가위바위보 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int 가위=1;
		final int 바위=2;
		final int 보=3;
		
		Scanner in=new Scanner(System.in);
		System.out.println("가위(1)바위(2)보(3): ");
		int user=in.nextInt();
		
		int computer=(int)Math.random()*3+1;//Math.random():double형
		System.out.println("컴퓨터가 낸 것: "+computer);
		if(user==computer)
			System.out.println("비겼습니다");
		else if(user==(computer+1)%3)
			System.out.println("당신이 이겼습니다.");
		else
			System.out.println("당신이 졌습니다.");
	}
}
