package Weeks9;
public class Car implements 리모컨 {
	public void turnOff() {
		this.시동끄기();
	}
	public void turnOn() {
		this.시동켜기();
	}
	public void 시동켜기() {
		System.out.println("시동을 킵니다.");
	}
	public void 시동끄기() {
		System.out.println("시동을 끕니다.");
	}
	public void move() {
		
	}
	public void set_vol(int vol) {
	
	}
}
