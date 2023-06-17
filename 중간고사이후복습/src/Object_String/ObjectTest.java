package Object_String;
	
public class ObjectTest {
	
	public static void print(Object obj) {
		System.out.println(obj.getClass().getName());//클래스 이름
		System.out.println(obj.hashCode());//해시코드값(주소값)
		System.out.println(obj.toString());//객체 정보를 문자열로 만들어 출력
		System.out.println(obj);//객체 출력(toString과 같음. 자동변환됨)
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p=new Point(2,3);
		print(p);
	}

}
