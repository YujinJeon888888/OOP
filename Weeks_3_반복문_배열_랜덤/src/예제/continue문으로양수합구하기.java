package ����;
import java.util.Scanner;
public class continue�����ξ���ձ��ϱ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("���� 5���� �Է��ϼ���");
		int n,sum=0;
		for(int i=0;i<5;)
		{
			
			System.out.println((i+1)+":");
			n=scanner.nextInt();
			if(n<=0)
				continue;//����� �ƴ� ��� �ݺ� �ٽ�
			sum+=n;
			i++;//��� �ƴϸ� ī��Ʈ x
		}
		System.out.println("���������: "+sum);
	
	}//��
}
