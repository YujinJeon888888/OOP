package Week4;
import java.util.*;

public class 배열평균 {
	static int sum=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray=new int[5];
		sum=input_values_int_array(intArray);
		show_array(intArray);
	}//main

	private static void show_array(int[] intArray) {
		// TODO Auto-generated method stub
		System.out.print("array: ");
		for(int i=0;i<5;i++) {
			System.out.print(intArray[i]+" ");
		}
		System.out.println(", 총합: "+sum);
		
		System.out.println("평균: "+sum/intArray.length);
	}

	private static int input_values_int_array(int[] intArray) {
		// TODO Auto-generated method stub
		System.out.println("5개의 정수를 입력하세요>>");	
		Scanner in=new Scanner(System.in);
		int sum=0;
		for(int i=0;i<5;i++)
		{
			System.out.print("["+i+"]: ");
			intArray[i]=in.nextInt();
			sum+=intArray[i];
		}
		return sum;
	}
}
