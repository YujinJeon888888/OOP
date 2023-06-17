package Chapter3;
import java.util.Scanner;
public class 약수계산 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*a는 0이아닌 정수 b로 나누어 떨어짐. b는  a의 약수. 즉 나누어 떨어지게 만드는 수:나머지가 0인 수*/
		int i=1;
		int num=0;
		Scanner in=new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		num=in.nextInt();
		System.out.print("공약수: ");
		for(i=1;i<=num;i++)
		{
			if(num%i==0)
			System.out.printf(i+" ");
		}
	}

}
