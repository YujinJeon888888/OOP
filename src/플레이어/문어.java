package �÷��̾�;
import ������.MyWin_battle_�ٴ�;
public class ���� extends Player {
	private ����� p1;
	public ����(){
	}
	public ����(String �̸�, String img,int hp){
		super(�̸�,img,hp);
	}

	public void ������Ű��(����� target) throws InterruptedException{
		int r=(int)(Math.random()*(70-50+1))+50;
		this.set���ݷ�(r);
		if(this.getHp()<=100) {
			r=(int)(Math.random()*(90-70+1))+70;
			this.set���ݷ�(r);
		}
		if(target.get��()!=null)//���� ������
		{
			this.set���ݷ�(this.get���ݷ�()-(int)target.get����());//������� ���¸�ŭ ������ ���ݷ¿��� ��.
			if((this.get���ݷ�())<=0) {
				this.set���ݷ�(0);
			}
		}
		System.out.println(this.�̸�+"��(��) "+target.�̸�+"���� �ٸ��� ������ �մϴ�. �������� "+this.get���ݷ�());
		System.out.println(this.�̸�+"�� ���ݶ����� 2�ʰ� �����մϴ�. �����ؼ� "+target.�̸�+"�� ������ �������� �մϴ�. ������..");	
		MyWin_battle_�ٴ�.getTa().append(this.�̸�+"�� ���ݶ����� 2�ʰ� �����մϴ�. �����ؼ� "+target.�̸�+"�� ������ �������� �մϴ�. ������..\n");
		target.setHp(target.getHp()-this.get���ݷ�());
		
		Thread.sleep(2000);
	}

	public void �Թ�����(����� target) throws InterruptedException{
		int r=(int)(Math.random()*(70-50+1))+50;
		this.set���ݷ�(r);
		if(this.getHp()<=100) {
			r=(int)(Math.random()*(90-70+1))+70;
			this.set���ݷ�(r);
		}
		if(target.get��()!=null)//���� ������
		{
			this.set���ݷ�(this.get���ݷ�()-(int)target.get����());//������� ���¸�ŭ ������ ���ݷ¿��� ��.
			if((this.get���ݷ�())<=0) {
				this.set���ݷ�(0);
			}
		}
		
		target.setHp(target.getHp()-this.get���ݷ�());	
		System.out.println(this.�̸�+"��(��) "+target.�̸�+"���� �Թ������� �մϴ�. �������� "+this.get���ݷ�());
	}

	
	public void �����ϱ�(Player target) throws InterruptedException {
		// TODO Auto-generated method stub
		p1=(�����)target;//�ٿ�ĳ����
		int r=(int)(Math.random()*3);
		if(r==0) {
			������Ű��(p1);
		}
		else
			�Թ�����(p1);
	}
	


}
