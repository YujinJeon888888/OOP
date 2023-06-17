package 백준;

import java.util.*;
public class 질문_최소최대 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int num;
		int temp=0;
		num=in.nextInt();
        //in.nextLine();
		int[] arr=new int[num];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=in.nextInt();
		}
        for(int scan=0;scan<arr.length;scan++)
			{
				for(int i=0;i<arr.length-1;i++)
				{
					if(arr[i]>arr[i+1])
					{
						temp=arr[i];
						arr[i]=arr[i+1];
						arr[i+1]=temp;
					}
				}
			}
		System.out.println(arr[0]+" "+arr[num-1]);
	}
}
