package 상속_다형성_인터페이스;

public interface PhoneInterface {
	public final int TIMEOUT=10000;//상수필드선언
	public void sendCall();
	public void receiveCall();
	public default void printLogo() {
		System.out.println("** Phone **");
	}
}
