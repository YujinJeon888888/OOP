package �÷��̾�;

import �������̽�.Attack;

public abstract class Player implements Attack {
    private int hp;
    private int ���ݷ�;
    public String �̸�;
    public String img;

    public Player(){
    }

    public Player(String �̸�, String img,int hp){
    	this.�̸�=�̸�;
    	this.img=img;
    	this.hp=hp;
    }

    public void show(){
    	System.out.printf("%10d %10d %10d\n",hp,���ݷ�,�̸�);
    	System.out.println("===================================");
    }

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int get���ݷ�() {
		return ���ݷ�;
	}

	public void set���ݷ�(int d) {
		this.���ݷ� = d;
	}

}
