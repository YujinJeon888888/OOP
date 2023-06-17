package Weeks10;

public class Point {
	int x,y;
	public Point(int x,int y) {
		this.x=x;
		this.y=y;
		
	}
	public String toString() {
		return "Point("+x+","+y+")";//Point객체를 문자열로 리턴하는 toString() 오버라이딩
	}
	public boolean equals(Object obj) {
		Point p=(Point)obj;//강제형변환
		if(x==p.x&&y==p.y)return true;
		else return false;
	}
	
}
