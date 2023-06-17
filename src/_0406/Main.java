package _0406;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//공간 만들고, 참조.
		A aa=new A();
		B bb=new B();
		C cc=new C();
		
		//객체 메소드 접근
		aa.show_A();//A
		bb.show_B();//A,B
		cc.show_C();//A,B,C
		//상속. 그러나 메소드 수정, 변형해서 사용가능.
	}

}
