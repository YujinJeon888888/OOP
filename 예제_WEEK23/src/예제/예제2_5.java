package ����;
import java.util.Scanner;
public class ����2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�� ������ ������ �Է¹ް�, �� �ð�, �� ��, �� ������ ����ϴ� ���α׷� �ۼ�
		Scanner input=new Scanner(System.in);
		
		int hour;
		int minute;
		int second;
		System.out.println("�ʸ� �Է��ϼ���");
		second=input.nextInt();
		input.nextLine();
		minute=second/60;
		hour=minute/60;
		System.out.printf("��: %d\n",second);
		System.out.printf("��: %d\n",minute);
		System.out.printf("�ð�: %d\n",hour);
	}

}
