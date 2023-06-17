package 테스트;

public class ovveride_test {
	public void Print() {
		System.out.println("상위클래스 입니다. ");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B t1=new B();
		ovveride_test t=t1;
		
		t.Print();//실체는 t1, 클래스 타입은 시야일 뿐
	}

}

class B extends ovveride_test {
	public void Print() {
		System.out.println("하위클래스 입니다. ");
		
	}
}
