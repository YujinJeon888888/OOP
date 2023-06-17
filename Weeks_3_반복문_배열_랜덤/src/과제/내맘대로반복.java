package 과제;
import java.util.Scanner;

public class 내맘대로반복 {
	static Scanner in=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				나의위시리스트();	
				내맘대로구구단();
	}//main

	private static void 나의위시리스트() {
		// TODO Auto-generated method stub
		//나의 위시리스트
		String[] obj=new String[3];
		int[] price=new int[3];
		int sum=0;
		
		for(int i=0;i<3;i++)
		{
			System.out.print("갖고싶은 물건을 입력하세요: ");
			obj[i]=in.nextLine();
			System.out.print("가격을 입력하세요: ");
			price[i]=in.nextInt();
			in.nextLine();
			sum+=price[i];				
			System.out.println("총 필요한 금액: "+sum);
			System.out.println();
		}
		System.out.println();
	}

	private static void 내맘대로구구단() {
		// TODO Auto-generated method stub
		
				//내 맘대로 구구단
				int num;
				System.out.print("몇단까지 찍을지 입력하세요: ");
				num=in.nextInt();
				//ⓐ홀수단만.
				System.out.println("=========");
				System.out.println("홀수단만 찍기");
				System.out.println("=========");
				
				for(int i=1;i<=num;i+=2)
				{
					for(int j=1;j<=9;j++)
					{
						System.out.printf("%d x %d = %3d\t",i,j,i*j);
					}
					System.out.println();
				}
				//ⓒ홀수만 계산
				System.out.println("=========");
				System.out.println("계산값 홀수만 찍기");
				System.out.println("=========");
				for(int a=1;a<=num;a++)
				{
					for(int b=1;b<=9;b++)
					{
						if(a*b%2==1)
						System.out.print(a+"x"+b+"="+a*b+"\t");
					}
					System.out.println();
				}
				
				//ⓒ거꾸로 찍기
				System.out.println("=========");
				System.out.println("거꾸로 찍기");
				System.out.println("=========");
				for(int i=num;i>0;i--)
				{
					for(int j=1;j<=9;j++)
					{
						System.out.printf("%d x %d = %3d\t",i,j,i*j);
					}
					System.out.println();
				}
				System.out.println();
	}
}//class
