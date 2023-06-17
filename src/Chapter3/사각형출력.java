package Chapter3;
import java.util.Scanner;
public class 사각형출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//중첩문 사용->외부반복문:줄, 내부반복문:* 개수
		int 가로;
		int 세로;
		System.out.print("세로를 입력하세요: ");
		Scanner in=new Scanner(System.in);
		세로=in.nextInt();
		System.out.print("가로를 입력하세요: ");
		가로=in.nextInt();
		
		for(int i=1;i<=세로;i++)
		{
			for(int j=1;j<=가로;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
