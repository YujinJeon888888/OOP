package 예제;

public class AccessEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample aClass=new Sample();
		aClass.a=10;
		aClass.b=10;//b는 private로 선언이 되었으므로 AccessEx 클래스에서 접근 불가능
		aClass.c=10;
	}	

}
