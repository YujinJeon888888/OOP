package String클래스조사및사용;

import java.util.Scanner;

public class Main {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("문자열을 입력하세요: ");
		String s = new String(in.nextLine());
		메뉴(s);
	}

	private static void 메뉴(String s) {
		// TODO Auto-generated method stub
		int num;
		while (true) {
			System.out.println("======================================================================");
			System.out.println("1. 단어로 분리 2. 단어의 인덱스 찾기 3. 인덱스부터 출력 4. 문자 변경 5. 문자 포함하는지 찾기 0. 종료");
			System.out.println("======================================================================");
			System.out.print("번호를 입력하세요: ");
			num = in.nextInt();

			if (num == 1) {
				
				String[] tokens = s.split(" ");// 띄어쓰기 기준으로 떼어낸 거를 String 배열에 집어넣음
				for (String token : tokens) {// token에 tokens넣고 출력 넣고 출력 넣고 출력..
					System.out.println(token);
				}
			}
			if (num == 2) {
				System.out.println("찾고 싶은 단어를 입력하세요");
				in.nextLine();
				String ss = in.nextLine();
				int index = s.indexOf(ss);// index를 출력할거니까 index에 담음

				if (index == -1)// The indexOf() method returns the first index at which a given element can be
					// found in the array, or -1 if it is not present.//0도 인덱스여서 그런듯
					System.out.println(ss + "이 없습니다. ");
				else
					System.out.println(ss + "의 위치: " + index);
			}
			if (num == 3) {
				System.out.print("무슨 인덱스부터 출력할지 적으세요: ");
				int n = in.nextInt();
				String sub_s = s.substring(n);// 인덱스부터 잘린 문자열 출력하려면 그걸 담아놔야함
				System.out.println("인덱스 " + n + "부터 시작하는 문자열은 " + sub_s + " 입니다.");
			}
			if (num == 4) {

				String from_c;//CharSequence는 String임. 
				String to_c; 
				System.out.print("무슨 문자를 변경할지 입력하세요: ");
				in.nextLine();
				from_c=in.nextLine();

				System.out.print("무슨 문자로 변경할지 입력하세요: ");

				to_c=in.nextLine();

				String a = s.replaceAll(from_c, to_c);
				System.out.println(a);

			}
			if (num == 5) {
				System.out.print("무슨 문자를 포함하는지 찾고 싶습니까?: ");
				in.nextLine();
				String ss = in.nextLine();
				if (s.contains(ss)) {
					System.out.println("포함하네요");
				} else
					System.out.println("포함 안 하네요");
			}
			if (num == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}

	}

}
