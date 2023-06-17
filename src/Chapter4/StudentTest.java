package Chapter4;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student 유진=new Student();//유진: 참조변수, new Student(): 객체. 참조변수는 화살표만 담는다는 것을 기억하자!
		유진.setStudent(21,"전유진", 2116020);
		System.out.println(유진.get나이()+유진.get이름()+유진.get학번());
	}

}
