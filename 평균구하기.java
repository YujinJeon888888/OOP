package Week4;

import java.util.*;
public class 평균구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int a=0,sum=0,count=0;
		while(true) {
			a=in.nextInt();
			if(a==-1)
				break;
			sum+=a;
			count++;
		}
		if(count==0)
			System.out.println("입력된 수 없음");
		else
		{
			System.out.println("지금까지 입력된 정수의 개수는 "+count +"개이며 ");
			System.out.println("평균은 "+(double)sum/count+"입니다");
		}

	}

}
