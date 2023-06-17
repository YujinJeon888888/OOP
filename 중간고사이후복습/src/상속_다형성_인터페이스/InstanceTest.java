package 상속_다형성_인터페이스;

public class InstanceTest {

	public static void work(Person p) {
		if(p instanceof Person) System.out.println("Person: 일합니다.");
		if(p instanceof Student) System.out.println("Student: 일합니다.");
		if(p instanceof Professor) System.out.println("Professor: 일합니다.");
		if(p instanceof Researcher) System.out.println("Researcher: 일합니다.");
		System.out.println("p의 타입은"+p.getClass().getSimpleName()+"입니다.");
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person a=new Student();
		Person b=new Researcher();
		Person c=new Professor();
		work(a);//상위클래스 타입도 다 해당됨.
		work(b);
		work(c);
	}

}
