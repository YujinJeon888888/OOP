package Chapter3;
import java.util.Scanner;
public class UpDown���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int computer=(int)Math.random()*100+1;
		System.out.print("���� ���纸����(1~100): ");
		int num;
		Scanner in=new Scanner(System.in);
		int �õ�Ƚ��=1;
		while(true)
		{	
			num=in.nextInt();
			in.nextLine();
			if(num>computer)
				System.out.println("down!");
			if(num<computer)
				System.out.println("up!");
			
			if(num==computer)
				{
				System.out.println("�������ϴ�");
				break;}
			�õ�Ƚ��++;		
		}
	System.out.println("�õ�Ƚ��: "+�õ�Ƚ��);
	}
	

}
