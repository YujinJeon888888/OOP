package 플레이어;

import 인터페이스.라면끓이기배틀;

public class 슈 extends Player implements 라면끓이기배틀 {
    private int hands=5;
    public 슈(){
    }

    public 슈(String 이름, String img,int hp){
    	super(이름,img,hp);
    }

    
	public int getHands() {
		return hands;
	}

	public void setHands(int hands) {
		this.hands = hands;
	}


	public void 라면끓이기(Player target) throws InterruptedException {
		// TODO Auto-generated method stub
		int r=(int)(Math.random()*(15-3+1))+3;//3~15개 끓임
		this.setHands(r);
		System.out.println(this.이름+"이 라면을 "+this.hands+"개 끓입니다.");
		target.setHp(target.getHp()-this.hands);
		
	}


	@Override
	public void 공격하기(Player target) throws InterruptedException {
		// TODO Auto-generated method stub
		라면끓이기(target);
	}


}
