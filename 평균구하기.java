package Week4;

import java.util.*;
public class ��ձ��ϱ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int a=0,sum=0,count=0;
		while(true) {
			a=in.nextInt();
			if(a==-1)
				break;
			sum+=a;
			count++;
		}
		if(count==0)
			System.out.println("�Էµ� �� ����");
		else
		{
			System.out.println("���ݱ��� �Էµ� ������ ������ "+count +"���̸� ");
			System.out.println("����� "+(double)sum/count+"�Դϴ�");
		}

	}

}
