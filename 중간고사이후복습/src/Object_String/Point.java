package Object_String;

public class Point {

	//	//원래 메소드
//	public String toString() {//객체이름과 해시코드
//		return getClass().getName()+"@"+Integer.toHexString(hashCode());
//	}//오버라이딩가능함.
//	
	//당연히 Point클래스가 Object를 상속하니까 여기서 오버라이딩.
	//(Main에서 Point클래스의 메소드 호출할거니까.)
	public String toString() {//객체이름과 해시코드
		return "Point클래스예용";
	}//오버라이딩가능함.
	
	int x,y;
	public Point(int x,int y) {
	this.x=x;
	this.y=y;
	}
	
	public boolean equals(Object obj) {
		Point p=(Point)obj;//강제적형변환. 이거는 강제적형변환
		//Point pp=new Object(); 이거랑은 다른것임.(상위객체를 하위시야로 연결시키려 하는거니까)
		
		if(x==p.x&&y==p.y) {
			return true;
		}
		else
			return false;
	}
}
