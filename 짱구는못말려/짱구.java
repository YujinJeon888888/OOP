package ¯���¸�����;

public class ¯�� extends ���� {
    private �ڵ��� phone=new �ڵ���();

    public void setPhone(�ڵ��� phone){//�� ������ phone�� �㿩��.
    	this.phone=phone;
    }

    public �ڵ��� getPhone(){
    	return this.phone;//�� ������
    }

    public void �丮�ϱ�(){
    	System.out.println("�Ŷ���� ������~");
    }

    public void û���ϱ�(){
    	System.out.println("�̺��� �����~");
    }

    public void �����������ϱ�(){
    	System.out.println("���ɿ���!");
    }

    public void ����ó���丮�ϱ�(){
    	super.�丮�ϱ�();//������ �丮�ϱ� �޼ҵ�� �Ž��� �ö�.
    }

    public void �ҸӴ�ó���丮�ϱ�(){
    	super.�ҸӴ�ó���丮�ϱ�();//������ �ҸӴ�ó�� �丮�ϱ� �޼ҵ�� �Ž��� �ö�.
    }

    public void �丮�ϱ�(���� mom){
    	mom.�丮�ϱ�();//������������->�������׽�Ŵ.
    }

    public void �丮�ϱ�(�ҸӴ� grandma){
    	grandma.�丮�ϱ�();//�ҸӴϺ�������->�ҸӴ����� ��Ŵ.
    }

    public void �����ϱ�(){
    	if(phone==null) �����������ϱ�();//�ڵ��� ���� ������ ������ ����
    	else{
    		for(int i=0;i<10;i++)
    			System.out.println("�����ϴ� ô...");//�ڵ��� ������ �����ϴ�ô.
    		}
    	}
}