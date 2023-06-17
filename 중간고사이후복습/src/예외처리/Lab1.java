package 예외처리;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Exception;

public class Lab1 {

	public static int getInt(String msg) {
		int num=0;
		Scanner input=new Scanner(System.in);
		
		while(true) {
			try {
				System.out.println(msg);
				num=input.nextInt();
			}
			catch(InputMismatchException e){
				System.out.println("입력형식 오류! 다시 입력하세요");
				input.nextLine();//엔터먹기
				continue;//try로 다시 올라감
			}
			break;
			
		}
		
		return num;
	}	
	public static void main(String[] args) {
		int num1=getInt("정수 1을 입력하세요");
		int num2=getInt("정수 2를 입력하세요");

		
	}

}
