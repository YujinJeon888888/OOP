package 백준;
import java.util.*;
public class 사분면고르기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int x,y;
		x=in.nextInt();
		in.nextLine();
		y=in.nextInt();
		
		if(x>0)
		{
			if(y>0)
				System.out.println("1");
			else if(y<0)
				System.out.println("4");
		}
		if(x<0)
		{
			if(y>0)
				System.out.println("2");
			else if(y<0)
				System.out.println("3");
		}
	}

}
