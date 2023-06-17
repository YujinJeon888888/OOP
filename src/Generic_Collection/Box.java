package Generic_Collection;

import java.util.ArrayList;

public class Box<T> {//제너릭클래스
	
	private T t;
	//여러개 담고싶을 때 1. 배열
	private T[] ar;//일반배열 선언하는 건 가능한데,
	
	
	//여러개 담고싶을 때 2.
	public ArrayList <T> al;//앞으로 이렇게 쓰기
	
	public Box() {
		//ar=new T[10];//이 코드가 오류남.(우리가 알던 방법으로 생성 못 함)
		ar=(T[])new Object[10];//객체배열 만들고 형변환. 이렇게 하면 되는데 불편함.상위클래스를 하위클래스로하는것? 의미x
		al=new ArrayList();
		
	}
	
	public T get() {
		return this.t;
	}
	public void set(T t) {
		this.t=t;
	}
}

