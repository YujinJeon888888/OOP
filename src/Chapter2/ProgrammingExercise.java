package Chapter2;
import java.util.Scanner;
public class ProgrammingExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 하나의 상자에 오렌지를 10개씩 담을 수 있다고 하자. 오렌지가 127개 있다면 상자 몇 개가 필요한가?
		//또 몇 개의 오렌지가 남을까?
		//12개, 7개
		//2. 마일을 킬로미터로 변환하는 프로그램을 작성한다. 1마일은 1.609킬로미터와 같다. 사용자로부터 마일의 값을 읽어들인다.
		double mile;
		double killo_meter;
		Scanner in=new Scanner(System.in);
		System.out.printf("마일을 입력하시오:");
		mile=in.nextDouble();
		in.nextLine();
		killo_meter=1.609*mile;
		System.out.println(mile+"마일은"+killo_meter+"킬로미터입니다.");
		/*3. 상점에 가면 우리는 상품에 대한 돈을 내고 영수증을 받는다. 영수증에서는 10% 부가세와 잔돈 등이 인쇄되어있다.
		 * 구입한 상품의 가격과 손님한테 받은 금액을 입력하면 부가세와 잔돈을 출력하는 프로그램을 작성해보자*/
		int 받은_돈;
		int 상품가격;
		int 부가세;
		int 잔돈;
		System.out.print("받은 돈: ");
		받은_돈=in.nextInt();
		in.nextLine();
		System.out.print("상품 가격: ");
		상품가격=in.nextInt();
		in.nextLine();
		System.out.print("부가세: "+상품가격/10+"\n");
		잔돈=받은_돈-상품가격;
		System.out.print("잔돈: "+ 잔돈);
		//4. 사용자로부터 구의 반지름을 입력받아 부피를 계산하여 출력하는 프로그램을 작성하라. 단
		//구의 반지름은 실수로 입력되며 출력도 모두 실수형으로 하여야 한다. 부피를 계산하는 수식은 다음과 같다.
		double radius;
		System.out.print("\n구의 반지름: ");
		radius=in.nextDouble();
		double c=(double)4/3*radius*radius*radius;
		System.out.println("구의 부피: "+c);
		//5. 정수(최대 3자리)를 2진수로 변환하여 출력하는 프로그램을 작성해보자.
		int 정수;
		System.out.println("정수를 입력하시오");
		정수=in.nextInt();
		int A,B,C,D,E,F,G;
		G=정수%2;
		F=정수%2;
		E=정수%2;
		D=정수%2;
		C=정수%2;
		B=정수%2;
		A=정수%2;
		System.out.print(정수+": "+A+B+C+D+E+F+G);
	}

}
