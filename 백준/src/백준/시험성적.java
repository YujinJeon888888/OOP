package ����;
import java.util.*;
public class ���輺�� {
//���� ������ �Է¹޾� 90 ~ 100���� A, 80 ~ 89���� B, 
//70 ~ 79���� C, 60 ~ 69���� D, ������ ������ F�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner in=new Scanner(System.in);
			int score;
			score=in.nextInt();
			score/=10;
			switch(score)
			{
			case 10:
			case 9:
				System.out.println("A");
				break;
			case 8:
				System.out.println("B");
				break;
			case 7:
				System.out.println("C");
				break;
			case 6:
				System.out.println("D");
				break;
		
			default:
				System.out.println("F");
				break;
			}
	}

}
