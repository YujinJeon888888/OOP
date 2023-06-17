package Chapter3;
import java.util.Scanner;
public class sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		int num;
		int sum=0;
		Scanner in=new Scanner(System.in);
		System.out.print("몇까지 더할지 입력하세요: ");
		num=in.nextInt();
		while(i<=num)
		{
			sum+=i;
			i++;
		}
		System.out.println("합: "+sum);
	}

}
