package ����;
import java.util.Scanner;
public class Main_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Retangle rect=new Retangle();//��ü ����
		Scanner input=new Scanner(System.in);
		System.out.println(">>����: ");
		rect.width=input.nextInt();
		System.out.println(">>����: ");
		rect.height=input.nextInt();
		
		System.out.println("�簢���� ������ "+rect.getArea());
		input.close();
	}

}
