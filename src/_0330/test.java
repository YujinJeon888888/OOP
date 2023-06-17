package _0330;

public class test {
	private static void showArray(int[] ar) {//인자를 1차로 받음: 1차로 처리됨
		// TODO Auto-generated method stub
		//내부반복문역할
		for(int i=0;i<ar.length;i++) {
			System.out.printf("%3d",ar[i]);
		}
		System.out.println();
	}
	public static void showArray(int [][] ar) {//인자를 2차로 받음: 2차로 처리됨
		//외부반복문역할. 1번 반복할 때 showArray 1차배열 받는애는 n번 반복중. 결국 ar[0][]일 때 ar[0][1][2][3]출력한다는 거니까  
		for(int row=0; row<ar.length; row++)//ar[0][]으로 받아들이지 말고, 여기는 2차배열 처리하는 곳, 저기는 1차배열 처리하는 곳으로 이해하기
			showArray(ar[row]);//2차배열을 1차배열 처리하는 곳으로 보냄: 행 처리한거를 열 처리한거로 보냄: 행마다 열 출력
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] ar= {{1,2},{3,4}};
		showArray(ar);
		
	}

}
//ar[1][]은 출력이 안되는데? 로 인지부조화x ar[][]: 2차배열 ar[]: 1차배열임. 인자로 1차배열을 받으면 ar[0]이런식으로 시작할것임. 1차배열을 다룬다는 가정하에 인덱스에 접근하는거기 때문에 ar[][2]이렇게 출력할 때 오류뜨는 것처럼 되지 않는 것임. 