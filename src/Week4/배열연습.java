package Week4;

import java.util.Random;

public class 배열연습 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] ar2=new int[5][10];
		
		initArray(ar2);//★인자)호출할 때에는 가리키는 애, 메소드에서는 가리킨 곳.
		showArray(ar2);
		System.out.println();
		
		//raggid_ar만들기
		int [][] raggid_ar=new int[5][];
		makeArray(raggid_ar);
		initArray(raggid_ar);
		showArray(raggid_ar);
		System.out.println();
		//random
		makeArray_Random(raggid_ar);
		initArray(raggid_ar);
		showArray(raggid_ar);
	}

	private static void makeArray_Random(int[][] raggid_ar) {
		// TODO Auto-generated method stub
		Random r=new Random();
		int size;
		for(int row=0;row<raggid_ar.length;row++) {
			size=(int)(Math.random()*10)+1;//int score=(int)Math.random()*100; 이렇게 하면 0.몇으로 나온값에서 *100을 하니 계속 0만 나옴 그래서 (ma~괄호)
			raggid_ar[row]=new int[size];//행에 열 길이 만들기: 반복문 또 쓸 필요x=>이 메소드 안에서 만들음.
		}
	}

	private static void makeArray(int[][] raggid_ar) {
		// TODO Auto-generated method stub
		for(int row=0;row<raggid_ar.length;row++) { 
			raggid_ar[row]=new int[row+1];
		}
	}



	private static void showArray(int[][] ar2) {
		// TODO Auto-generated method stub
		for(int row=0;row<ar2.length;row++) {
			showArray(ar2[row]);
		}
	}

	private static void showArray(int[] 열) {
		// TODO Auto-generated method stub
		for(int col=0;col<열.length;col++) {
			System.out.print(열[col]+" ");
		}
		System.out.println();
	}

	private static void initArray(int[][] ar2) {
		// TODO Auto-generated method stub
		int col=1;	
		for (int row=0;row<ar2.length;row++) {
			initArray(ar2[row],row*10+col);
		}
	}

	private static void initArray(int 열[],int start) {
		// TODO Auto-generated method stub
		for(int col=0;col<열.length;col++) {
			열[col]=10*col+(start+col);
		}
	}
}
