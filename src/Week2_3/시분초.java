package Week2_3;
import java.util.*;
public class �ú��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hour;
		int min;
		int sec;
		Scanner in= new Scanner(System.in);
		System.out.println("�ʸ� �Է��ϼ���");
		sec=in.nextInt();
		hour=sec/3600;
		min=sec%3600/60;
		sec=sec%3600%60;
		System.out.println("��: "+hour+" ��: "+min+" ��: "+sec);
	}

}
