package 상속_다형성_인터페이스;

public class ColorPoint extends Point{
	private String color;
	public void setColor(String color) {
		this.color=color;
	}
	public void showColorPoint() {
		System.out.print(color);
		super.showPoint();//호출
	}
}
