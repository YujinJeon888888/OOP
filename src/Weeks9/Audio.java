package Weeks9;
public class Audio implements 리모컨 {
	private int volume;
	
	//오버라이드
	
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}
	public void set_vol(int vol) {
		this.volume=vol;
		System.out.println("Audio의 volume을 "+vol+" 로 setting합니다.");
	}
	public int get_vol() {
		return this.volume;
	    }
}
