package ���_������_�������̽�;

public interface PhoneInterface {
	public final int TIMEOUT=10000;//����ʵ弱��
	public void sendCall();
	public void receiveCall();
	public default void printLogo() {
		System.out.println("** Phone **");
	}
}
