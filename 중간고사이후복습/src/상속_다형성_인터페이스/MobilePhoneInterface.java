package 상속_다형성_인터페이스;

public interface MobilePhoneInterface extends PhoneInterface {
	void sendSMS();//public 전제되어있으니까
	void receiveSMS();
}
