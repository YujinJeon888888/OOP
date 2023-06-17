package Weeks10;

public class EqualsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point a=new Point(2,3);
		Point b=new Point(2,3);
		Point c=new Point(3,4);
		
		if(a==b) System.out.println("a==b");//false. 레퍼런스를 비교하기때문
		if(a.equals(b)) System.out.println("a 는 b 와 같음");
		if(a.equals(c)) System.out.println("a 는 c 와 같음");
		////////////////////////////////
		
		Rect A=new Rect(2,3);
		Rect B=new Rect(3,2);
		Rect C=new Rect(3,4);
		
		if(a.equals(b)) System.out.println("a는 b와 같다");
		if(a.equals(c)) System.out.println("a는 c와 같다");
		if(b.equals(c)) System.out.println("b는 c와 같다");
	}

}
