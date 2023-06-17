package 예제;
import java.util.Scanner;//스캐너넣음
public class 예제2_4 {
	public static void main(String[]args) { 
	Scanner input=new Scanner(System.in);//Scanner 변수명 new 스캐너 시스템.in
	String 학번;
	int 나이=0;
	String 이름;
	boolean isReal=true;
	String temp = "abcdefg";
		/*
								 * System.out.println("학번을 입력하세요"); 학번=input.nextInt(); input.nextLine();//엔터 먹음
								 * System.out.println("나이를 입력하세요"); 나이=input.nextInt(); input.nextLine();//엔터 먹음
								 * System.out.println("이름을 입력하세요"); 이름=input.nextLine();
								 * System.out.println("입력한게 사실입니까?");
								 */
	
	//출력
	
		/*
		 * System.out.println("안녕하세요 제 학번은"+학번+"입니다");
		 * System.out.println("안녕하세요 제 나이는"+나이+"입니다");
		 * System.out.println("안녕하세요 제 이름은"+이름+"입니다");		  
		 */		
	
	//실험
		/*
		 * System.out.printf("*************************");
		 */
		while(true) {
		System.out.println("학번: ");
		학번=input.nextLine();
		
		System.out.println("나이: ");
		나이=input.nextInt();
		
		//실험: 읽어갈 내용이 남아있는지 확인하고 엔터 전까지 읽어가도록 만든 후, 
		//변수 temp의 값을 확인하자.
		// if(input.hasNextLine()) temp=input.nextLine();
		//과연 temp에는 뭐가 들어 있을까?
	
		System.out.println("이름: ");//이름에 엔터 들어감
		이름=input.nextLine();
		
		System.out.println("입력한 정보는 진짜인가요?(true/false): ");
		isReal=input.nextBoolean();//입력 후 남은 엔터=>temp로
		
		//입력할 내용이 남아있는지 확인하고 남아있는 입력은 다 읽어갑니다.
		if(input.hasNextLine()) temp=input.nextLine();
		System.out.println("temp= "+temp);
		////////////////////////////////
		System.out.println("저는"+학번+"학번,이름은"+이름+"입니다.");
		System.out.println("나이는"+나이+"이고요, 이 정보는"+isReal+"입니다.");
	}
		
	}
}