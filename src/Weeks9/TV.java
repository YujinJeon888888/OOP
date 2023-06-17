package Weeks9;
public class TV implements 리모컨 {
	private int volume;

	//오버라이드
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	public void set_MUTE() {
		System.out.println("TV를 무음처리합니다.");
		this.set_vol(0);
	}
	public void set_vol(int vol) {
		this.volume=vol;
		System.out.println("TV의 volume을 "+vol+" 로 setting합니다.");
	}
	public int get_vol() {
	    	
		return this.volume;
	    }
}
