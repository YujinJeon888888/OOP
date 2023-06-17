package 예외처리;
import java.util.Scanner;
public class Lab2 {
	static Scanner input=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=readInt();
		double d=readDouble();
		
		System.out.println(num);
		System.out.println(d);
	}
	public static int readInt() {
		boolean correct=false;
		String number;
		int value=0;
		while(!correct) {//유효한 값이 입력될때까지
			try {
				System.out.println("input(정수) : ");
				number=input.nextLine();
				value=Integer.parseInt(number);//String을 int로 해석
				correct=true;//유효한 값이 입력되면 여기까지 내려오는데, 아니면 위 코드에서 걸리고 catch로 가니까
			}
			catch(NumberFormatException e) {
				System.out.println("에러! 에러!!!!!!!!!!!!!!!");
			}
		}
		return value;
	}
	
	public static double readDouble() {
		boolean correct=false;
		String number;
		double value=0.0;
		while(!correct) {
			try {
				System.out.println("input(실수) : ");
				number=input.nextLine();
				value=Double.parseDouble(number);
				correct=true;
				
			}
			catch(NumberFormatException e) {
				System.out.println("다시입력하세요");
			}
		}
		return value;
	}
}
