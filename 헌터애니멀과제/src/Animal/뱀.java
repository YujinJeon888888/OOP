package Animal;

import Main.��ɲ�;

public class �� extends ���� {

	//������
    public ��(){
    	this.�̸�="������"; 
    	this.set���Ȯ��(20); 
    }
     public ��(String name){    	
    	//�������� ó���κ��� �⺻�����ڿ��� ó���ϰ� ȣ���ؼ� �������.
    	this();
    	this.�̸�= name; 	
    	System.out.println(this.�̸�);//�����ڰ� ȣ�� ������ �� ��->�����ڰ� ȣ��ǰ� ���� �̸� ��������->���������ڿ��� �̸� ����Ʈ �غ��� ��->���⿡ �̸� ����Ʈ
    }
    public ��(String name, int ���Ȯ��){
    	//������ ���� �����ϴ� ��ĵ� �����ϰ�, �Ʒ�ó�� ȣ���ϴ� �͵� ����
    	this(name);
    	this.set���Ȯ��(���Ȯ��);
    }
    ///////////////////////////
    public void �����ϱ�(��ɲ� hunter) {//�߰�
    	set���ݷ�((int)(Math.random()*100)%(50-40+1)+40);//���ݷ� ������ 40~50
    	set���Ȯ��(100-get���ݷ�()+hunter.get����());//���Ȯ���� 100-���ݷ��� ����
    	System.out.println("�ʸ� Ʈ�� ��ų!");//���ݸ޼���
    	System.out.println(this.�̸�+"�� �����Ͽ����ϴ�. �������� "+this.get���ݷ�());
    //�������� ���ݷ� ���� �ٸ��� �����ϰ�(������ ���� ����, ���� ���� ���� ����)
	//���Ȯ�� set �ҷ��� (100-���ݷ�) ���ڷ� �ֱ�
	//��ɲ��� ��ɿ� �����ϸ� ���ݸ޼��� ���, �����ϸ� ���ݸ޼��� ��� x=>��ɲۿ��� �����ϱ�
	//�������� ���ݸ޼��� �ٸ���
    }
    public void ���ֺθ���(){
    	System.out.println("���� ���ָ� �θ��� ��.. ");
    	System.out.println("������ ���ؼ� ���� ���� power�� �淯�� Ż���� �õ��ؾ���!");
    	this.power+=10;
    	System.out.println(this.�̸�+"�� power�� ���� "+this.power);
    	if(power>=50)
    		escape(this);//this=�� ��ü�� Ż���Ų�ٴ� ��.
      }
   
    
    
    public void ���ٴϱ�(){
    	this.�����̱�();
    }
    public void �Ա�() { 	
    	System.out.println(this.�̸�+"�� �㸦 ��ŵ�ϴ�. �ܲ�~");
    }
    
    public void �̸�Ʋ��(){
    	System.out.println("�ʸ��ʸ� �ʸ��� Ʋ��� ����~");
    }
    public void �����̱�() {
    	System.out.println(this.�̸�+"�� ���ٴմϴ�. ������...");
    }
    public void ���(){
    	int r=(int)(Math.random()*4);
		switch(r) {
		case 0:
			System.out.println("���� ~ ����~");
			�̸�Ʋ��();
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

}
