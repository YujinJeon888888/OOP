package 상속_다형성_인터페이스;

public class PhoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EwhaPhone phone=new EwhaPhone();
		phone.printLogo();
		phone.sendCall();
		phone.receiveCall();
		phone.flash();
		
		
		System.out.println("================");
		SmartPhone s=new SmartPhone();
		s.printLogo();
		s.sendCall();
		s.play();
		System.out.println("3과 5를 더하면"+s.claculate(3, 5));
		s.schedule();
	}

}
