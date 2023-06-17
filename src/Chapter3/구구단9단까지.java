package Chapter3;

public class 구구단9단까지 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int a=1;a<=9;a++)
		{
			for(int b=1;b<=9;b++)
			{
				System.out.printf("%d x %d = %2d\t",a,b,a*b);
			}
			System.out.println();
		}
	}

}
