package Animal;

import Main.��ɲ�;

public class ������ extends ���� {
	
	//������
	public ������(){
		this.�̸�="������";
		this.set���Ȯ��(30);  //������ ���Ȯ���� 30%
	}

	public ������(String name){    	
		//�������� ó���κ��� �⺻�����ڿ��� ó���ϰ� ȣ���ؼ� �������.
		this();
		this.�̸�= name;
		System.out.println(this.�̸�);
	}
	public ������(String name, int ���Ȯ��){
		//������ ���� �����ϴ� ��ĵ� �����ϰ�, �Ʒ�ó�� ȣ���ϴ� �͵� ����
		this(name);
		this.set���Ȯ��(���Ȯ��);
	}
	
	/////////////////////////
	public void ���ֺθ���(){
		System.out.println("���� ���ָ� �θ��� ������.. ");
		System.out.println("������ ���ؼ� ���� ���� power�� �淯�� Ż���� �õ��ؾ���!");
		this.power+=20;
		System.out.println(this.�̸�+"�� power�� ���� "+this.power);
		if(power>=50)
			escape(this);
	}
	public void �����ϱ�(��ɲ� hunter) {//�߰�
		set���ݷ�((int)(Math.random()*100)%(80-90+1)+80);//���ݷ� ������ 80~90
		set���Ȯ��(100-get���ݷ�()+hunter.get����());//���Ȯ���� 100-���ݷ��� ����. 
		System.out.println("���� �ڱ� ��ų!!!");//���ݸ޼���
		System.out.println(this.�̸�+"�� �����Ͽ����ϴ�. �������� "+this.get���ݷ�());
		//�������� ���ݷ� ���� �ٸ��� �����ϰ�(������ ���� ����, ���� ���� ���� ����)
		//���Ȯ�� set �ҷ��� (100-���ݷ�) ���ڷ� �ֱ�
		//��ɲ��� ��ɿ� �����ϸ� ���ݸ޼��� ���, �����ϸ� ���ݸ޼��� ��� x=>��ɲۿ��� �����ϱ�
		//�������� ���ݸ޼��� �ٸ���
	}
	
	public void �����̱�(){
		this.����();
	}

	public void ����(){
		System.out.println(this.�̸�+"�� ������ ���ƴٴմϴ�. �޷�~");
	}

	public void ���(){
		int r=(int)(Math.random()*4);
		switch(r) {
		case 0:
			System.out.println("�������� ���ƴٴϸ鼭 ��� ����"+this.�̸�+"�� ������ �ٺ��� �� �ð��� ���� ��������~");
			break;
		case 1:
			�Ա�();
			break;
		case 2:
			�����̱�();
			break;
		case 3:	
			super.�ڱ�();
			break;
		}

	}
	public void �Ա�() {//�������� �Ա� �ٸ��� ������->�߻�    	
		System.out.println(this.�̸�+"�� ��⸦ �Խ��ϴ�.");
	}


}
