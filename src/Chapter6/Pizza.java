package Chapter6;

public class Pizza extends Circle {
	String name;
	int size;	

	public Pizza(int size,String name) {
	
		this.size=size;
		this.name=name;
	}

	public void print() {
		System.out.println("������ ũ��: "+size+" ������ �̸�: "+name);
	}

}
