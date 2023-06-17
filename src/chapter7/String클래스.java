package chapter7;

public class String클래스 {
	public static void main(String[] args) {
		StringBuffer s1=new StringBuffer("Hello");	
		s1.append(" Bye");//끝에넣음
		s1.insert(0, "안냐세용 ");
		System.out.println(s1);
		//안냐세용 Hello Bye
		
		
	}
}
