package 상속_다형성_인터페이스;

public class Point {
	private int x,y;
	public void set(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public void showPoint() {
		System.out.println("("+x+","+y+")");
	}
	
}
