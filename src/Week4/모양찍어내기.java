package Week4;
import java.util.*;
public class 모양찍어내기 {
	static Scanner in=new Scanner(System.in);
	static String 메뉴="1. 트리 2. 네모 3. 세모 4. 모래시계 5. 다이아몬드 6. 알파벳 모래시계 7. 알파벳 다이아몬드 0. 그만";
	static int 층=0;	
	static int 트리_행=1;
	static int star_value=0;
	static String 삼각형_메뉴="1. 왼쪽직각삼각형 2. 오른쪽직각삼각형 3. 정삼각형  9. 메뉴로 돌아가기 0. 그만 ";
	public static void main(String[] args) {
		메뉴();
	}
	private static void 메뉴() {
		// TODO Auto-generated method stub
		int num;
		while(true)
		{	
			System.out.println("================================================");
			System.out.println(메뉴);
			System.out.println("================================================");
			num=in.nextInt();
			if(num==1)
				트리();
			if(num==2)
				네모();
			if(num==3)
			{
				System.out.println("================================================");
				System.out.println(삼각형_메뉴);
				System.out.println("================================================");
				num=in.nextInt();
				if(num==1)
					왼쪽직각삼각형();
				if(num==2)
					오른쪽직각삼각형();
				if(num==3)
					정삼각형();
				if(num==9)
					continue;
				if(num==0)
					break;

			}
			if(num==4)
				모래시계();
			if(num==5)
				다이아몬드();
			if(num==6)
				모래시계_알파벳();
			if(num==7)
				다이아몬드_알파벳();
			if(num==0)
				break;
		}



	}
	private static void 모래시계_알파벳() {
		// TODO Auto-generated method stub
		System.out.print("층을 입력하세요: ");
		층=in.nextInt();
		int 행=1;
		int 층1=0;
		int 층2=0;

		층1=층/2+1;
		층2=층/2;
		int count=0;
		char[] star=new char[26];
		char Alpha='A';
		for(int i=0;i<26;i++) {
			star[i]=(char)(Alpha+i);
		}
		for(int i=층1;i>0;i--) {
			System.out.printf("%3d 행: ",행);
			행++;
			for(int j=0;j<층1-i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<((i-1)*2+1);j++) {
				if(count>25)
					count=0;
				System.out.print(star[count]);
				count++;
			}

			System.out.println();
		}
		for(int i=0;i< 층2;i++) {
			System.out.printf("%3d 행: ",행);
			행++;
			for(int j=0;j<층2-(i+1);j++) {
				System.out.print(" ");
			}
			for(int j=0;j<(i+1)*2+1;j++) {
				if(count>25)
					count=0;
				System.out.print(star[count]);
				count++;
			}

			System.out.println();
		}
	}
	private static void 모래시계() {
		// TODO Auto-generated method stub
		System.out.print("층을 입력하세요: ");
		층=in.nextInt();
		int 행=1;
		int 층1=0;
		int 층2=0;

		층1=층/2+1;
		층2=층/2;

		for(int i=층1;i>0;i--) {
			System.out.printf("%3d 행: ",행);
			행++;
			for(int j=0;j<층1-i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<((i-1)*2+1);j++) {
				System.out.print("*");
			}

			System.out.println();
		}
		for(int i=0;i< 층2;i++) {
			System.out.printf("%3d 행: ",행);
			행++;
			for(int j=0;j<층2-(i+1);j++) {
				System.out.print(" ");
			}
			for(int j=0;j<(i+1)*2+1;j++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}
	private static void 다이아몬드_알파벳() {
		// TODO Auto-generated method stub
		System.out.print("층을 입력하세요: ");
		층=in.nextInt();
		int 행=1;
		int 층1=0;
		int 층2=0;

		층1=층/2+1;
		층2=층/2;
		int count=0;
		char[] star=new char[26];
		char Alpha='A';
		for(int i=0;i<26;i++) {
			star[i]=(char)(Alpha+i);
		}
		for(int i=0;i<층1;i++) {//윗부분
			System.out.printf("%3d 행: ",행);
			행++;
			for(int j=0;j<층1-(i+1);j++) {
				System.out.print(" ");
			}               
			for(int j=0;j<i*2+1;j++) {
				if(count>25)
					count=0;
				System.out.print(star[count]);
				count++;
				
			}

			System.out.println();
		}
		for(int i=층2;i>0;i--) {
			System.out.printf("%3d 행: ",행);
			행++;
			for(int j=0;j<층2-i+1;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<((i-1)*2)+1;j++) {
				if(count>25)
					count=0;
				System.out.print(star[count]);
				count++;
			}
			System.out.println();
		}
	}
	private static void 다이아몬드() {
		// TODO Auto-generated method stub
		System.out.print("층을 입력하세요: ");
		층=in.nextInt();
		int 행=1;
		int 층1=0;
		int 층2=0;

		층1=층/2+1;
		층2=층/2;
		
		for(int i=0;i<층1;i++) {//윗부분
			System.out.printf("%3d 행: ",행);
			행++;
			for(int j=0;j<층1-(i+1);j++) {
				System.out.print(" ");
			}               
			for(int j=0;j<i*2+1;j++) {
				System.out.print("*");
			}

			System.out.println();
		}
		for(int i=층2;i>0;i--) {
			System.out.printf("%3d 행: ",행);
			행++;
			for(int j=0;j<층2-i+1;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<((i-1)*2)+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	private static void 네모() {
		// TODO Auto-generated method stub
		System.out.print("층을 입력하세요: ");
		층=in.nextInt();
		int 행=1;
		for(int i=0;i<층;i++) {
			System.out.printf("%3d 행: ",행);
			행++;
			for(int j=0;j<층;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
	private static void 네모_트리(int value){
		// TODO Auto-generated method stub
		for(int i=0;i<value/3;i++) {
			System.out.printf("%3d 행: ",트리_행);
			트리_행++;
			for(int j=0;j<value/3+value%3/2;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<value/3;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	private static void 정삼각형_트리() {
		// TODO Auto-generated method stub
		System.out.print("층을 입력하세요: ");
		층=in.nextInt();
		트리_행=1;
		for(int i=0;i<층;i++) {
			System.out.printf("%3d 행: ",트리_행);
			트리_행++;
			for(int j=0;j<층-(i+1);j++)//i+1: 1부터 시작해야 함.
			{
				System.out.print(" ");
			}
			for(int j=0;j<i*2+1;j++)//홀수. i는 0부터 시작해야함
			{
				System.out.print("*");
			}
			System.out.println();//다음줄
			star_value=i*2+1;
		}
	}
	private static void 정삼각형() {
		// TODO Auto-generated method stub
		System.out.print("층을 입력하세요: ");
		층=in.nextInt();
		int 행=1;
		for(int i=0;i<층;i++) {
			System.out.printf("%3d 행: ",행);
			행++;
			for(int j=0;j<층-(i+1);j++)//i+1: 1부터 시작해야 함.
			{
				System.out.print(" ");
			}
			for(int j=0;j<i*2+1;j++)//홀수. i는 0부터 시작해야함
			{
				System.out.print("*");
			}
			System.out.println();//다음줄
		}

	}

	private static void 왼쪽직각삼각형() {
		// TODO Auto-generated method stub
		System.out.print("층을 입력하세요: ");
		층=in.nextInt();
		int 행=1;
		for( int i=1;i<층;i++) {
			System.out.printf("%3d 행: ",행);
			행++;
			for(int j=0;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}
	private static void 오른쪽직각삼각형() {
		// TODO Auto-generated method stub
		System.out.print("층을 입력하세요: ");
		층=in.nextInt();
		int 행=1;
		for( int i=1;i<=층;i++) {
			System.out.printf("%3d 행: ",행);
			행++;
			for(int j=0;j<층-(i);j++)//i: 1부터 시작해야 함.
			{
				System.out.print(" ");
			}
			for(int j=0;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	private static void 트리() {
		// TODO Auto-generated method stub
		정삼각형_트리();
		네모_트리(star_value);
	}

}
