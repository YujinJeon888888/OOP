package 예제;
import java.util.Scanner;
public class continue문으로양수합구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("정수 5개를 입력하세요");
		int n,sum=0;
		for(int i=0;i<5;)
		{
			
			System.out.println((i+1)+":");
			n=scanner.nextInt();
			if(n<=0)
				continue;//양수가 아닌 경우 반복 다시
			sum+=n;
			i++;//양수 아니면 카운트 x
		}
		System.out.println("양수의합은: "+sum);
	
	}//끝
}
