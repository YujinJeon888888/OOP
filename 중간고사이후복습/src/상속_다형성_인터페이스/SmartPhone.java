package ���_������_�������̽�;
public class SmartPhone extends PDA implements MP3Interface, MobilePhoneInterface {
	//MobilePhoneInterface�� �߻�޼ҵ� ����
	//�������̵�
	public void sendCall() {
		System.out.println("������������");
	}
	public void receiveCall() {
		System.out.println("��ȭ �Ծ��");
	}
	public void sendSMS() {
		System.out.println("���ڰ��ϴ�");
	}
	public void receiveSMS() {
		System.out.println("���ڿԾ��");
	}
	public void play() {
		System.out.println("���� �����մϴ�");
	}
	public void stop() {
		System.out.println("���� �ߴ��մϴ�.");
	}
	//�߰��ۼ� �޼ҵ�
	public void schedule() {
		System.out.println("���� �����մϴ�.");
	}
}
