package Weeks10;

public class EqualsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point a=new Point(2,3);
		Point b=new Point(2,3);
		Point c=new Point(3,4);
		
		if(a==b) System.out.println("a==b");//false. ���۷����� ���ϱ⶧��
		if(a.equals(b)) System.out.println("a �� b �� ����");
		if(a.equals(c)) System.out.println("a �� c �� ����");
		////////////////////////////////
		
		Rect A=new Rect(2,3);
		Rect B=new Rect(3,2);
		Rect C=new Rect(3,4);
		
		if(a.equals(b)) System.out.println("a�� b�� ����");
		if(a.equals(c)) System.out.println("a�� c�� ����");
		if(b.equals(c)) System.out.println("b�� c�� ����");
	}

}
