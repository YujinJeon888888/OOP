package Chapter3;
import java.util.Scanner;
public class ÆÑÅä¸®¾ó {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long factorial=1;
		int number;
		Scanner in=new Scanner(System.in);
		System.out.println("¸îÆÑÅä¸®¾ó?");
		number=in.nextInt();
		for(int i=1;i<=number;i++)
		{
			factorial*=i;
		}
		System.out.println(factorial);
	}

}
