package Weeks9;

public interface 리모컨 {
    int MAX_VOL = 10;
    int MIN_VOL = 0;

    public void set_vol(int vol);//구현은 알아서

    public void turnOff();

    public void turnOn();

    public default int get_vol() {
    	return 0;
    }

    public default void set_MUTE() {//어떤 객체든 동일동작->default메소드로 바디가 있는 메소드 정의 가능
    	System.out.println("무음처리합니다.");
    	this.set_vol(0);
    }

}
