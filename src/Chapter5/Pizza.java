package Chapter5;

public class Pizza {
	private String toppings;
	private int radius;
	static int count=0;//정적변수 선언
	
	public Pizza(String toppings) {
		this.toppings=toppings;
		count++;
	}

}
