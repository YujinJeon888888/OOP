package Generic_Collection;

public class MyDiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// !!사용할 때!! 무슨타입할지 정함
		MyDice<String> mydice_color=new MyDice<String>();//컬러다이스
		MyDice<Integer> mydice_number=new MyDice<Integer>();//숫자다이스
		MyDice<Double> d3=new MyDice<Double>();
		//원래는 두개의 클래스로 만들어야 함.
		mydice_color.result="빨간색";
		mydice_number.result=3;
		d3.result=3.2;
		
		System.out.println("색깔은 "+mydice_color.result+" 나온 숫자는 "+		mydice_number.result+" 소수는?? "+d3.result);
	}

}
