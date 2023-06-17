package 예제;
//비트논리 연산과 비트 시프트 연산
public class 예제2_9 {
	public static void main(String[]args) {
	short a=0x0011;//16진수
	short b=0x1110;
	
	System.out.println("[비트연산결과]");
	System.out.printf("%04x\n",(a&b));//비트 and. 16진수 4자리수 맞춤
	System.out.printf("%04x\n",(a|b));//비트 or
	System.out.printf("%04x\n",(a^b));//비트 xor. 같으면 0 다르면 1. 1101
	System.out.printf("%04x\n",(short)(~a));//not a. 비트 not->비트반전.	
	
	byte c=20;
	byte d=-8;
	
	//비트 시프트 연산
	System.out.println("[시프트연산결과]");
	System.out.println(c<<2);//c를 2비트 왼쪽 시프트. 0001 0100->0101 0000
	System.out.println(c>>2);
	System.out.println(d>>2);
	System.out.printf("%x\n",(d>>>2));//d를 2비트 오른쪽 시프트. 0삽입(양수)
	
	} 
}
