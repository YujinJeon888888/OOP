package Week4;

import java.util.Scanner;

public class ���ڻﰢ�� {
	static Scanner input =new Scanner(System.in);
	public static void showBox(char [][] box, int size) {
		int r,c;		
		for(r=0; r<size; r++) {
			for(c=0; c<size; c++)
				System.out.print(box[r][c]+ " ");
			System.out.println();
		}
	}
	public static void main(String[] args) {
		
		int size=0;
		System.out.print("�ﰢ���� ���̸� �Է��ϼ��� : ");
		size=input.nextInt();
		
		char [][] box = new char[size][size];
		String  ch="ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		int i=0;
		int k,r,c, rr;
		
		//�ε����� 0���� ����
		for(k=0;k<size; k++) {
			for(c=0;c<size-k; c++) {				
				box[k+c][size-c-1]= ch.charAt(i++);
				if(i == ch.length()) i=0;
			}
		}
		showBox(box,size);
		i=0;
		//�ε����� size���� ���� 
		for (k=size; k>=0; k-- ) {
			r = size-k;
			for (c = size-1; c>=r; c--) {
				rr= r+ (size -c)-1;  // �� ��Ģ�� ã�Ƴ���� �ؿ�~!
				box[rr][c]= ch.charAt(i++);
				if(i == ch.length()) i=0;
			}
		}		         
		showBox(box,size);
	}
}

