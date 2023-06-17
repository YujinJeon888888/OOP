package Object_String;

public class Wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//이름이 Wrapper인 클래스는 존재하지 않으며, 기본 타입의 값을 객체로 다룰 수 있도록 제공함
		//각 Wrapper클래스마다 편리한 기능들이 작성되어 있음
		//Integer., Byte. 으로 확인해보기
		
		//기본타입 값으로 Wrapper 객체 생성
		Integer i=Integer.valueOf(10);
		Character c=Character.valueOf('c');
		Double d=Double.valueOf(3.14);
		Boolean b=Boolean.valueOf(true);
		
		//문자열로 Wrapper 객체 생성
		Integer I=Integer.valueOf("10");
		Double D=Double.valueOf("3.14");
		Boolean B=Boolean.valueOf("true");
		
		//Float객체는 double타입의 값으로 생성 가능??
		Float f=Float.valueOf(3.14f); 
		
		//Wrapper 객체들은 거의 유사하며, 많은 메소드가 static타입
		//Integer 클래스의 주요 메소드들
		Integer.bitCount(44);
		Integer.parseInt("10");//parse:해석 . 문자열을 인트로 해석
		Integer.parseInt("50", 8);//8진수로
		Integer.toBinaryString(50);//정수 i를(인자) 이진수 표현으로 변환한 문자열(리턴값) 리턴 
		Integer.toHexString(40);//정수 i를(인자) 16진수 표현으로 변환한 문자열(리턴값) 리턴 
		Integer.toOctalString(40);//정수 i를(인자) 8진수 표현으로 변환한 문자열(리턴값) 리턴
		Integer.toString(40);//정수 i를 문자열로 변환하여 리턴
		Integer.valueOf(50);//정수 i를 담은 Integer객체 리턴
		Integer.valueOf("55");//문자열 s를 정수로 변환하여 담고 있는 Integer객체 리턴
		
		//인스턴스 메소드
		i.floatValue();
		i.longValue();
		i.intValue();
		i.shortValue();
		
		
		//Wrapper 활용
		Integer a=Integer.valueOf(10);//레퍼런스
		int aa=a.intValue();//리턴형: int->10이 담김//단순변수
		
		Character C=Character.valueOf('c');
		char CC=C.charValue();//CC='c'
		
		//문자열을 기본 데이터 타입으로 변환
		int ii=Integer.parseInt("123");//문자열을 숫자로 변환(리턴형: int형)
		//parse:해석하다
		
		//기본 타입을 문자열로 변환
		String s1=Integer.toString(40);
		
		
	}

}
