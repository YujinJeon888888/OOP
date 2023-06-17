package Chapter2;

public class Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		1.자바 언어에서 지원되는 8가지의 기초 자료형은 무엇인가?
				byte, char, short, int, 
				long, double, float, boolean
		2. 문자열은 어떤 클래스를 이용하여 처리할 수 있는가?
				String
		3. 주민등록번호를 프로그램에서 저장하려면 자바의 어떤 자료형을 선택하는 것이 좋을까
				int
		4. 다음 중에서 올바른 주석이 아닌 것은?
				"/*주석"
		5. 다음 코드에서 변수와 상수를 구별하시오
*/			
	//	6. 다음과 같은 코드에서 질문에 답하라.
				int v=10;
				int k=v++%5;
				System.out.println(v+"와"+k);
				//1)v와k의 값은?->v:11, k:0
				
				//2)만약 두 번째 문장이 int k=++v%5;였다면 v와 k의 값은? ->v:11, k=1
				v=10;
				k=++v%5;
				System.out.println(v+"와"+k);
		//7. 다음 문장들을 실행했을 경우의 출력결과를 적으시오
		System.out.println("100"+"200");
		System.out.println(100+200);
		System.out.println("100"+200);
		/*		100200
				300
				100200*/
		//8. 다음 프로그램의 출력은?
			//10209->틀림
			//답:309
		int i1=10;
		int i2=20;
		String s1="9";
		System.out.println(i1+i2+s1);//i1+i2:30
		//9. 다음 문장이 실행될 때 변수 i의 값은? 참고로 Math.random()은 0보다 크고 1보다 작은 실수를 반환한다.
				int i=(int)Math.random();
				System.out.println(i);
		//답:0
		
		//10. boolean 변수의 값을 true에서 false로 반전시키려면 어떤 연산자를 사용해야 하는가?
				//!true
				System.out.println(!true);
		//11. 2개의 값을 비교하려고 한다. =연산자를 사용하여야 하는가? 아니면 ==연산자를 사용하여야 하는가?
				//==
		//12. 다음 프로그램의 출력은?
				//abcghidef
				String S1="abc";
				String S2="def";
				String S3=S2;
				S2="ghi";
				System.out.println(S1+S2+S3);
		//13. 다음 프로그램의 출력은?
				// b: false
				int x=100;
				double y=123.4;
				boolean b= (x == y);
				System.out.println(b);
		14. 다음 프로그램에서 6의 값이 두 번 출력되는 이유를 설명하라.
		//i++때문에
		15. 각 문장을 실행한 후, 변수의 값을 표에 기록하시오. 사용자는 2 3 과 같이 입력한다고 가정한다.
		
	}

}
