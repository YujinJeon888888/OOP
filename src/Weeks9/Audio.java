package Weeks9;
public class Audio implements ������ {
	private int volume;
	
	//�������̵�
	
	public void turnOff() {
		System.out.println("Audio�� ���ϴ�.");
	}
	public void turnOn() {
		System.out.println("Audio�� �մϴ�.");
	}
	public void set_vol(int vol) {
		this.volume=vol;
		System.out.println("Audio�� volume�� "+vol+" �� setting�մϴ�.");
	}
	public int get_vol() {
		return this.volume;
	    }
}
