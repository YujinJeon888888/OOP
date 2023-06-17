package _0330;
import java.util.Random;
public class 배열연습 {

	private static void showArray(int[] ar) {
		// TODO Auto-generated method stub
		//내부반복문역할.  1차배열 처리하는 곳.
		for(int i=0;i<ar.length;i++) {
			System.out.printf("%3d",ar[i]);
		}
		System.out.println();
	}
	public static void showArray(int [][] ar) {
		//외부반복문역할.  2차배열 처리하는 곳.
		for(int row=0; row<ar.length; row++)
			{
			System.out.print(row+"행: ");
			showArray(ar[row]);//2차배열을 1차배열 처리하는 곳으로 보냄: 행 처리한거를 열 처리하는 곳으로 보냄: 행마다 열 출력
			}
	}
	private static void initArray(int[][] ar2) {//행
		// TODO Auto-generated method stub
	for(int row=0;row<ar2.length;row++) {
		int col=1;
		initArray(ar2[row],col+row*10);
	}
}
	private static void initArray(int[] ar1,int start) {//열
			// TODO Auto-generated method stub
		for(int i=0;i<ar1.length;i++) {
			ar1[i]= (start+i);
		}
	}
	public static void makeArray(int[][]ar) {
		for(int row=0;row<ar.length;row++)
		{
			ar[row]=new int[row+1];
		}
	}
	private static void makeArray_Random(int[][]ar) {
		// TODO Auto-generated method stub
		Random r=new Random();
		int size=0;
		for(int row=0;row<ar.length;row++) {
			size=r.nextInt(10);
			ar[row]=new int[size];//열 생성
		}
	}	
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
	
}