package 상속_다형성_인터페이스;
public class SmartPhone extends PDA implements MP3Interface, MobilePhoneInterface {
	//MobilePhoneInterface의 추상메소드 구현
	//오버라이드
	public void sendCall() {
		System.out.println("따르르르르릉");
	}
	public void receiveCall() {
		System.out.println("전화 왔어용");
	}
	public void sendSMS() {
		System.out.println("문자갑니다");
	}
	public void receiveSMS() {
		System.out.println("문자왔어요");
	}
	public void play() {
		System.out.println("음악 연주합니다");
	}
	public void stop() {
		System.out.println("음악 중단합니다.");
	}
	//추가작성 메소드
	public void schedule() {
		System.out.println("일정 관리합니다.");
	}
}
