package �÷��̾�;

import �������̽�.�����̱��Ʋ;

public class �� extends Player implements �����̱��Ʋ {
    private int hands=5;
    public ��(){
    }

    public ��(String �̸�, String img,int hp){
    	super(�̸�,img,hp);
    }

    
	public int getHands() {
		return hands;
	}

	public void setHands(int hands) {
		this.hands = hands;
	}


	public void �����̱�(Player target) throws InterruptedException {
		// TODO Auto-generated method stub
		int r=(int)(Math.random()*(15-3+1))+3;//3~15�� ����
		this.setHands(r);
		System.out.println(this.�̸�+"�� ����� "+this.hands+"�� ���Դϴ�.");
		target.setHp(target.getHp()-this.hands);
		
	}


	@Override
	public void �����ϱ�(Player target) throws InterruptedException {
		// TODO Auto-generated method stub
		�����̱�(target);
	}


}
