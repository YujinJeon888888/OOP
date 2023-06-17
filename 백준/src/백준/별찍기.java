package 백준;
import java.util.*;
public class 별찍기 {
//행, 스페이스, 별 동시에 생각하기(반복횟수는 별개)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int 높이=in.nextInt();
		for(int i=1;i<=높이;i++)//행
		{
			for(int j=1;j<=높이-i;j++)//space
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)//star
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

