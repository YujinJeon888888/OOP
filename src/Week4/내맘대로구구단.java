package Week4;
import java.util.*;
public class 내맘대로구구단 {
	static Scanner in=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		메뉴();
	}

	private static void 메뉴() {
		// TODO Auto-generated method stub
		int num=0;
		while(true) {
			System.out.println("====================================");
			System.out.println("1. 홀수단/짝수단만 출력하기");
			System.out.println("2. 19단까지, 2씩 건너서 출력하기");
			System.out.println("3. 거꾸로 찍기");
			System.out.println("0. 종료");
			System.out.println("====================================");
			num=in.nextInt();
			if(num==1)
				{
				System.out.println("1.홀수단만 출력하기 2. 짝수단만 출력하기 9.처음 메뉴로 돌아가기 0.종료");
				num=in.nextInt();
				if(num==1)
					홀수단만출력하기();
				else if(num==2)
					홀수단만출력하기();
				else if(num==9)
					continue;
				else if(num==0)
					break;
				}
			if(num==2)
			{
				_19단까지건너출력();
			}
			if(num==3)
				거꾸로찍기();
			if(num==0)
				break;
		}

	}

	private static void 거꾸로찍기() {
		// TODO Auto-generated method stub
		for(int i=9;i>0;i--)
		{
			for(int j=1;j<=9;j++)
				System.out.print(i+"*"+j+" = "+i*j+"\t");
			System.out.println();
		}
		
	}

	private static void _19단까지건너출력() {
		// TODO Auto-generated method stub
		for(int i=1;i<=19;i+=2)
		{
			for(int j=1;j<=9;j++)
				System.out.print(i+"*"+j+" = "+i*j+"\t");
			System.out.println();
		}
	}

	private static void 홀수단만출력하기() {
		// TODO Auto-generated method stub
		for(int i=1;i<=9;i+=2) {
			for(int j=1;j<=9;j++)
				System.out.print(i+"*"+j+" = "+i*j+"\t");
			System.out.println();
	}
}
}
