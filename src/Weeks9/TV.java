package Weeks9;
public class TV implements ������ {
	private int volume;

	//�������̵�
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
	}
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
	}
	public void set_MUTE() {
		System.out.println("TV�� ����ó���մϴ�.");
		this.set_vol(0);
	}
	public void set_vol(int vol) {
		this.volume=vol;
		System.out.println("TV�� volume�� "+vol+" �� setting�մϴ�.");
	}
	public int get_vol() {
	    	
		return this.volume;
	    }
}
