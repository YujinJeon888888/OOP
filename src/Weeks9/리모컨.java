package Weeks9;

public interface ������ {
    int MAX_VOL = 10;
    int MIN_VOL = 0;

    public void set_vol(int vol);//������ �˾Ƽ�

    public void turnOff();

    public void turnOn();

    public default int get_vol() {
    	return 0;
    }

    public default void set_MUTE() {//� ��ü�� ���ϵ���->default�޼ҵ�� �ٵ� �ִ� �޼ҵ� ���� ����
    	System.out.println("����ó���մϴ�.");
    	this.set_vol(0);
    }

}
