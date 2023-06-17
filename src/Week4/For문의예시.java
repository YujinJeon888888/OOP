package Week4;

public class For문의예시 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//0에서 10까지 홀수 출력
		for(int i=1;i<10;i+=2) {
			System.out.println(i+" ");
		}
		System.out.println("====================");
		//1부터 2000까지 2의 n승 구하기
		for(int i=1;i<=2000;i*=2) { 
				System.out.println(i);
		}
		System.out.println("=================");	
		//0부터 100까지의 누적합 구하기
		for(int i=0,sum=0;i<=100;i++) {
			sum+=i;
			if(i==100)
			System.out.println(sum);
		}
		System.out.println("=====================");
		//100에서 0으로 거꾸로 카운트
		for(int i=100;i>=0;i--) {
			System.out.println(i);
			if(i==90)
				break;
		}
	}

}
