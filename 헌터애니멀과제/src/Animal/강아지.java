package Animal;

import Main.��ɲ�;

public class ������ extends ���� {
	
	//������
    public ������(){
    	
    	this.�̸�="������";
    	this.set���Ȯ��(80);  //������ ���Ȯ���� 80%
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
    
   ////////////////////////////
    public void �����ϱ�(��ɲ� hunter) {//�߰�
    	set���ݷ�((int)(Math.random()*100)%10+1);//���ݷ� ������ 1~10
    	set���Ȯ��(100-get���ݷ�()+hunter.get����());//���Ȯ���� 100-���ݷ��� ����
    	System.out.println("�Ӿ� ���� ��ų!");//���ݸ޼���
    	System.out.println(this.�̸�+"�� �����Ͽ����ϴ�. �������� "+this.get���ݷ�());
    //�������� ���ݷ� ���� �ٸ��� �����ϰ�(������ ���� ����, ���� ���� ���� ����)
	//���Ȯ�� set �ҷ��� (100-���ݷ�) ���ڷ� �ֱ�
	//��ɲ��� ��ɿ� �����ϸ� ���ݸ޼��� ���, �����ϸ� ���ݸ޼��� ��� x=>��ɲۿ��� �����ϱ�
	//�������� ���ݸ޼��� �ٸ���
    }
	
    public void ���(){
    	int r=(int)(Math.random()*6);
    	switch(r) {
    	case 0:
    		System.out.println(this.�̸�+"�� ���ӿ��� �پ�ϸ� ��ϴ� �۸۸�~");
    		break;
    	case 1:
    		�Ա�();
    		break;
    	case 2:
    		�����̱�();
    		break;
    	case 3:
    		����������();
    		break;
    	case 4:
    		�Ź߹���������();
    		break;
    	case 5:
    		super.�ڱ�();
    		break;
    	}
    
    }
   
    public void �Ա�() {//�������� ��� �ٸ��� ������->�߻�    	
    	System.out.println(this.�̸�+"�� ������ �Խ��ϴ�. �y�y");
    }
	

	public void �����̱�() {//�������� ��� �ٸ��� ������->�߻�
		System.out.println(this.�̸�+"�� �ų��� �޸��ϴ�. �п�!");
	}
	
    public void ����������(){
    	System.out.println("������ �������? �۸�~");
    }

    public void �Ź߹���������(){
    	System.out.println("�Ź��� ���� ������ ������? �۸�~");
    }
    
    //����������
    public void ���ֺθ���(){
    	System.out.println("�۸�...�۸�....���� ���ָ� �θ��� ������ ");
    	System.out.println("������ ���ؼ� ���� ���� power�� �淯�� Ż���� �õ��ؾ���!");
    	this.power+=10;
    	System.out.println(this.�̸�+"�� power�� ���� "+this.power);
    	if(power>=50)
    		escape(this);
      }

    

}
