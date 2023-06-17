package 플레이어;

import 인터페이스.Attack;

public abstract class Player implements Attack {
    private int hp;
    private int 공격력;
    public String 이름;
    public String img;

    public Player(){
    }

    public Player(String 이름, String img,int hp){
    	this.이름=이름;
    	this.img=img;
    	this.hp=hp;
    }

    public void show(){
    	System.out.printf("%10d %10d %10d\n",hp,공격력,이름);
    	System.out.println("===================================");
    }

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int get공격력() {
		return 공격력;
	}

	public void set공격력(int d) {
		this.공격력 = d;
	}

}
