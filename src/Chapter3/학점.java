package Chapter3;
import java.util.Scanner;

public class ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		//90>= a 80>= b 70>=c..d���� ������ f
		int num;
		System.out.println("������ �Է��ϼ���");
		num=in.nextInt();
		if(num<=100&&num>=90)
			System.out.println("A");
		else if(num>=80)
			System.out.println("B");
		else if(num>=70)
			System.out.println("C");
		else if(num>=60)
			System.out.println("D");
		else
			System.out.println("F");
		
	}

}
