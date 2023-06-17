package Week2_3;
import java.util.*;
public class 시분초 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hour;
		int min;
		int sec;
		Scanner in= new Scanner(System.in);
		System.out.println("초를 입력하세요");
		sec=in.nextInt();
		hour=sec/3600;
		min=sec%3600/60;
		sec=sec%3600%60;
		System.out.println("시: "+hour+" 분: "+min+" 초: "+sec);
	}

}
