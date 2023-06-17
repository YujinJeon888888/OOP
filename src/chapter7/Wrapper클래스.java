package chapter7;

public class Wrapper클래스 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//값을 저장하고 꺼내기
		Integer obj1=new Integer(100);
		int value1=obj1.intValue();
		
		Double obj2=new Double(100);
		double value2=obj1.doubleValue();
		//기초 자료형을 문자열로 변환
		String s1=Integer.toString(10);
		String s2=Float.toString(3.14f);//상수니까 f로 넣기
		String s3=Double.toString(3.133);
		
		
		//문자열을 기초 자료형으로 변환
		int i=Integer.parseInt("10");
		long l=Long.parseLong("1222222220");
		float f=Float.parseFloat("3.14");
		double d=Double.parseDouble("1.2222222222222220");
	}

}
