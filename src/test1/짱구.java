package test1;

public class ¯�� extends ���� {
    private �ڵ��� phone;

    public void setPhone(�ڵ��� phone){
    	this.phone=phone;
    }

    public �ڵ��� getPhone(){
        return this.phone;
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
    	super.�丮�ϱ�();
    }

    public void �ҸӴ�ó���丮�ϱ�(){
    	super.�ҸӴ�ó���丮�ϱ�();//super super(x) super�� �� ����. �� ��� �������� ������������.
    }

    public void �丮�ϱ�(���� mom){
    	mom.�丮�ϱ�();//�������׽�Ŵ. 
    }

    public void �丮�ϱ�(�ҸӴ� grandma){
    	grandma.�丮�ϱ�();
    }

    public void �����ϱ�(){
    	if(phone==null) �����������ϱ�();
    	else {
    		for(int i=0;i<10;i++)
    			System.out.println("�����ϴ� ô...");
    	}
    }

}
