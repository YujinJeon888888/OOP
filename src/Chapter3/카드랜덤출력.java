package Chapter3;

import java.util.Random;

public class 카드랜덤출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a=
			{
					"Clubs","Diamonds","Hearts","Spades"
			};
		String[] b= 
			{
				"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"
			};
		Random r=new Random();
		
		for(int i=0;i<5;i++)
		{
			System.out.println(a[r.nextInt(4)]+" "+b[r.nextInt(13)]);
		}
	
	}

}
