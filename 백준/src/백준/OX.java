package ����;

import java.util.*;
public class OX{

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		int num=in.nextInt();
		String str;
		
		for(int i=0;i<num;i++)//��
		{	
			str=in.next();
			int count=0;
			int sum=0;
			
			for(int j=0;j<str.length();j++)//��
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