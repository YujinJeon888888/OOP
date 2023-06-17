package Object_String;

public class Rect {
	int width;
	int height;
	
	public Rect(int width,int height) {
		this.height=height;
		this.width=width;
	}
	public boolean equals(Object obj) {//상위클래스를 매개변수로
		Rect p=(Rect)obj;//강제적형변환
		if(this.width*this.height==p.width*p.height) {//주소가 아니라 내용물 비교
			return true;
		}
		else
			return false;
	}
}
