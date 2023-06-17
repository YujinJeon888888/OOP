package Generic_Collection;

public class Box<T> {//T타입만 받을거임.
	//클래스의 타입을 정하는 거니까 클래스 옆에 <>로 알림
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	public static void main(String[]args) {
		Box<String> box=new Box<String> ();
		box.setT("dd");
		//box.setT(dad);//컴파일 오류남(컴파일 에러 잡을 수 있다)
		String str=box.getT();
		//int i=box.getT();//오류남
		
		Box<Integer> d=new Box<Integer>();
		d.setT(6);
		int value=d.getT();//오토 언박싱
		
		//중~~~~~~~~~~~요!
		//제너릭 사용하는 이유
		//타입 미스캐스팅 방지할 수 있음
		//실행 시 런타임-타입 에러 나는 것 방지
		//컴파일 시에 미리 타입을 강하게 체크하여 에러를 발생시킴(실행에러로 잡으면 불편한데 컴파일 에러로 미리 알면 편하니까)
	
	}
}
