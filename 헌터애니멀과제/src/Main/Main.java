package Main;
import java.util.Scanner;

import Animal.강아지;
import Animal.독수리;
import Animal.동물;
import Animal.뱀;
import Animal.상어;
import 장소.동물농장;
import 장소.동물보호협회;
import 장소.동물원;
import 장소.상점;
import 장소.숲속;

//동물생성 및 객체배열 실습을 위한 테스트 
public class Main {

	public static void menu보기() {
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("숲속에 동물생성:  1.강아지      2.뱀               3.독수리                     4. 상어       ");
		System.out.println("   	     동작  : 11.사냥하기  12.숲속의 동물 동작보기 13. 동물농장의 동물 동작보기   14.동물원의 동물 동작보기 \n\t\t 15. 동물판매 16. 상점가기");
		System.out.println("   상태 보기  : 21.숲속보기  22.사냥꾼의 동물농장보기   23.동물원보기   24. 모두 보기 25. 사냥꾼 상태창      0.종료");
		System.out.println("-----------------------------------------------------------------------");
	}
	

    public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
    	Scanner input = new Scanner(System.in);
    	숲속 forest = 숲속.getInstance();
    	동물원 zoo = 동물원.getInstance();
    	동물농장 farm = 동물농장.getInstance();
    	상점 store=상점.getInstance();
    	동물보호협회 protect_association=동물보호협회.getInstance();
    	
		int menu =0 ; 
		
		//사냥꾼 생성
		사냥꾼 hunter  = new 사냥꾼();
		hunter.showInfo();

		//강아지 한마리 생성  후 사냥!
		강아지 d = new 강아지("흰둥이");
		boolean sig=hunter.사냥하기(d);
		
		//사냥을 성공했다면, 동물농장에 넣기, 이 동작은 addAnimal()로 모듈화할 수 있고 "사냥개"에게 임무를 맡길 수 있음
		if (sig==true) farm.addAnimal(d);
		hunter.show();
		farm.show();
		//////////////////////////////////////////////////////

		//메뉴로 동작시키기
		System.out.println("------------------------------------------------------");
		System.out.println("돈이 20만원 미만이면 파산하고 GAME OVER 됩니다. ");
		System.out.println("돈을 많이 벌어서 GAME OVER를 피해보세요 *^^*!");
		int i=0;
		while(true) {
			
			menu보기();
			System.out.print("menu: ");
			menu= input.nextInt();
			if(menu==0) {
				System.out.println("프로그램 종료!");
				break;
			}		
			if(hunter.get돈주머니() < -200000)
				{
				System.out.println("돈이 부족해서 파산했습니다.");
				System.out.println("=====================");
				System.out.println("  !!!GAME OVER!!!");
				System.out.println("=====================");
				break;
				}
			switch (menu) {
				case 1:
					forest.addAnimal(new 강아지("댕댕이" + (i++)));
					break;
				case 2:
					forest.addAnimal(new 뱀("슈슈뱀" + (i++)));
					break;
				case 3:
					forest.addAnimal(new 독수리("수리수리" + (i++)));
					break;
				case 4:
					forest.addAnimal(new 상어("샤크" + (i++)));
					break;				
				
				/////////////////////////////////////////
				case 11:
					if (forest.numOfAnimals == 1) {
					System.out.println("생태계를 위해 한마리는 살려둡니다.");
					continue;
					}
					
					사냥메뉴();
					Scanner in=new Scanner(System.in);
					int num=in.nextInt();
					forest.show();
					protect_association.감시하기(hunter,num,forest);					
					
					break;
				case 12: 	
					forest.놀기();
					break;
				case 13:// 동물농장활동보기 - 탈출시도!
					farm.escape();
					break;
				case 14: //동물원 활동보기 - 일하기();	
					zoo.work();
					break;
				case 15: //동물원에 동물 판매	
					hunter.판매하기();
					break;
				case 16:
					store.메뉴(hunter);
					break;
				case 21:
					forest.show();
					break;
				case 22:
					hunter.show();
					break;
				case 23:
					zoo.show();
					break;
				case 24:
					forest.show();
					farm.show();
					zoo.show();
					break;
				case 25:
					hunter.showInfo();
					break;
				default:
					System.out.println("그런 메뉴는 없습니다.");
					break;	
				}				
		}
	
		       
    }


	private static void 사냥메뉴() {
		// TODO Auto-generated method stub
		System.out.println("===================================================");
		System.out.println("1. 랜덤사냥 2. 강아지 3. 뱀 4. 독수리 5. 상어 ");
		System.out.println("===================================================");
		
	}

}


