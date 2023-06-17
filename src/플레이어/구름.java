package 플레이어;


import java.util.Scanner;

import Main.Main;
import 윈도우.MyWin_battle_숲;
import 인터페이스.타자배틀;

public class 구름 extends Player  implements 타자배틀{
    private int count=0;
    public String s1="무궁화 꽃이 피었습니다.";
    public String s2="영타시험 HelloWorld";
    public String s3="띄어쓰기가   몇개게 하하하!!^^";//3개
    public String s4="경찰청 철창살은 외철창살이냐 쌍철창살이냐";
    public String s5="시골 찹쌀 햇찹쌀 도시 찹쌀 촌찹쌀";
    private String 입력값;
    public int r;
    public String[] s= {s1,s2,s3,s4,s5};
    
    public 구름(){
    }

    public 구름(String 이름, String img,int hp){
    	super(이름,img,hp);
    }

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String get입력값() {
		return 입력값;
	}

	public void set입력값(String 입력값) {
		this.입력값 = 입력값;
	}

	@Override
	public void 공격하기(Player target) throws InterruptedException {
		// TODO Auto-generated method stub		
		타자치기();
	}
	//타자배틀은 view에서 보이기 때문에 view에서 정의함.
	//ta에서 가져온 문장과 s[r]을 비교하는 것이기 때문에 콘솔에서 비교가 안 됨. 
	
	public void 타자치기() {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				
				//문제내기(시작하기 눌렀을 때)
				System.out.println("보이는 문장을 정확히 따라치세요");
				r=(int)(Math.random()*5);//주사위굴려짐
				//콘솔에 안내
				System.out.println(s[r]);
			
	}

	@Override
	public int 정답체크(Player target) {
		// TODO Auto-generated method stub
		요술이 p1=(요술이)target;//다운캐스팅
		//정답체크					
		//view
		if(MyWin_battle_숲.getTa().getText().equals(s[r]))
			return 1;//요술이가 이겼다는 뜻
		else {
			this.count++;
			return 2;//구름이 이겼다는 뜻
		}
	
	}


  

}
