package ����;
//��Ʈ�� ����� ��Ʈ ����Ʈ ����
public class ����2_9 {
	public static void main(String[]args) {
	short a=0x0011;//16����
	short b=0x1110;
	
	System.out.println("[��Ʈ������]");
	System.out.printf("%04x\n",(a&b));//��Ʈ and. 16���� 4�ڸ��� ����
	System.out.printf("%04x\n",(a|b));//��Ʈ or
	System.out.printf("%04x\n",(a^b));//��Ʈ xor. ������ 0 �ٸ��� 1. 1101
	System.out.printf("%04x\n",(short)(~a));//not a. ��Ʈ not->��Ʈ����.	
	
	byte c=20;
	byte d=-8;
	
	//��Ʈ ����Ʈ ����
	System.out.println("[����Ʈ������]");
	System.out.println(c<<2);//c�� 2��Ʈ ���� ����Ʈ. 0001 0100->0101 0000
	System.out.println(c>>2);
	System.out.println(d>>2);
	System.out.printf("%x\n",(d>>>2));//d�� 2��Ʈ ������ ����Ʈ. 0����(���)
	
	} 
}
