package Week4;

import java.util.Scanner;
public class 정렬하기_랜덤 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * chap3-2의 배열영상을 공부한 후, 랜덤하게 10개 또는 N개의 의 숫자를 생성한 후 오름차순으로 정렬합니다.
		 *  -0~100 이내에서
		 * -50~1000 이내에서 정렬방법은 간단한 버블소트를 이용하세요
		 */
		
		Scanner in=new Scanner(System.in);
		System.out.print("n을 입력하세요: ");
		int n=in.nextInt();
		in.nextLine();
		int start,end;
		System.out.print("시작 숫자와 끝 숫자를 입력하세요(0~100사이): ");
		start=in.nextInt();
		end=in.nextInt();
		int[] arr=new int[n];
		makeArray_random(arr,start,end);
		sortArray(arr);
		showArray(arr);
	
	}//main

	private static void showArray(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

	private static void sortArray(int[] arr) {
		// TODO Auto-generated method stub
		for(int scan=0;scan<arr.length;scan++)
		{
			for(int i=0;i<arr.length-1;i++)
			{
				if(arr[i]>arr[i+1])
				{
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
		}
	}

	private static void makeArray_random(int[] arr,int start,int end) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*101)%(end-start+1)+start;//0~100
				for(int j=0;j<i;j++)//중복이면 랜덤 다시 생성
				{
					{
						if(arr[i]==arr[j]) {
						i--;
						}
					}
				}
			//arr[i]=(int)(Math.random()*951+50)%(end-start+1)+start;//50~1000
			//0~950(곱하기)=>50~1000(더하기)
		}
	}

}//class
