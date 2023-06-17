package Object_String;

public class String클래스메소드 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] ca= {'a','b','c'};
		String sssss=new String(ca);//생성자 인자: char[]
		System.out.println(ca);
		////////////////////////////////////////////
		String s="일이삼사오";
		System.out.println("charat"+s.charAt(0));
		System.out.println("codePointAt"+s.codePointAt(0));
		String SS="abcde";
		String SSS="bghij";
		System.out.println("compareTo"+SS.compareTo(SSS));
		System.out.println("concat"+s.concat("오육칠팔"));
		System.out.println("contains"+s.contains("일"));
		System.out.println("length"+s.length());
		System.out.println("replace"+s.replace("일","1"));
		String[] ss=s.split("삼");
		for(String sss:ss) {
			System.out.println("split"+sss);
		}
		System.out.println("subString"+s.substring(2));
		s="        일 이 삼 사 오 ";
		System.out.println("trim"+s.trim());
		s="a b C d e ";
		System.out.println("toLowerCase"+s.toLowerCase());
		System.out.println("toUpperCase"+s.toUpperCase());
	}

}
