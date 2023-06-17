package Chapter2;
import java.util.Scanner;
public class MiniProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double c;
		double f;
		Scanner in=new Scanner(System.in);
		System.out.println("화씨온도를 입력하시오");
		f=in.nextDouble();
		c=((double)5/9)*(f-32);//(double)5/9 != (double)(5/9). (5/9):기본적으로 정수형
		System.out.println("섭씨온도는 "+c);
		
	}

}
