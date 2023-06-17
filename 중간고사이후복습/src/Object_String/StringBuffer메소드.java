package Object_String;

public class StringBuffer메소드 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("This");//가변 스트링.
		
		//문자열 덧붙이기
		sb.append(" is Pencil");
		System.out.println(sb);
		
		//"my"문자열 삽입
		sb.insert(7," my");
		System.out.println(sb);
		
		//my를 your로 변경
		sb.replace(8, 10, "your");//8에서 10까지를 your로 바꾸기
		System.out.println(sb);
		
		//your삭제: 위치 8부터 13전까지 삭제
		sb.delete(8, 13);
		System.out.println(sb);
		
		//스트링 버퍼 내 문자열 길이 수정
		sb.setLength(4);
		System.out.println(sb);
		
		//스트링 버터의 현재 크기 리턴
		System.out.println(sb.capacity());
		
		//스트링버터의 문자들을 반대 순서로 변경
		System.out.println(sb.reverse());
	}

}
