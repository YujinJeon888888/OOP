package Weeks9;

public class ColorPoint_2 extends Point_2 {
	private String color;
	
	public ColorPoint_2() {
		super();//상위클래스의 기본 생성자 호출
		System.out.println("ColorPoint를 만드는 기본 생성자");
		
	}
	public ColorPoint_2(int x,int y,String color) {
		super(x,y);//상위클래스의 인자 있는 생성자 호출
		this.color=color;
		System.out.println("색깔은 "+color);
	}
}
