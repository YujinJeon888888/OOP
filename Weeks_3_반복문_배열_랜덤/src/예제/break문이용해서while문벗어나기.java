package 예제;
import java.util.Scanner;
public class break문이용해서while문벗어나기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String text;
		System.out.println("exit를 입력하면 종료합니다.");
		while(true)
		{
			System.out.print(">>");
			text=scanner.nextLine();
			if(text.equals("exit"))//문자열 비교시 equals()사용
				break;
		}
		System.out.println("종료합니다.");
			
	}
}
