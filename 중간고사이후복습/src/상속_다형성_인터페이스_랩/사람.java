package ���_������_�������̽�_��;

public class ��� extends ���� implements Think_able {
    private int �ֹι�ȣ=2116020;
    private String ����="�������";

    public ���(){
    	
    }

    public ���(String �̸�){
    	super(�̸�);
    }

    public void �Ա�(){
    	System.out.println("���� ����");
    }

    public void �ڱ�(){
    	System.out.println(" �����");
    }

    public void ���(){
    	System.out.println("���ٵ�~��մ�~");
    }

    public void ��������(){
    	System.out.println("�̸�: "+super.get�̸�());
    	System.out.println("�ֹι�ȣ: "+this.�ֹι�ȣ);
    	System.out.println("����: "+this.����);
    }

    public void �����ϱ�(){
    	System.out.println("������");
    }

}
