package ����;
import java.util.Scanner;//��ĳ�ʳ���
public class ����2_4 {
	public static void main(String[]args) { 
	Scanner input=new Scanner(System.in);//Scanner ������ new ��ĳ�� �ý���.in
	String �й�;
	int ����=0;
	String �̸�;
	boolean isReal=true;
	String temp = "abcdefg";
		/*
								 * System.out.println("�й��� �Է��ϼ���"); �й�=input.nextInt(); input.nextLine();//���� ����
								 * System.out.println("���̸� �Է��ϼ���"); ����=input.nextInt(); input.nextLine();//���� ����
								 * System.out.println("�̸��� �Է��ϼ���"); �̸�=input.nextLine();
								 * System.out.println("�Է��Ѱ� ����Դϱ�?");
								 */
	
	//���
	
		/*
		 * System.out.println("�ȳ��ϼ��� �� �й���"+�й�+"�Դϴ�");
		 * System.out.println("�ȳ��ϼ��� �� ���̴�"+����+"�Դϴ�");
		 * System.out.println("�ȳ��ϼ��� �� �̸���"+�̸�+"�Դϴ�");		  
		 */		
	
	//����
		/*
		 * System.out.printf("*************************");
		 */
		while(true) {
		System.out.println("�й�: ");
		�й�=input.nextLine();
		
		System.out.println("����: ");
		����=input.nextInt();
		
		//����: �о ������ �����ִ��� Ȯ���ϰ� ���� ������ �о���� ���� ��, 
		//���� temp�� ���� Ȯ������.
		// if(input.hasNextLine()) temp=input.nextLine();
		//���� temp���� ���� ��� ������?
	
		System.out.println("�̸�: ");//�̸��� ���� ��
		�̸�=input.nextLine();
		
		System.out.println("�Է��� ������ ��¥�ΰ���?(true/false): ");
		isReal=input.nextBoolean();//�Է� �� ���� ����=>temp��
		
		//�Է��� ������ �����ִ��� Ȯ���ϰ� �����ִ� �Է��� �� �о�ϴ�.
		if(input.hasNextLine()) temp=input.nextLine();
		System.out.println("temp= "+temp);
		////////////////////////////////
		System.out.println("����"+�й�+"�й�,�̸���"+�̸�+"�Դϴ�.");
		System.out.println("���̴�"+����+"�̰��, �� ������"+isReal+"�Դϴ�.");
	}
		
	}
}