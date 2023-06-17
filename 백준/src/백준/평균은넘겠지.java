package 백준;

import java.util.Scanner;
public class 평균은넘겠지
{
	static Scanner in=new Scanner(System.in);
	public static void main(String[]args)
	{
		Scanner in=new Scanner(System.in);
		int 테스트케이스=0,학생수=0,sum=0,count=0;
		float 평균=0,비율=0;
		int [] 점수;
		테스트케이스=in.nextInt();
		in.nextLine();//다음줄->먹어야함
		for(int i=0;i<테스트케이스;i++)
		{
			
			sum=0;
			count=0;
			학생수=in.nextInt();
			점수=new int[학생수];
			//점수의합
			for(int j=0;j<학생수;j++)
			{
				점수[j]=in.nextInt();
				sum+=점수[j];
			}
			//점수 평균
			평균=(float)sum/(float)학생수;
			for(int j=0;j<학생수;j++)
			{
				if(평균<점수[j])
					count++;
			}
			//비율
			비율= (float)count/(float)학생수*100;//백분율
			//출력
			System.out.printf("%.3f%%\n",비율);		
			in.nextLine();//다음줄(다음 테스트케이스)
		}
	}
}