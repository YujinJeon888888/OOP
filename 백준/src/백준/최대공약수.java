package 백준;
import java.util.*;
public class 최대공약수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int a=in.nextInt(), b=in.nextInt();
		  System.out.printf("%d\n", gcd(a, b));
		}

	private static int gcd(int a, int b) {
		// TODO Auto-generated method stub
		int 범위=a>b?a:b;
		int 최대공약수=0;
		for(int i=1;i<=범위;i++)
		if(a%i==0&&b%i==0) {
			최대공약수=i;
		}
		return 최대공약수;
	}

}
