package ���_������_�������̽�;

public class EwhaPhone implements PhoneInterface {
	//PhoneInterface�� ��� �޼ҵ� ����-�������̵�
	public void sendCall() {
		System.out.println("�츮������");
	}
	public void receiveCall() {
		System.out.println("��ȭ�� �Խ��ϴ�.");
	}
	//�޼ҵ� �߰��ۼ�
	public void flash() {
		System.out.println("��ȭ�⿡ ���� �������ϴ�.");
	}
}
