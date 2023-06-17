package Chapter6;

public class Pizza extends Circle {
	String name;
	int size;	

	public Pizza(int size,String name) {
	
		this.size=size;
		this.name=name;
	}

	public void print() {
		System.out.println("피자의 크기: "+size+" 피자의 이름: "+name);
	}

}
