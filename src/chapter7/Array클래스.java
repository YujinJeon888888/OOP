package chapter7;

import java.util.Arrays;

public class Array클래스 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {9,29,3,1,2};
		Arrays.sort(array);
		printArray(array);
		System.out.println(Arrays.binarySearch(array,9));
		Arrays.fill(array, 8);
		printArray(array);
	}

	private static void printArray(int[] array) {
		// TODO Auto-generated method stub
		System.out.print("[");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println("]");
	}
	//결과
	//	[1 2 3 9 29 ]
	//	3
	//	[8 8 8 8 8 ]
}
