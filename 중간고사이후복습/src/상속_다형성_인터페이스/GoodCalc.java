package 상속_다형성_인터페이스;

public class GoodCalc {
	public int add(int a,int b) {
		return a+b;
	}
	public int subtract (int a,int b) {
		if(a>b)
			return a-b;
		if(b>a)
			return b-a;
		return 0;//그 이외의 경우는 둘이 같은거니까->그럼 빼면 0
		//하여튼 중요한거는 if문 안 걸릴 때에 리턴하는 값이 정의되어야 함.
	}
	public double average(int[] a) {
		double sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}//배열을 받았으니까 인덱스를 통해 연산해야함.
		
		return sum/a.length;
	}
}
