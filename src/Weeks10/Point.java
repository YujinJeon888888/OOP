package Weeks10;

public class Point {
	int x,y;
	public Point(int x,int y) {
		this.x=x;
		this.y=y;
		
	}
	public String toString() {
		return "Point("+x+","+y+")";//Point��ü�� ���ڿ��� �����ϴ� toString() �������̵�
	}
	public boolean equals(Object obj) {
		Point p=(Point)obj;//��������ȯ
		if(x==p.x&&y==p.y)return true;
		else return false;
	}
	
}
