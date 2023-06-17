package 예외처리;

import java.util.InputMismatchException;
import java.util.Scanner;


public class 예외발생시키기 {
	static Scanner in=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] ar=new int[5];

		try {
			//1. ArrayIndexOutOfBoundsException
			//ar[10]=500;//크기 5까지임
			//2. ArithmeticException
			//int result=3/0;
			//3. ArrayStoreException
			//Object x[] = new String[3];
			//x[0] = new Integer(0);
			//4. InputMismatchException
			//System.out.println("숫자를 입력하세요");
			//int num=in.nextInt();
			//5. ClassCastException 
			Object a = new Integer(0);
			System.out.println((String)a);
		}
		//1. ArrayIndexOutOfBoundsException
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("인덱스 범위 초과");
		}
		//2. ArithmeticException
		catch(ArithmeticException e){
			System.out.println("0으로 나누려는 시도");
		}
		//3. ArrayStoreException
		catch(ArrayStoreException e){
			System.out.println("배열 저장 예외");
		}
		//4. InputMismatchException
		catch(InputMismatchException e){
			System.out.println("타입 이상한거(안맞는거) 넣음");
			in.nextLine();
		}
		//5. ClassCastException 
		catch(ClassCastException e){
			System.out.println("캐스팅(형변환) 이상함");
		}

		System.out.println("프로그램 정상종료");
	}

}
