package Object_String;

public class WrapperQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("대문자를 소문자로 변환"+Character.toLowerCase('A'));//대문자를 소문자로 변환
		char c1='4',c2='F';
		if(Character.isDigit(c1))	System.out.println(c1+"는 숫자");//리턴값: boolean
		if(Character.isAlphabetic(c2)) System.out.println(c2+"는 알파벳");
		
		System.out.println("문자열 -123을 10진수로 변환"+Integer.parseInt("-123"));
		System.out.println("정수 28을 16진수 문자열로 변환"+Integer.toHexString(28));
		System.out.println("28을 2진수 문자열로 변환"+Integer.toBinaryString(28));
		System.out.println("28에 대한 2진수의 1의 개수"+Integer.bitCount(28));//켜진 비트의 값을 체크
		
		Double d=Double.valueOf(3.14);
		System.out.println("Double을 문자열 "+d.toString()+"로 변환");
		System.out.println("문자열을 실수 "+Double.parseDouble("3.14")+"로 변환");
		
		boolean b=(4>3);//b는 true
		System.out.println("true를 문자열 "+Boolean.toString(b)+"로 변환");
		System.out.println("문자열을 false로 변환: "+Boolean.parseBoolean("false"));
	}

}
