package �׽�Ʈ;

public class ovveride_test {
	public void Print() {
		System.out.println("����Ŭ���� �Դϴ�. ");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B t1=new B();
		ovveride_test t=t1;
		
		t.Print();//��ü�� t1, Ŭ���� Ÿ���� �þ��� ��
	}

}

class B extends ovveride_test {
	public void Print() {
		System.out.println("����Ŭ���� �Դϴ�. ");
		
	}
}
