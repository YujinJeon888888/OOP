package �÷��̾�;

import ����.����;

public class �ذ� extends Player {
    private ���� weapon;
    private ����� p1;
    public �ذ�(){
    }

    public �ذ�(String �̸�, String img,int hp){
    	super(�̸�,img,hp);
    }
    //weapon�� ���� player���� player�� ����ȭ��
	public ���� getWeapon() {
		return weapon;
	}

	public void setWeapon(���� weapon) {
		this.weapon = weapon;
	}

	@Override
	public void �����ϱ�(Player target) throws InterruptedException {
		// TODO Auto-generated method stub
		p1=(�����)target;
		int r=(int)(Math.random()*(15-5+1))+5;//5~15
		this.weapon.set���ݷ�(r);
		this.set���ݷ�(r);//������ݷ¸�ŭ �ذ��� ���ݷ��� ������.
		if(p1.get��()!=null)//���� ������
		{
			this.set���ݷ�(this.get���ݷ�()-(int)p1.get����());//������� ���¸�ŭ �ذ��� ���ݷ¿��� ��.
			if((this.get���ݷ�())<=0) {
				this.set���ݷ�(0);
			}
		}
		target.setHp(target.getHp()-this.get���ݷ�());
		System.out.println(this.�̸�+"�� "+target.�̸�+"���� "+this.getWeapon().name+"���� ������ �մϴ�. �������� "+this.get���ݷ�());
	}
	
}
