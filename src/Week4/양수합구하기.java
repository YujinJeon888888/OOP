package Week4;
import java.util.*;
public class ����ձ��ϱ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,sum=0;
		Scanner in=new Scanner(System.in);
		for(int i=0;i<5;)
		{
			n=in.nextInt();
			
			
			if(n<0)
				continue;
			sum+=n;
			i++;
		}
		System.out.println("������� ��: "+sum);	
	}

}
