package Object_String;

public class Wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//�̸��� Wrapper�� Ŭ������ �������� ������, �⺻ Ÿ���� ���� ��ü�� �ٷ� �� �ֵ��� ������
		//�� WrapperŬ�������� ���� ��ɵ��� �ۼ��Ǿ� ����
		//Integer., Byte. ���� Ȯ���غ���
		
		//�⺻Ÿ�� ������ Wrapper ��ü ����
		Integer i=Integer.valueOf(10);
		Character c=Character.valueOf('c');
		Double d=Double.valueOf(3.14);
		Boolean b=Boolean.valueOf(true);
		
		//���ڿ��� Wrapper ��ü ����
		Integer I=Integer.valueOf("10");
		Double D=Double.valueOf("3.14");
		Boolean B=Boolean.valueOf("true");
		
		//Float��ü�� doubleŸ���� ������ ���� ����??
		Float f=Float.valueOf(3.14f); 
		
		//Wrapper ��ü���� ���� �����ϸ�, ���� �޼ҵ尡 staticŸ��
		//Integer Ŭ������ �ֿ� �޼ҵ��
		Integer.bitCount(44);
		Integer.parseInt("10");//parse:�ؼ� . ���ڿ��� ��Ʈ�� �ؼ�
		Integer.parseInt("50", 8);//8������
		Integer.toBinaryString(50);//���� i��(����) ������ ǥ������ ��ȯ�� ���ڿ�(���ϰ�) ���� 
		Integer.toHexString(40);//���� i��(����) 16���� ǥ������ ��ȯ�� ���ڿ�(���ϰ�) ���� 
		Integer.toOctalString(40);//���� i��(����) 8���� ǥ������ ��ȯ�� ���ڿ�(���ϰ�) ����
		Integer.toString(40);//���� i�� ���ڿ��� ��ȯ�Ͽ� ����
		Integer.valueOf(50);//���� i�� ���� Integer��ü ����
		Integer.valueOf("55");//���ڿ� s�� ������ ��ȯ�Ͽ� ��� �ִ� Integer��ü ����
		
		//�ν��Ͻ� �޼ҵ�
		i.floatValue();
		i.longValue();
		i.intValue();
		i.shortValue();
		
		
		//Wrapper Ȱ��
		Integer a=Integer.valueOf(10);//���۷���
		int aa=a.intValue();//������: int->10�� ���//�ܼ�����
		
		Character C=Character.valueOf('c');
		char CC=C.charValue();//CC='c'
		
		//���ڿ��� �⺻ ������ Ÿ������ ��ȯ
		int ii=Integer.parseInt("123");//���ڿ��� ���ڷ� ��ȯ(������: int��)
		//parse:�ؼ��ϴ�
		
		//�⺻ Ÿ���� ���ڿ��� ��ȯ
		String s1=Integer.toString(40);
		
		
	}

}
