package chapter7;

public class WrapperŬ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���� �����ϰ� ������
		Integer obj1=new Integer(100);
		int value1=obj1.intValue();
		
		Double obj2=new Double(100);
		double value2=obj1.doubleValue();
		//���� �ڷ����� ���ڿ��� ��ȯ
		String s1=Integer.toString(10);
		String s2=Float.toString(3.14f);//����ϱ� f�� �ֱ�
		String s3=Double.toString(3.133);
		
		
		//���ڿ��� ���� �ڷ������� ��ȯ
		int i=Integer.parseInt("10");
		long l=Long.parseLong("1222222220");
		float f=Float.parseFloat("3.14");
		double d=Double.parseDouble("1.2222222222222220");
	}

}
