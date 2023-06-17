package Chapter3;
import java.util.Scanner;
public class do_while_정확한입력받기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int month=0;
		do
		{
			System.out.println("올바른 월을 입력하시오(1~12): ");
			month=in.nextInt();
		}while(!(month>=1&&12>=month));
	}

}
