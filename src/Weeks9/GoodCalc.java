package Weeks9;

public class GoodCalc extends Calculator {
	//오버라이드
	public int add(int a,int b)//추상메소드 구현
	{
		return a+b;
	}

	public int subtract(int a,int b) {
		return a+b;
	}
	
	public double average(int[]a) {
		double sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		return sum/a.length;
	}
}
