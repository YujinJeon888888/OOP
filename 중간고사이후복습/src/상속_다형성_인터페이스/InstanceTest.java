package ���_������_�������̽�;

public class InstanceTest {

	public static void work(Person p) {
		if(p instanceof Person) System.out.println("Person: ���մϴ�.");
		if(p instanceof Student) System.out.println("Student: ���մϴ�.");
		if(p instanceof Professor) System.out.println("Professor: ���մϴ�.");
		if(p instanceof Researcher) System.out.println("Researcher: ���մϴ�.");
		System.out.println("p�� Ÿ����"+p.getClass().getSimpleName()+"�Դϴ�.");
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person a=new Student();
		Person b=new Researcher();
		Person c=new Professor();
		work(a);//����Ŭ���� Ÿ�Ե� �� �ش��.
		work(b);
		work(c);
	}

}
