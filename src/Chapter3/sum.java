package Chapter3;
import java.util.Scanner;
public class sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		int num;
		int sum=0;
		Scanner in=new Scanner(System.in);
		System.out.print("����� ������ �Է��ϼ���: ");
		num=in.nextInt();
		while(i<=num)
		{
			sum+=i;
			i++;
		}
		System.out.println("��: "+sum);
	}

}
