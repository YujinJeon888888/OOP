package Chapter3;
import java.util.Scanner;
public class 구구단출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("구구단 중에서 출력하고 싶은 단을 입력하세요.");
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		int i=1;
		while(i<=9)
		{
			System.out.println(num+"*"+i+"="+num*i);
			i++;
		}
		
	}

}
