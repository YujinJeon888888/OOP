package Object_String;

public class StringŬ�����޼ҵ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] ca= {'a','b','c'};
		String sssss=new String(ca);//������ ����: char[]
		System.out.println(ca);
		////////////////////////////////////////////
		String s="���̻���";
		System.out.println("charat"+s.charAt(0));
		System.out.println("codePointAt"+s.codePointAt(0));
		String SS="abcde";
		String SSS="bghij";
		System.out.println("compareTo"+SS.compareTo(SSS));
		System.out.println("concat"+s.concat("����ĥ��"));
		System.out.println("contains"+s.contains("��"));
		System.out.println("length"+s.length());
		System.out.println("replace"+s.replace("��","1"));
		String[] ss=s.split("��");
		for(String sss:ss) {
			System.out.println("split"+sss);
		}
		System.out.println("subString"+s.substring(2));
		s="        �� �� �� �� �� ";
		System.out.println("trim"+s.trim());
		s="a b C d e ";
		System.out.println("toLowerCase"+s.toLowerCase());
		System.out.println("toUpperCase"+s.toUpperCase());
	}

}
