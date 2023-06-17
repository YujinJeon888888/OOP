package _0330;
import java.util.Random;
public class 랜덤 {
	private static void InItArray(int[] ar,int start) {
		// TODO Auto-generated method stub
		for(int i=0;i<ar.length;i++) {
			ar[i]= (i+start);
		}
	}
	private static void ShowArray(int[] ar) {
		// TODO Auto-generated method stub
		for(int i=0;i<ar.length;i++) {
			System.out.printf("%3d",ar[i]);
		}
		System.out.println();
	}
	private static void InItArray_Random(int[] ar) {
		// TODO Auto-generated method stub
		Random r=new Random();//ⓐ
		Math.random();//리턴값 double//ⓑ
		for(int i=0;i<ar.length;i++) {
			ar[i]=(int)(Math.random()*100);//0부터 입력값까지, 데이터형에 맞게 next쌸라
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] ar=new int[20];
		//초기화하기
		InItArray(ar,10);//포인터라 배열명 넣어줌
		ShowArray(ar);
		
		//랜덤수로 초기화하기
		InItArray_Random(ar);
		ShowArray(ar);
	
	}//메인끝
	
}//클래스끝
