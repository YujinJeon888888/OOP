package Object_String;

public class EqualsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		Point a=new Point(2,3);
		Point b=new Point(2,3);
		Point c=new Point(3,4);
		
		if(a==b) {
			System.out.println("a==b");
		}
		if(a.equals(b)) System.out.println("a�� b�� equals��");
		if(a.equals(c)) System.out.println("a�� c�� equals��");
	}*/
	
		Rect a=new Rect(2,3);
		Rect b=new Rect(3,2);
		Rect c=new Rect(3,4);
		if(a.equals(b)) System.out.println("a�� b�� ���� equals��");
		if(a.equals(c)) System.out.println("a�� c�� ���� equals��");
		if(b.equals(c)) System.out.println("b�� c�� ���� equals��");
}
	}
