package Week4;

import java.util.Scanner;
public class �����ϱ�_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * chap3-2�� �迭������ ������ ��, �����ϰ� 10�� �Ǵ� N���� �� ���ڸ� ������ �� ������������ �����մϴ�.
		 *  -0~100 �̳�����
		 * -50~1000 �̳����� ���Ĺ���� ������ �����Ʈ�� �̿��ϼ���
		 */
		
		Scanner in=new Scanner(System.in);
		System.out.print("n�� �Է��ϼ���: ");
		int n=in.nextInt();
		in.nextLine();
		int start,end;
		System.out.print("���� ���ڿ� �� ���ڸ� �Է��ϼ���(0~100����): ");
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
				for(int j=0;j<i;j++)//�ߺ��̸� ���� �ٽ� ����
				{
					{
						if(arr[i]==arr[j]) {
						i--;
						}
					}
				}
			//arr[i]=(int)(Math.random()*951+50)%(end-start+1)+start;//50~1000
			//0~950(���ϱ�)=>50~1000(���ϱ�)
		}
	}

}//class
