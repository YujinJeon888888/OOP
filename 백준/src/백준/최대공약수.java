package ����;
import java.util.*;
public class �ִ����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int a=in.nextInt(), b=in.nextInt();
		  System.out.printf("%d\n", gcd(a, b));
		}

	private static int gcd(int a, int b) {
		// TODO Auto-generated method stub
		int ����=a>b?a:b;
		int �ִ�����=0;
		for(int i=1;i<=����;i++)
		if(a%i==0&&b%i==0) {
			�ִ�����=i;
		}
		return �ִ�����;
	}

}
