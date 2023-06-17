package Chapter6;

public class B extends A {
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("B");
	}
	public void superPrint() {
		// TODO Auto-generated method stub
		super.print();
	}
	public void superPrint(A a) {
		// TODO Auto-generated method stub
		a.print();
	}
}
