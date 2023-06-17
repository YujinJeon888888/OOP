package test2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		할머니 a=new 할머니();
		엄마 b=new 엄마();
		짱구 c=new 짱구();
		
		c.열심히공부하기();
		//핸드폰 있는 상태: 공부하는척
		c.공부하기();
		
		b.핸드폰뺏기(c);
		//핸드폰뺏김->열심히 공부
		c.공부하기();
	}

}
