package Animal;
import Main.*;
import �������̽�.Escapeable;
import �������̽�.Huntable;
import �������̽�.Moveable;
import �������̽�.Playable;
import �������̽�.Workable;
import ���.������;
import ���.����;

public abstract class ���� implements Playable, Moveable, Huntable, Workable, Escapeable {
	public String �̸�;
	private int ����;
	private int ���Ȯ��;
	public int power;
	private int ���ݷ�;//�߰�
	//������
	public ����(){
		System.out.println("������ �Ѹ��� �����մϴ� : ");
	}
	public ����(String �̸�){
		this.�̸�=�̸�;
		System.out.println("������ �Ѹ��� �����մϴ� : ");
		System.out.println(this.�̸�);
	}
	public ����(String name, int ���Ȯ��){
    	//������ ���� �����ϴ� ��ĵ� �����ϰ�, �Ʒ�ó�� ȣ���ϴ� �͵� ����
    	this(name);
    	this.���Ȯ��=���Ȯ��;
    	System.out.println("������ �Ѹ��� �����մϴ� : ");
		System.out.println(this.�̸�);
    }

	////////////////////
	public int get����(){

		return this.����;
	}

	public void set����(int ����){
		this.���� = ����;
	}   
	public int get���ݷ�(){//�߰�

		return this.���ݷ�;
	}

	public void set���ݷ�(int ���ݷ�){//�߰�
		this.���ݷ� = ���ݷ�;
	} 
	public int get���Ȯ��(){

		return this.���Ȯ��;
	}

	public void set���Ȯ��(int ���Ȯ��){
		this.���Ȯ�� = ���Ȯ��;
	} 
	public void set���Ȯ��(char plus_or_minus,int ���Ȯ��){//�߰�
		if(plus_or_minus=='+')
		this.���Ȯ�� += ���Ȯ��;
		if(plus_or_minus=='-')
			this.���Ȯ�� -= ���Ȯ��;
	}   
	
	public abstract void �����ϱ�(��ɲ� hunter);//�߰�
		//�������� ���ݷ� ���� �ٸ��� �����ϰ�(������ ���� ����, ���� ���� ���� ����)
		//���Ȯ�� set �ҷ��� (100-���ݷ�) ���ڷ� �ֱ�
		//��ɲ��� ��ɿ� �����ϸ� ���ݸ޼��� ���, �����ϸ� ���ݸ޼��� ��� x
		//�������� ���ݸ޼��� �ٸ���
		
	public abstract void ���();//�������� ��� �ٸ��� ������->�߻� . �������̽� �� abstract�� ������ �� ����

	public abstract void �Ա�();
		

	public void �ڱ�() {//�������� �� ���� ����->�������̵� x
		System.out.println(this.�̸�+"�� ���� ��ϴ�. zZZ");
	}

	public abstract void �����̱�();//�������� ��� �ٸ��� ������->�߻�
	
	
	public void show(){
		
	}
	
	public void escape(���� animal) {
		System.out.println("��ӳ� ������ Ż���� �մϴ�..");
		������ zoo=������.getInstance();//�ҷ�����. ��ü �ϳ��ϱ� �ҷ���=�̱���, new x
		���� forest=����.getInstance();
		//���������ִ���ã�� �ݺ���
		����[] animals=zoo.getAnimals();
		for(int n=0;n<zoo.numOfAnimals;n++) {
			if(animals[n]==animal)
				break;
		}
		//ã�Ƽ� forest �� �ֱ�
		zoo.removeAnimal(animal);
		forest.addAnimal(animal);
		
		
		
	}

}
