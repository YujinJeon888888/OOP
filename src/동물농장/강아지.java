package ��������;

public class ������ extends ���� implements Playable {
    String ���ܵа���;

    public ������(){
    	super();//������ super()�� �θ�//super()�ѹ��̶� �ۼ��ϸ� �ڵ����� ���� �����ֱ� ����
    }

    public ������(String name){
    	super(name);//name�ʱ�ȭ�ϴ� �����ڸ� �θ�
    }

    public String get���ܵа���(){
        return this.���ܵа���;
    }

    public void set���ܵа���(String ���ܵа���){
    //set�̴� ���ܵа��� ��.
    	this.���ܵа���=���ܵа���;//�Է��Ѵ�� ����
    }

    public void �����̱�(){
    	System.out.println("�ʹٴٴٴٴ�");
    }

    public void ���(){
    	System.out.println("�۸�!");
    }

    public void �ֱ��θ���(){
    }

    public void ����������(){
    }

    public void �Ź߹���������(){
    }

    public void �����ϱ�(){
    }

    public void �Ҹ�����(){
    }

}
