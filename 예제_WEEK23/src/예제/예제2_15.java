package ����;
import java.util.Scanner;
public class ����2_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("���� Ŀ�� �帱���?");
		String order=in.nextLine();
		int price=0;
		
		switch(order)
		{
		case "����������"://�ǵ��� break; x
		case "īǪġ��":
		case "ī���":
			price=3500;
			break;
		case "�Ƹ޸�ī��":
			price=2000;
			break;
		default:
			System.out.println("�޴��� �����ϴ�.");
			
		}
		if(price!=0)
			System.out.println(order+"��"+price+"�Դϴ�.");
	
	}

}
