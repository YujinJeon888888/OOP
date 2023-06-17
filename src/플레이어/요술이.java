package 플레이어;

import java.util.Scanner;

import 무기.뚫어뽕;
import 무기.무기;
import 방어구.갑옷;
import 인터페이스.라면끓이기배틀;
import 인터페이스.타자배틀;
import 윈도우.MyWin_battle_숲;

public class 요술이 extends Player implements  라면끓이기배틀,타자배틀 {
    private int 돈주머니;
    private double 방어력;
    private int hands;
    private int count=0;
    private 무기 weapon;
    private 갑옷 방어구;
	public String get입력값() {
		return 입력값;
	}

	public void set입력값(String 입력값) {
		this.입력값 = 입력값;
	}

	private String 입력값;

    public 요술이(){
    }

    public 요술이(String 이름, String img,int hp){
    	super(이름,img,hp);
    }

	public int get돈주머니() {
		return 돈주머니;
	}

	public void set돈주머니(int 돈주머니) {
		this.돈주머니 = 돈주머니;
	}

	public double get방어력() {
		return 방어력;
	}

	public void set방어력(double d) {
		this.방어력 = d;
	}

	public int getHands() {
		return hands;
	}

	public void setHands(int hands) {
		this.hands = hands;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public 무기 getWeapon() {
		return weapon;
	}

	public void setWeapon(무기 weapon) {
		this.weapon = weapon;
	}

	public 갑옷 get방어구() {
		return 방어구;
	}

	public void set방어구(갑옷 방어구) {
		this.방어구 = 방어구;
	}



	@Override
	public void 공격하기(Player target) throws InterruptedException {
		// TODO Auto-generated method stub
		int r=(int)(Math.random()*(10-5+1))+5;
		this.set공격력(r);
		if(weapon==null) {
			target.setHp(target.getHp()-this.get공격력());
			System.out.println(this.이름+"이(가) "+target.이름+"에게 공격을 합니다. 데미지는 "+this.get공격력());
		}
		else
		{
			this.set공격력(this.get공격력()+this.getWeapon().get공격력());//원래공격력+무기공격력
			target.setHp(target.getHp()-(this.get공격력()));
			System.out.println(this.이름+"이(가) "+target.이름+"에게 "+this.getWeapon().name+"으로 공격을 합니다. 데미지는" +this.get공격력());
		}
		
	}

	@Override
	public void 라면끓이기(Player target) {
		// TODO Auto-generated method stub
		int r=(int)(Math.random()*(15-3+1))+3;//3~15개 끓임
		this.setHands(r);
		target.setHp(target.getHp()-this.getHands());
		System.out.println(this.이름+"이(가) 라면을 "+this.hands+"개 끓입니다.");
		
	}
	

	@Override
	public int 정답체크(Player target) {
		// TODO Auto-generated method stub
		구름 p1=(구름)target;//다운캐스팅
		
		//(정답체크)
				//맞았을 때
				//view
				if(MyWin_battle_숲.getTa().getText().equals(p1.s[p1.r])) {//ta에서 입력한게 문제낸 문장이랑 같으면
					System.out.println("맞았습니다 야호~~^^");
					this.count++;
					return 1;
				}
				else //틀렸을때
				{
					System.out.println("틀렸습니다 ㅠ_ㅠ");
					//카운트변화x
					return 2;
				}
				
				
	}

	

}
