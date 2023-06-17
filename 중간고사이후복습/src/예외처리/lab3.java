package 예외처리;

import java.util.Scanner;

public class lab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=divideNum();
		System.out.println("결과값: "+num);
		
		System.out.println("프로그램 정상종료");
	}
	public static int divideNum() {
		int result=0;
		Scanner in=new Scanner(System.in);
		boolean correct=false;
		int num1,num2;
		while(!correct) {
			try {
				System.out.println("a를 b로 나눌거예요. a를 입력하세요: ");
				num1=in.nextInt();
				System.out.println("a를 b로 나눌거예요. b를 입력하세요: ");
				num2=in.nextInt();
				result=num1/num2;
				//문제 없으면 correct=true;코드 실행됨
				correct=true;
			}
			catch(java.lang.ArithmeticException e) {
				System.out.println("0으로 나눴어요. 다시 입력하세요");
			}
		}
		return result;
	}

}
