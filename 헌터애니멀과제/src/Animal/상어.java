package Animal;

import Main.��ɲ�;

public class ��� extends ���� {
	//������
	public ���() {
		this.�̸� = "��ũ";
		this.set���Ȯ��(101);//���ݷ�:100->�������Ȯ��:1�ۼ�Ʈ  �ؾ�Ȯ��
	}

	public ���(String name) {
		// �������� ó���κ��� �⺻�����ڿ��� ó���ϰ� ȣ���ؼ� �������.
		this();
		this.�̸� = name;
		System.out.println(this.�̸�);
	}
	public ���(String name, int ���Ȯ��) {
		// ������ ���� �����ϴ� ��ĵ� �����ϰ�, �Ʒ�ó�� ȣ���ϴ� �͵� ����
		this(name);
		this.set���Ȯ��(���Ȯ��);
	}
	/////////////////////////
	public void �����ϱ�(��ɲ� hunter) {//�߰�
		set���ݷ�(100);//���ݷ��� ������ 100
		set���Ȯ��(101-get���ݷ�()+hunter.get����());//���Ȯ���� 100-���ݷ��� ����=>��ɼ���Ȯ���� 1�ۼ�Ʈ
		System.out.println("���ù����� �̻��� ���� ��ų!");//���ݸ޼���
		System.out.println(this.�̸�+"�� �����Ͽ����ϴ�. �������� "+this.get���ݷ�());
		//�������� ���ݷ� ���� �ٸ��� �����ϰ�(������ ���� ����, ���� ���� ���� ����)
		//���Ȯ�� set �ҷ��� (100-���ݷ�) ���ڷ� �ֱ�
		//��ɲ��� ��ɿ� �����ϸ� ���ݸ޼��� ���, �����ϸ� ���ݸ޼��� ��� x=>��ɲۿ��� �����ϱ�
		//�������� ���ݸ޼��� �ٸ���
	}



	public void ���ġ��(){
		System.out.println("�� ������ ���Ĩ�ϴ�. ��Ǫ��Ǫ~");
	}

	public void �����̱�(){
		this.���ġ��();
	}

	public void ���(){
		int r=(int)(Math.random()*4);
		switch(r) {
		case 0:
			System.out.println("����� �������ݾ�! ���� � �ٴٷ� ������!!!~ �����");
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
	public void �Ա�() {
		System.out.println(this.�̸�+"�� Ǯ�̶� ���Խ��ϴ�. �ٴ� ���� �;� �Ф�");
	}
	public void ���ֺθ���(){
		System.out.println("��ũ��ũ.. ���� ���ָ� �θ��� ��� ");
		System.out.println("������ ���ؼ� ���� ���� power�� �淯�� Ż���� �õ��ؾ���!");
		this.power+=30;
		System.out.println(this.�̸�+"�� power�� ���� "+this.power);
		if(power>=50)
			escape(this);
	}

}
