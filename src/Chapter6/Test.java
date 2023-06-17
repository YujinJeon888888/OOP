package Chapter6;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj=new B();
		obj.print();
		
		A obj2=new B();
		A obj3=new A();
		obj2.print();
		obj.superPrint();
		obj.superPrint(obj3);
	}

}
