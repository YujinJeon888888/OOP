package Chapter2;
import java.util.Scanner;
public class MiniProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double c;
		double f;
		Scanner in=new Scanner(System.in);
		System.out.println("ȭ���µ��� �Է��Ͻÿ�");
		f=in.nextDouble();
		c=((double)5/9)*(f-32);//(double)5/9 != (double)(5/9). (5/9):�⺻������ ������
		System.out.println("�����µ��� "+c);
		
	}

}
