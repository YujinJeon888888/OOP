import java.util.Scanner;//스캐너넣음

public class Main {
	public static void main(String[]args) {
		
		Scanner input=new Scanner(System.in);
		
		//학번,나이,이름,키, 좋아하는 음식, 논리값
		
		String 학번;
		int age;
		String 이름=null;
		double 키;
		String food;
		boolean b;
		while(true)
		{//출력용 안내문자
		System.out.println("학번을 입력하세요: ");
		학번=input.nextLine();
		System.out.println("나이를 입력하세요: ");
		age=input.nextInt();//엔터 남아있음->이름 자동입력
	
		input.nextLine();//남아있는 엔터먹어가기
	
		System.out.println("이름을 입력하세요: ");
		이름=input.nextLine();
		
		System.out.println("키를 입력하세요: ");
		키=input.nextDouble();		
		
		input.nextLine();//남아있는 엔터먹어가기.
		
		System.out.println("좋아하는 음식을 입력하세요: ");
		food=input.nextLine();
		
		System.out.println("입력한 내용이 모두 사실인가요?: ");
		b=input.nextBoolean();		
		input.nextLine();//남아있는 엔터먹어가기.
		
		//저장된 값 확인
		System.out.println("안녕하세요.저는"+학번+"학번이고 이름은"+이름+"입니다.");
		System.out.println("나이는"+age+"입니다.");
		
		System.out.println("키는"+키+"이고");
		System.out.println("좋아하는 음식은"+food+"입니다.");
		System.out.println("결과: "+b);
		if(b==true) break;
		}
		
		//보기좋게출력하기
	    System.out.println("★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");        
        System.out.println("안녕하세요! 저는 " + 학번 +"학번,"  + age + "살 " + 이름 +"이라고 합니다.");
        System.out.println("좋아하는 음식은 " + food +"이고 키는"+키+"입니다.");        
        System.out.println("★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");
        System.out.println("입력한 정보는 모두 " + b +"입니다.~!!");        
	}
}
