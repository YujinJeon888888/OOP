package ����;
import java.util.Scanner;
public class BobbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner in=new Scanner(System.in);
		System.out.print("n�� �Է��ϼ���: ");
		n=in.nextInt();
		int[] arr=makeArray(n);//�迭:������:����Ŵ
		showArray(arr);
		System.out.println("����: ");
		sortArray(arr);
		showArray(arr);
		
	
	}

private static void sortArray(int[] arr) {
		// TODO Auto-generated method stub
		for(int scan=0;scan<arr.length;scan++)
		{
			for(int i=0;i<arr.length-1;i++)
			{
				if(arr[i]>arr[i+1])//���� ���ҿ� ���ڸ� ���Ҹ� ����
				{
					int temp=arr[i+1];
					arr[i+1]=arr[i];
					arr[i]=temp;
				
				}
			}
		}
	}

private static void showArray(int[] arr) {
		// TODO Auto-generated method stub
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
}

public static int[] makeArray(int n)
{
	int[] arr=new int [n];
	for(int i=0;i<n;i++)
	{
		arr[i]=n-i;
	}	
	return arr;
}

}//class