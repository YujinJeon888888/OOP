package Weeks9;

public class PointTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//생성자의 호출순서와 실행순서를 살펴봅시다
		Point_2 p1=new Point_2(1,3);
		Point_2 p2=new ColorPoint_2(1,5,"red");
		System.out.println("==========");
		
		Point_2 p3=new Point_2();
		Point_2 p4=new ColorPoint_2();
	}

}
