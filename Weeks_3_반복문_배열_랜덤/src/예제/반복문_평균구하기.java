package ����;
import java.util.Scanner;
public class �ݺ���_��ձ��ϱ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;//count�� �Էµ� ������ ����. ����� ���ؾ� �ϹǷ� �ʿ���
		int sum=0;//��
		Scanner scanner=new Scanner(System.in);
		System.out.println("������ �Է��ϰ� �������� -1�� �Է��ϼ���");
		
		int n=0;
		while(n!=-1)
		{
			n=scanner.nextInt();
			sum+=n;
			count++;
		}
		//-1�� ���� ���� ī��Ʈ��  sum ����
		count--;
		sum+=1;
		
		if(count==0)
			System.out.println("�Էµ� ���� �����ϴ�.");
		else
		{
			System.out.print("������ ������ "+count+"���̸� ");
			System.out.println("����� "+(double)sum/count+"�Դϴ�.");
		}
		scanner.close();
		
	}

}
