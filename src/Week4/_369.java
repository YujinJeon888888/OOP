package Week4;

public class _369 {

	public static void main(String args[]) {



		int num=0;



		while(num<100){

			int n=num;

			int flag=0;    

			//많은 비교문 대신 반복문을 사용한다.

			while(n>0){



				if(n%10 ==3 || n%10==6 || n%10==9 )  {

					System.out.print("짝");

					flag+=1;  // 일의자리가 3의 배수였음을 표시.

				} 

				n/=10; //n을 10으로 나누어가며 십의 자리수를 비교한다.



			}

			//한번이라도 나누어진 적이 없으면 숫자를 출력

			if(flag ==0) System.out.printf("%4d", num);

			else System.out.print("!");



			//한 줄에 10개씩 출력

			if(num%10==0 ) System.out.println();

			else System.out.print("  ");



			num++;

		}





	}
}
