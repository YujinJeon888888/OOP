package Chapter3;
import java.util.Scanner; 
public class 홀수짝수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int num;
		System.out.print("정수를 입력하세요: ");
		num=in.nextInt();
		if(num%2==0)
			System.out.println("입력된 정수는 짝수입니다.");
		else
			System.out.println("입력된 정수는 홀수입니다.");
	}

}
