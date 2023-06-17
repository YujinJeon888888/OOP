package Main;

import java.util.ArrayList;
import java.util.List;

import 무기.무기;
import 윈도우.MyWin_battle_숲;
import 윈도우.Timebar;
import 윈도우.메인화면;

import 플레이어.Player;
import 플레이어.구름;
import 플레이어.문어;
import 플레이어.슈;
import 플레이어.요술이;
import 플레이어.해골;

import java.util.Collections;
import java.util.Comparator;

public class Main {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		//등장인물
		문어 문어=new 문어("문어","octopus.png",300);		
		요술이 요술이=new 요술이("요술이","Player.png",100);
		슈 슈=new 슈("슈","sue.png",100);
		구름 구름=new 구름("구름","cloud.png",3);
		해골 해골=new 해골("해골","skeleton.png",40);
		
		//무기
		//상속인 이유가 없던(기능이 같은데 클래스 이름만 달랐음) 칼 클래스 지우고 new무기로 바꿨음.
		해골.setWeapon(new 무기("해골의 강철칼",10));//일단은 기본공격력 10주는데 메소드에서 랜덤으로 공격력 조정될 것
		
		//메인화면호출
		new 메인화면(구름,  문어, 슈 ,요술이 ,  해골);
		
		
    	//리스트
//		List<Player> ps=new ArrayList<Player>();
//		ps.add(문어);
//		ps.add(요술이);
//		ps.add(슈);
//		ps.add(구름);
//		ps.add(해골);
//	
	
		
		
//		안에서 생성 가능. 옆으로 길어지는 코드가 더 많음
//		ps.add(new 슈("슈슈",30,20)); 
		
		//랜덤으로 싸움 붙일 때
//		Player p1,p2;
//		while(true) {
//			int r1=(int)(Math.random()*100)%ps.size();//0~크기-1이 뽑힘(인덱스대로)
//			p1=ps.get(r1);
//
//			int r2=(int)(Math.random()*100)%ps.size();
//			p2=ps.get(r2);
//
//			if(r1!=r2) break;//같으면 계속 돌리고, 다르면 끝냄.(중복되면 안 되니까) 
//		}

		//무기생성. 연결(요술이가 상점가서 구매하면 무기 연결)
//		p1.setWeapon(new 돌맹이("돌맹이",10));
//		p2.setWeapon(new Weapon("과제10개",10));
//		Player.show_header(); //static이니까 클래스로 접근(공통된거니까)
//		p1.show();
//		p2.show();

		//바로세팅
		//p1.setWeapon(new Weapon("과제10개",30));	
		//consoleTest(p1,p2);
		
	}

//	public static void consoleTest(Player p1,Player p2) throws InterruptedException {
//
//		while (true) {
//			if (p1.getHp() <= 0 || p2.getHp() <= 0)
//				break;
//			// 랜덤공격!
//			if ((int) (Math.random() * 1000) % 2 == 1)
//				p1.공격하기(p2);
//			else
//				p2.공격하기(p1);
//			// p1.attack(p2);
//			// p2.attack(p1);
//
//			// Player.show_header();
//			p1.show();
//			p2.show();
//
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		if (p1.getHp() <= 0)
//			System.out.println(p2.이름 + " Win!");
//		else
//			System.out.println(p1.이름 + " Win!");
//
//	}

}

