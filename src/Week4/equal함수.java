package Week4;
import java.util.*;
public class equal함수 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s;
		System.out.println("exit를 누르면 종료합니다.");
		while(true) {
			System.out.println(">>");
			s=in.nextLine();
			if(s.equals("exit")) {
				break;
			}
		}
		System.out.println("종료합니다");
	}

}
