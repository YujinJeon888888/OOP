package 과제;
import java.util.Scanner;
public class 트리모양 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String 메뉴="1. 트리 2. 네모 3. 세모 0. 그만";
		String 삼각형_메뉴="1. 왼쪽직각삼각형 2. 오른쪽직각삼각형 3. 정삼각형 0. 그만 ";
				
		while(true)
		{
			int 높이;
			int 번호;
			Scanner in=new Scanner(System.in);
			
			System.out.println("메뉴: "+메뉴);
			번호=in.nextInt();
			
			if(번호==1)	
			{
				System.out.print("트리의 세모부분의 높이를 입력하세요: ");
				높이=in.nextInt();
				트리_세모(높이);
			}
			if(번호==2)	
			{
				System.out.print("정사각형의 높이를 입력하세요: ");
				높이=in.nextInt();
				네모(높이);
			}
			if(번호==3)	
			{	
				int 삼각형_번호;
				System.out.println("메뉴: "+삼각형_메뉴);
				삼각형_번호=in.nextInt();
				if(삼각형_번호==1)
				{
					System.out.print("왼쪽직각삼각형의 높이를 입력하세요: ");
					높이=in.nextInt();
					왼쪽직각삼각형(높이);
				}
				if(삼각형_번호==2)
				{
					System.out.print("오른쪽직각삼각형의 높이를 입력하세요: ");
					높이=in.nextInt();
					오른쪽직각삼각형(높이);
				}
				if(삼각형_번호==3)
				{
					System.out.print("정삼각형의 높이를 입력하세요: ");
					높이=in.nextInt();
					정삼각형(높이);
				}
				if(삼각형_번호==0)
					continue;
			}
			if(번호==0)
				break;
		}//main
		
		
	}

	private static void 오른쪽직각삼각형(int 높이) {
		// TODO Auto-generated method stub
		System.out.println("==============");
		System.out.println("오른쪽직각삼각형모양");
		System.out.println("==============");
		int num=1;
		for(int i=1;i<=높이;i++)//행
		{
			System.out.printf("%2d행:",num);
			num++;
			for(int j=1;j<=높이-i;j++)//space
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)//star
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void 왼쪽직각삼각형(int 높이) {
		// TODO Auto-generated method stub
		System.out.println("==============");
		System.out.println("왼쪽직각삼각형모양");
		System.out.println("==============");
		int num=1;
		for(int i=1;i<=높이;i++)//행
		{
			System.out.printf("%2d행:",num);
			num++;
			for(int j=1;j<=i;j++)
				{
				System.out.print("*");
				}
			System.out.println();
		}
	}

	private static void 트리_세모(int 높이) {
		// TODO Auto-generated method stub
		System.out.println("==============");
		System.out.println("트리모양");
		System.out.println("==============");
		
		int num=1;
		int star=0;
		for(int i=1;i<=높이;i++)
		{
			System.out.printf("%2d행:",num);
			num++;
			for(int j=1;j<=높이-i;j++)//space
			{
				System.out.print(" ");
			}
			star=(i-1)*2+1;//홀수(홀수가 1부터 시작하도록)
			for(int j=1;j<=star;j++)//star
			{
				System.out.print("*");
			}
			System.out.println();
		}
		트리_네모(star,num);
	}

	private static void 트리_네모(int width,int num) {
		// TODO Auto-generated method stub
		int star=width/3;
		int space=(width-star)/2;
		for(int i=1;i<=star;i++)//star길이:네모의가로길이(정사각형):네모의 행 갯수
		{
			System.out.printf("%2d행:",num);
			num++;
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	private static void 정삼각형(int 높이) {
		// TODO Auto-generated method stub
		System.out.println("==============");
		System.out.println("정삼각형모양");
		System.out.println("==============");
		
		int num=1;
		int star=0;
		for(int i=1;i<=높이;i++)
		{
			
			System.out.printf("%2d행:",num);
			num++;
			for(int j=1;j<=높이-i;j++)//space
			{
				System.out.print(" ");
			}
			star=(i-1)*2+1;//홀수(홀수가 1부터 시작하도록)
			for(int j=1;j<=star;j++)//star
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	private static void 네모(int 높이) {
		// TODO Auto-generated method stub
		System.out.println("==============");
		System.out.println("네모모양");
		System.out.println("==============");
		
		int num=1;
		for(int i=1;i<=높이;i++)//star길이:네모의가로길이(정사각형):네모의 행 갯수
		{
			
			System.out.printf("%2d행:",num);
			num++;
			for(int j=1;j<=높이;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}//class