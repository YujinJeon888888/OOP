package 플레이어;

import 무기.무기;

public class 해골 extends Player {
    private 무기 weapon;
    private 요술이 p1;
    public 해골(){
    }

    public 해골(String 이름, String img,int hp){
    	super(이름,img,hp);
    }
    //weapon을 가진 player여서 player와 차별화됨
	public 무기 getWeapon() {
		return weapon;
	}

	public void setWeapon(무기 weapon) {
		this.weapon = weapon;
	}

	@Override
	public void 공격하기(Player target) throws InterruptedException {
		// TODO Auto-generated method stub
		p1=(요술이)target;
		int r=(int)(Math.random()*(15-5+1))+5;//5~15
		this.weapon.set공격력(r);
		this.set공격력(r);//무기공격력만큼 해골의 공격력을 세팅함.
		if(p1.get방어구()!=null)//방어구가 있으면
		{
			this.set공격력(this.get공격력()-(int)p1.get방어력());//요술이의 방어력만큼 해골의 공격력에서 뺌.
			if((this.get공격력())<=0) {
				this.set공격력(0);
			}
		}
		target.setHp(target.getHp()-this.get공격력());
		System.out.println(this.이름+"이 "+target.이름+"에게 "+this.getWeapon().name+"으로 공격을 합니다. 데미지는 "+this.get공격력());
	}
	
}
