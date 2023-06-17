package Weeks10;

public class Rect {
	int width,height;
	public Rect(int width,int height) {
		this.width=width;
		this.height=height;
	}
	public boolean equals(Object obj) {
		Rect r=(Rect)obj;//강제형변환
		if(width*height==r.height*r.width)return true;
		else return false;
	}
}
