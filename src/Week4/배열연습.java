package Week4;

import java.util.Random;

public class �迭���� {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] ar2=new int[5][10];
		
		initArray(ar2);//������)ȣ���� ������ ����Ű�� ��, �޼ҵ忡���� ����Ų ��.
		showArray(ar2);
		System.out.println();
		
		//raggid_ar�����
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
			size=(int)(Math.random()*10)+1;//int score=(int)Math.random()*100; �̷��� �ϸ� 0.������ ���°����� *100�� �ϴ� ��� 0�� ���� �׷��� (ma~��ȣ)
			raggid_ar[row]=new int[size];//�࿡ �� ���� �����: �ݺ��� �� �� �ʿ�x=>�� �޼ҵ� �ȿ��� ������.
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

	private static void showArray(int[] ��) {
		// TODO Auto-generated method stub
		for(int col=0;col<��.length;col++) {
			System.out.print(��[col]+" ");
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

	private static void initArray(int ��[],int start) {
		// TODO Auto-generated method stub
		for(int col=0;col<��.length;col++) {
			��[col]=10*col+(start+col);
		}
	}
}
