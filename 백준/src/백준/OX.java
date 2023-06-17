package 백준;

import java.util.*;
public class OX{

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		int num=in.nextInt();
		String str;
		
		for(int i=0;i<num;i++)//행
		{	
			str=in.next();
			int count=0;
			int sum=0;
			
			for(int j=0;j<str.length();j++)//열
			{
				if(str.charAt(j)=='O')
					{
					count++;
					sum+=count;
					}
				else
					count=0;
			}
			System.out.println(sum);
		}
		
		
	}//main

}//class