package �÷��̾�;

import java.util.Scanner;

import ����.�վ��;
import ����.����;
import ��.����;
import �������̽�.�����̱��Ʋ;
import �������̽�.Ÿ�ڹ�Ʋ;
import ������.MyWin_battle_��;

public class ����� extends Player implements  �����̱��Ʋ,Ÿ�ڹ�Ʋ {
    private int ���ָӴ�;
    private double ����;
    private int hands;
    private int count=0;
    private ���� weapon;
    private ���� ��;
	public String get�Է°�() {
		return �Է°�;
	}

	public void set�Է°�(String �Է°�) {
		this.�Է°� = �Է°�;
	}

	private String �Է°�;

    public �����(){
    }

    public �����(String �̸�, String img,int hp){
    	super(�̸�,img,hp);
    }

	public int get���ָӴ�() {
		return ���ָӴ�;
	}

	public void set���ָӴ�(int ���ָӴ�) {
		this.���ָӴ� = ���ָӴ�;
	}

	public double get����() {
		return ����;
	}

	public void set����(double d) {
		this.���� = d;
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

	public ���� getWeapon() {
		return weapon;
	}

	public void setWeapon(���� weapon) {
		this.weapon = weapon;
	}

	public ���� get��() {
		return ��;
	}

	public void set��(���� ��) {
		this.�� = ��;
	}



	@Override
	public void �����ϱ�(Player target) throws InterruptedException {
		// TODO Auto-generated method stub
		int r=(int)(Math.random()*(10-5+1))+5;
		this.set���ݷ�(r);
		if(weapon==null) {
			target.setHp(target.getHp()-this.get���ݷ�());
			System.out.println(this.�̸�+"��(��) "+target.�̸�+"���� ������ �մϴ�. �������� "+this.get���ݷ�());
		}
		else
		{
			this.set���ݷ�(this.get���ݷ�()+this.getWeapon().get���ݷ�());//�������ݷ�+������ݷ�
			target.setHp(target.getHp()-(this.get���ݷ�()));
			System.out.println(this.�̸�+"��(��) "+target.�̸�+"���� "+this.getWeapon().name+"���� ������ �մϴ�. ��������" +this.get���ݷ�());
		}
		
	}

	@Override
	public void �����̱�(Player target) {
		// TODO Auto-generated method stub
		int r=(int)(Math.random()*(15-3+1))+3;//3~15�� ����
		this.setHands(r);
		target.setHp(target.getHp()-this.getHands());
		System.out.println(this.�̸�+"��(��) ����� "+this.hands+"�� ���Դϴ�.");
		
	}
	

	@Override
	public int ����üũ(Player target) {
		// TODO Auto-generated method stub
		���� p1=(����)target;//�ٿ�ĳ����
		
		//(����üũ)
				//�¾��� ��
				//view
				if(MyWin_battle_��.getTa().getText().equals(p1.s[p1.r])) {//ta���� �Է��Ѱ� ������ �����̶� ������
					System.out.println("�¾ҽ��ϴ� ��ȣ~~^^");
					this.count++;
					return 1;
				}
				else //Ʋ������
				{
					System.out.println("Ʋ�Ƚ��ϴ� ��_��");
					//ī��Ʈ��ȭx
					return 2;
				}
				
				
	}

	

}
