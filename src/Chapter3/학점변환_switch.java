package Chapter3;

import java.util.Scanner;

public class 학점변환_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		//90>= a 80>= b 70>=c..d까지 나머지 f
		int num;
		System.out.println("점수를 입력하세요");
		num=in.nextInt();
		int number=num/10;//★switch로 바꿀 경우 중요 포인트.
		switch(number)
		{
		case 10://break없어서 쭉 내려감. 똑같이 print "A"적용됨.
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");break;
		case 7:
			System.out.println("C");break;
		case 6:
			System.out.println("D");break;
		default:
			System.out.println("F");break;
		}
	}

}
