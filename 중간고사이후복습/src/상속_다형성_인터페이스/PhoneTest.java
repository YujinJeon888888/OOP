package ���_������_�������̽�;

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
		System.out.println("3�� 5�� ���ϸ�"+s.claculate(3, 5));
		s.schedule();
	}

}
