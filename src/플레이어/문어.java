package 플레이어;
import 윈도우.MyWin_battle_바다;
public class 문어 extends Player {
	private 요술이 p1;
	public 문어(){
	}
	public 문어(String 이름, String img,int hp){
		super(이름,img,hp);
	}

	public void 기절시키기(요술이 target) throws InterruptedException{
		int r=(int)(Math.random()*(70-50+1))+50;
		this.set공격력(r);
		if(this.getHp()<=100) {
			r=(int)(Math.random()*(90-70+1))+70;
			this.set공격력(r);
		}
		if(target.get방어구()!=null)//방어구가 있으면
		{
			this.set공격력(this.get공격력()-(int)target.get방어력());//요술이의 방어력만큼 문어의 공격력에서 뺌.
			if((this.get공격력())<=0) {
				this.set공격력(0);
			}
		}
		System.out.println(this.이름+"이(가) "+target.이름+"에게 다리로 공격을 합니다. 데미지는 "+this.get공격력());
		System.out.println(this.이름+"의 공격때문에 2초간 기절합니다. 기절해서 "+target.이름+"의 정신이 오락가락 합니다. 헤롱헤롱..");	
		MyWin_battle_바다.getTa().append(this.이름+"의 공격때문에 2초간 기절합니다. 기절해서 "+target.이름+"의 정신이 오락가락 합니다. 헤롱헤롱..\n");
		target.setHp(target.getHp()-this.get공격력());
		
		Thread.sleep(2000);
	}

	public void 먹물공격(요술이 target) throws InterruptedException{
		int r=(int)(Math.random()*(70-50+1))+50;
		this.set공격력(r);
		if(this.getHp()<=100) {
			r=(int)(Math.random()*(90-70+1))+70;
			this.set공격력(r);
		}
		if(target.get방어구()!=null)//방어구가 있으면
		{
			this.set공격력(this.get공격력()-(int)target.get방어력());//요술이의 방어력만큼 문어의 공격력에서 뺌.
			if((this.get공격력())<=0) {
				this.set공격력(0);
			}
		}
		
		target.setHp(target.getHp()-this.get공격력());	
		System.out.println(this.이름+"이(가) "+target.이름+"에게 먹물공격을 합니다. 데미지는 "+this.get공격력());
	}

	
	public void 공격하기(Player target) throws InterruptedException {
		// TODO Auto-generated method stub
		p1=(요술이)target;//다운캐스팅
		int r=(int)(Math.random()*3);
		if(r==0) {
			기절시키기(p1);
		}
		else
			먹물공격(p1);
	}
	


}
