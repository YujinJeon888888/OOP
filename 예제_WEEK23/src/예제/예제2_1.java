package 예제;

public class 예제2_1 {//클래스
	public static int sum(int n,int m) {//메소드
		
		return n+m;
	}


//메소드에서 실행 시작
public static void main(String[]args) {//메소드
	int i=20;
	int s;
	char a;
	
	s=sum(i,10);//sum()메소드 호출 *메소드=함수
	a='?';//문자이므로 '' 사용
	System.out.println(a);//문자 '?'화면 출력
	System.out.println("Hello");//"Hello"문자열 화면 출력
	System.out.println(s);//정수 s값 화면 출력
	
	}
}