import java.util.Scanner;//��ĳ�ʳ���

public class Main {
	public static void main(String[]args) {
		
		Scanner input=new Scanner(System.in);
		
		//�й�,����,�̸�,Ű, �����ϴ� ����, ����
		
		String �й�;
		int age;
		String �̸�=null;
		double Ű;
		String food;
		boolean b;
		while(true)
		{//��¿� �ȳ�����
		System.out.println("�й��� �Է��ϼ���: ");
		�й�=input.nextLine();
		System.out.println("���̸� �Է��ϼ���: ");
		age=input.nextInt();//���� ��������->�̸� �ڵ��Է�
	
		input.nextLine();//�����ִ� ���͸Ծ��
	
		System.out.println("�̸��� �Է��ϼ���: ");
		�̸�=input.nextLine();
		
		System.out.println("Ű�� �Է��ϼ���: ");
		Ű=input.nextDouble();		
		
		input.nextLine();//�����ִ� ���͸Ծ��.
		
		System.out.println("�����ϴ� ������ �Է��ϼ���: ");
		food=input.nextLine();
		
		System.out.println("�Է��� ������ ��� ����ΰ���?: ");
		b=input.nextBoolean();		
		input.nextLine();//�����ִ� ���͸Ծ��.
		
		//����� �� Ȯ��
		System.out.println("�ȳ��ϼ���.����"+�й�+"�й��̰� �̸���"+�̸�+"�Դϴ�.");
		System.out.println("���̴�"+age+"�Դϴ�.");
		
		System.out.println("Ű��"+Ű+"�̰�");
		System.out.println("�����ϴ� ������"+food+"�Դϴ�.");
		System.out.println("���: "+b);
		if(b==true) break;
		}
		
		//������������ϱ�
	    System.out.println("�ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ�");        
        System.out.println("�ȳ��ϼ���! ���� " + �й� +"�й�,"  + age + "�� " + �̸� +"�̶�� �մϴ�.");
        System.out.println("�����ϴ� ������ " + food +"�̰� Ű��"+Ű+"�Դϴ�.");        
        System.out.println("�ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ�");
        System.out.println("�Է��� ������ ��� " + b +"�Դϴ�.~!!");        
	}
}
