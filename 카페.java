package Week4;
import java.util.*;
public class ī�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int order;
		int sum=0;
		int[] ����=new int[2];
		����[0]=3500;
		����[1]=5000;
		while(true) {
			�޴�();
			order=in.nextInt();
			switch(order) {
			case 1:
			case 2:
			case 3:
				System.out.println("3500��");
				sum+=3500;
				break;
			case 4:
				System.out.println("5000��");
				sum+=5000;
				break;
			
			}
			System.out.println("�� ����: "+sum);
			if(order==0)
				break;
		}
		System.out.println("�ֹ��� �����մϴ�.");

	}


	private static void �޴�() {
		// TODO Auto-generated method stub
		System.out.println("==============================================");
		System.out.println("1. ���������� 2. ��Ʈ���� 3. ī��� 4. ��ũƼ 0.�ֹ�����");
		System.out.println("==============================================");
	}

}
