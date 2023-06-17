package 상속_다형성_인터페이스;

public class EwhaPhone implements PhoneInterface {
	//PhoneInterface의 모든 메소드 구현-오버라이딩
	public void sendCall() {
		System.out.println("띠리리리링");
	}
	public void receiveCall() {
		System.out.println("전화가 왔습니다.");
	}
	//메소드 추가작성
	public void flash() {
		System.out.println("전화기에 불이 켜졌습니다.");
	}
}
