package Object_String;

public class WrapperQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�빮�ڸ� �ҹ��ڷ� ��ȯ"+Character.toLowerCase('A'));//�빮�ڸ� �ҹ��ڷ� ��ȯ
		char c1='4',c2='F';
		if(Character.isDigit(c1))	System.out.println(c1+"�� ����");//���ϰ�: boolean
		if(Character.isAlphabetic(c2)) System.out.println(c2+"�� ���ĺ�");
		
		System.out.println("���ڿ� -123�� 10������ ��ȯ"+Integer.parseInt("-123"));
		System.out.println("���� 28�� 16���� ���ڿ��� ��ȯ"+Integer.toHexString(28));
		System.out.println("28�� 2���� ���ڿ��� ��ȯ"+Integer.toBinaryString(28));
		System.out.println("28�� ���� 2������ 1�� ����"+Integer.bitCount(28));//���� ��Ʈ�� ���� üũ
		
		Double d=Double.valueOf(3.14);
		System.out.println("Double�� ���ڿ� "+d.toString()+"�� ��ȯ");
		System.out.println("���ڿ��� �Ǽ� "+Double.parseDouble("3.14")+"�� ��ȯ");
		
		boolean b=(4>3);//b�� true
		System.out.println("true�� ���ڿ� "+Boolean.toString(b)+"�� ��ȯ");
		System.out.println("���ڿ��� false�� ��ȯ: "+Boolean.parseBoolean("false"));
	}

}
