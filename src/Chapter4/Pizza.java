package Chapter4;

public class Pizza {
	int size;
	String type;

	public Pizza() {//매개변수가 없는 생성자
	
	}
	public Pizza(int s,String t)
	{
		size=s;
		type=t;
	}
	
	public static void main(String[]args) {
		Pizza obj1=new Pizza();//매개변수가 없는 생성자
		System.out.println("("+obj1.type+","+obj1.size+")");
		Pizza obj2=new Pizza(24,"포테이토");//매개변수가 있는 생성자
		System.out.println("("+obj2.type+","+obj2.size+")");
	}
}
