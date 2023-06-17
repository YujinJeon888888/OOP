package 예외처리;

import java.util.Scanner;

public class 예외처리 {
	//throw
	public  static void method1() {
		try {

			method2();
		}catch(ClassNotFoundException e) {
			System.out.println("그런 클래스는 없습니다!");
			System.out.println(e.getMessage());
			//e.printStackTrace();//뭐하다죽은지알려줌(빨간메세지)
		}
	}

	public  static void method2() throws ClassNotFoundException {//throws-떠넘김=> 호출한곳으로 감=method2

		Class clazz =  Class.forName("java.lang.String2");
	}

	public static void main(String[] args) {
		//main에서 던지면 os가 받음.

		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		//0으로 나누기, index 잘못 사용
		int [] ar=new int[5];
		//ar[10]=100;
		//유효범위초과,컴파일에러 안 잡힘
		//java.lang.ArrayIndexOutOfBoundsException(예외 알려줌)
		int result=0;
		//Thread.sleep(1000);//여기다 두면 에러남. 인터럽티드 익셉션=확인오류(컴파일러체크에러)
		//추천 방법: try, Throw. try여러 개 가능

		method1();

		try {
			//안에 넣어봤을 때. 
		
			ar[4]=100;
			//예외사례 1 = ArrayIndexOutOfBoundsException
			//ar[10]=100;//문제 발생 예상되는 것 해당
			
								 //예외사례 1 = ArrayIndexOutOfBoundsException
			for(int i=0; i<5;i++)//범위 15까지->5번부터죽음(돌다가죽음)=>예외발생=>catch들렀다가 finally 들렀다가 종료
				System.out.println(ar[i]);

			int d=5;
			//예외사례 2 = ArithmeticException //0으로 나눌라함
			//result = d/0;//0으로 나눌 때=>실행에러 잡아야됨=>catch
		 
			//독수리 aa=new 독수리();//에러남. 독수리 class없으니까
			
			//예외사례 3 = ArrayStoreException // 저장 이상하게 함(String객체인데 Integer를 넣음)
			// Object x[] = new String[3];
		    // x[0] = new Integer(0);
		     
		     ///////////////////////////////////////////////
			Thread.sleep(1000);//1000이 1초, 딜레이 주는 것. 대표적 예외발생 문장->위에 라인 보기
			//확인예외->예외처리문에 있기만 하면 통과. 컴파일되도록 도와줌
			//Thread.sleep(1000);<-이거 확인예외라는게 컴파일에러는 그냥 예외처리문에 있기만 하면 통과된다는건가요?=O

			System.out.println("정수를 입력하세요");
									//예외사례 4 InputMismatchException // 타입 이상한거(안맞는거) 넣음
			int num=input.nextInt();//abcd, 큰 수 예외 해보기(근데 여기 안 써놓음->가장아래 catch에서 잡힐 것)
		
			// 예외사례 5 ClassCastException // 캐스팅(형변환) 이상함
			 Object x = new Integer(0);
		     System.out.println((String)x);

			
		} 
		catch(java.lang.ArrayStoreException e) {

			System.out.println("잘못된 유형의 객체를 저장했어요");
		}
		catch(java.lang.ClassCastException e) {

			System.out.println("캐스팅(형변환)이 이상하네요. ");
		}
		catch(java.lang.ArithmeticException e) {

			System.out.println("0으로 나눌수 없습니다!");
			//result=10;//문법에러. 지역변수임(블럭안에서 생성된 변수는 블럭 나가면 죽음)=>바깥에서 선언하기
		}
		catch(ArrayIndexOutOfBoundsException e) {
			//e로 여러가지 기능 줌
			System.out.println("아마도 배열의 인덱스의 유효범위가 초과되었을 거에요!");
			System.out.println(e.getMessage());//오류메시지
			System.out.println(e.toString());//어디서 죽었는지를 알려줌(몇번째라인)
			e.printStackTrace();//어디서, 왜 죽었는지 다 보여줌 (빨간문장)
		}

		catch(Exception e) {
			System.out.println("위에서 잡지 못한 예외가 여기서 처리됩니다!");
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
		}
		finally {

			System.out.println("예외가 있거나 없거나 항상 실행되는 블럭입니다.");

		}
		//try블록 뒤(정상종료)
		System.out.println("여기까지 실행될 수 있을까요?");
		System.out.println("이 문장을 볼 수있다면 프로그램에 아무 문제가 없을 경우에요!");


	}

}
