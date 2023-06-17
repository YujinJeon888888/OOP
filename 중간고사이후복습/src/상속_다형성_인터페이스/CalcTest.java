package 상속_다형성_인터페이스;

public class CalcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GoodCalc c=new GoodCalc();
		//Calculator c=new GoodCalc();도 가능
		
		System.out.println(c.add(2, 3));
		System.out.println(c.subtract(2, 3));
		System.out.println(c.average(new int[] {2,3,4}));//인자 넣을 때 객체 생성하는것도 가능
	}

}
