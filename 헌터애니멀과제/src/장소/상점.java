package 장소;
import java.util.Scanner;

import Main.사냥꾼;


public class 상점 {//추가. 상점은 동물과 관련 없으므로 상속x
	private static 상점 instance=null;
	
	private 상점() {
	}

	public static 상점 getInstance() {
		if(instance==null)
			instance=new 상점();//상점 객체 없으면 만듬

		return instance;//상점객체 리턴
	}

	private static int 번호;

	static Scanner in=new Scanner(System.in);
	public static void 메뉴(사냥꾼 hunter) {
		환영메세지();
		while(true) {
				메인메뉴();
			번호=in.nextInt();
			if(번호==1) {	
				모자메뉴();
				번호=in.nextInt();
				if(번호==1) {
					if(hunter.get돈주머니()>=20000)
					{
						구매메세지();
						hunter.모자="풀잎모자";
						hunter.set은신력(10);
					}
					else
					{
						돈부족메세지();
					}

				}
				if(번호==2) {
					if(hunter.get돈주머니()>=150000)
					{
						구매메세지();
						hunter.모자="가죽모자";
						hunter.set은신력(30);
					}
					else
					{
						돈부족메세지();
					}
				}
				if(번호==3) {
					if(hunter.get돈주머니()>=400000)
					{
						구매메세지();
						hunter.모자="철 모자";
						hunter.set은신력(60);
					}
					else
					{
						돈부족메세지();
					}
				}
				if(번호==0)
					continue;
			
			}

			else if(번호==2) {
				갑옷메뉴();
				번호=in.nextInt();
				if(번호==1) {
					if(hunter.get돈주머니()>=20000)
					{
						구매메세지();
						hunter.갑옷="풀입갑옷";
						hunter.set방어력(10);
					}
					else
					{
						돈부족메세지();
					}
				}
				if(번호==2) {
					if(hunter.get돈주머니()>=150000)
					{
						구매메세지();
						hunter.갑옷="가죽갑옷";
						hunter.set방어력(30);
					}
					else
					{
						돈부족메세지();
					}
				}
				if(번호==3) {
					if(hunter.get돈주머니()>=400000) {
						구매메세지();
						hunter.갑옷="철 갑옷";
						hunter.set방어력(60);
					}
					else
					{
						돈부족메세지();
					}
				}
				if(번호==0)
					continue;
			
			}
			else if(번호==0)
				break;
			else
				System.out.println("그런 메뉴는 없습니다.");
			continue;
		}
	}


	private static void 갑옷메뉴() {
		// TODO Auto-generated method stub
		System.out.println("=================================================");
		System.out.println("     1. 풀잎갑옷 2. 가죽갑옷 3. 철 갑옷 0. 메뉴로 돌아가기");
		System.out.println("가격:    2만원           15만원       40만원");
		System.out.println("기능:  방어력+10     방어력+30    방어력+60");
		System.out.println("=================================================");
	}

	private static void 모자메뉴() {
		// TODO Auto-generated method stub
		System.out.println("=================================================");
		System.out.println("     1. 풀잎모자 2. 가죽모자 3. 철 모자 0. 메뉴로 돌아가기");
		System.out.println("가격:    2만원           15만원       40만원");
		System.out.println("기능:   은신+10        은신+30     은신+60");
		System.out.println("=================================================");
	}

	private static void 메인메뉴() {
		// TODO Auto-generated method stub
		System.out.println("================================");
		System.out.println("     1. 모자 2. 갑옷 0. 나가기");
		System.out.println("================================");
	}

	private static void 구매메세지() {
		System.out.println("구매해주셔서 감사합니다 *^^*");
	}
	private static void 환영메세지() {
		System.out.println("================================");
		System.out.println("  *^^*어서오세요 기쁨상점입니다*^^*");
		System.out.println("================================");
	}
	private static void 돈부족메세지() {
		System.out.println("돈이 부족해요 ㅠ_ㅠ");
	}

}
