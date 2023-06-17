package 예제;
import java.util.Scanner;
public class 반복문_평균구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;//count는 입력된 정수의 개수. 평균을 구해야 하므로 필요함
		int sum=0;//합
		Scanner scanner=new Scanner(System.in);
		System.out.println("정수를 입력하고 마지막에 -1를 입력하세요");
		
		int n=0;
		while(n!=-1)
		{
			n=scanner.nextInt();
			sum+=n;
			count++;
		}
		//-1를 받은 후의 카운트와  sum 조정
		count--;
		sum+=1;
		
		if(count==0)
			System.out.println("입력된 수가 없습니다.");
		else
		{
			System.out.print("정수의 개수는 "+count+"개이며 ");
			System.out.println("평균은 "+(double)sum/count+"입니다.");
		}
		scanner.close();
		
	}

}
