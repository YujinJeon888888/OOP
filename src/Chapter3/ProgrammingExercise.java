package Chapter3;
import java.util.Scanner;
public class ProgrammingExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		//1부터 100사이의 정수 중에서 3또는 4의 배수의 합을 계산
		/*
		 * int[] num=new int[100]; int sum=0; for(int i=0;i<100;i++) { num[i]=i+1;
		 * if(num[i]%3==0) { sum+=num[i]; } else if(num[i]%4==0) { sum+=num[i]; } }
		 * System.out.println(sum);
		 */
		
		
		//1부터 9까지의 숫자 영문자로 출력
		/*
		 * int[] num= {1,2,3,4,5,6,7,8,9}; String[] s=
		 * {"one","two","three","four","five","six","seven","eight","nine"};
		 * 
		 * 
		 * while(true) { System.out.print("정수를 입력하세요: "); int user=in.nextInt();
		 * in.nextLine(); if(user<1||user>9) {System.out.println("다시 입력하세요 ");
		 * continue;} if(user==num[user-1]) {System.out.println(s[user-1]); break;} }
		 */
	//	2개의 주사위를 던지는 게임이 있다고 가정하자. 2개의 주사위의 합이 6이 되는 경우는 몇 가지나 있을까? 
		//합이 6이 되는 경우의 수를 출력하는 프로그램을 작성해보자.
		/*
		 * int[] dice1= {1,2,3,4,5,6}; int[] dice2= {1,2,3,4,5,6}; for(int i=0;i<6;i++)
		 * { for(int j=0;j<6;j++) { if(dice1[i]+dice2[j]==6)
		 * System.out.println(dice1[i]+"+"+dice2[j]); } }
		 */
	
		//4. 사용자로부터 키를 입력받아 표준 체중을 계산한 후에 사용자의 체중과 비교하여 저체중인지, 표준인지,
		//과체중인지 판단하는 프로그램을 작성하라. 표준 체중 계산식은 다음을 사용하라.
		/*
		 * System.out.print("키를 입력하세요: "); double 키=in.nextDouble();
		 * System.out.print("몸무게를 입력하세요: "); double 몸무게=in.nextDouble(); double
		 * 표준체중=(키-100)*0.9; if(몸무게>표준체중) System.out.println("과체중"); else if(몸무게==표준체중)
		 * System.out.println("정상체중"); else System.out.println("저체중");
		 */
		
		//5. 1차 방정식 3x+10y=100을 만족하는 모든 해를 구하는 프로그램을 작성해 보자. 여기서 
		//x와 y는 정수이고 0<=x<=10, 0<=y<=10 이라고 가정하자.
		/*
		 * int[] x=new int[11]; int[] y=new int[11]; for(int i=0;i<=10;i++) { x[i]= i;
		 * for(int j=0;j<=10;j++) { y[i]= j; if(3*x[i]+10*y[i]==100) {
		 * System.out.println("("+x[i]+","+y[i]+")" ); } } }
		 */
		//6. 2와 100 사이에 있는 모든 소수를 찾는 프로그램을 작성하라. 주어진 정수 k를 
		//2부터 k-1까지의 숫자로 나누어서 나머지가 0인 것이 하나라도 있으면 소수가 아니다.(소수:1과 자신을 제외하고 나눌 수 있는 수가 없는 것)
		int k;
		int num=0;
		for(k=2;k<100;k++)
		{	
			for(int i=1;i<k;i++)
			{		
				if(i!=1)
				{
					if(k%i==0)
						{
						num=0;
						break;//break없으면 0으로 나누어떨어지는 수가 있더라도 ++하고나면 초기화됨->결국 k-1만큼의 숫자로 나눈 것만 계산됨.
						}
					else
						num=1;
				}
			}
			if(num==1)
				System.out.println(k);
		}
		
	}
}
