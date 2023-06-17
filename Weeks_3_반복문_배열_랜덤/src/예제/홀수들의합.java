package 예제;

public class 홀수들의합 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1;i<=10;i+=2)
		{
			sum+=i;
			System.out.print(i);//더하는 수 출력
			if(i<9)//1~9까지는
				System.out.print(" + ");//'+'출력
			else//i는 10인경우
			{
				System.out.print(" = ");
				System.out.println(sum);
			}
		}
	}

}
