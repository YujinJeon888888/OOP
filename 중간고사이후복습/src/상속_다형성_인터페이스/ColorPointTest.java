package 상속_다형성_인터페이스;

public class ColorPointTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p=new Point();
		p.set(1, 2);
		p.showPoint();
		System.out.println("============");
		ColorPoint cp=new ColorPoint();
		cp.set(3, 4);
		cp.setColor("보라색");
		cp.showColorPoint();
		
	}
	

}
