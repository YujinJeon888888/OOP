package Chapter3;
import java.util.Scanner;
public class ���丮�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long factorial=1;
		int number;
		Scanner in=new Scanner(System.in);
		System.out.println("�����丮��?");
		number=in.nextInt();
		for(int i=1;i<=number;i++)
		{
			factorial*=i;
		}
		System.out.println(factorial);
	}

}
