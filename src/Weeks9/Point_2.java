package Weeks9;

public class Point_2 {
	private int x;
	private int y;
	
	public Point_2() {//생성자
		System.out.println("Point를 만드는 기본 생성자");
	}
	public Point_2(int x,int y) {
		this.x=x;
		this.y=y;
		System.out.printf("(%d, %d)의 좌표 생성\n",this.x,this.y);
		
	}
}
