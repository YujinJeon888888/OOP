package Week4;

import java.util.Scanner;

public class 문자삼각형 {
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
		System.out.print("삼각형의 높이를 입력하세요 : ");
		size=input.nextInt();
		
		char [][] box = new char[size][size];
		String  ch="ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		int i=0;
		int k,r,c, rr;
		
		//인덱스를 0부터 증가
		for(k=0;k<size; k++) {
			for(c=0;c<size-k; c++) {				
				box[k+c][size-c-1]= ch.charAt(i++);
				if(i == ch.length()) i=0;
			}
		}
		showBox(box,size);
		i=0;
		//인덱스를 size부터 감소 
		for (k=size; k>=0; k-- ) {
			r = size-k;
			for (c = size-1; c>=r; c--) {
				rr= r+ (size -c)-1;  // 이 규칙을 찾아내어야 해요~!
				box[rr][c]= ch.charAt(i++);
				if(i == ch.length()) i=0;
			}
		}		         
		showBox(box,size);
	}
}

