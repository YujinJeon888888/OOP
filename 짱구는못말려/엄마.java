package ¯���¸�����;

public class ���� extends �ҸӴ� {
    private String �ϱ���;
    private �ڵ��� �ڵ����м�bag;

    public void �丮�ϱ�(){
    	System.out.println("���İ�Ƽ�� ������~");//�������̵�
    }

    public void û���ϱ�(){
    	System.out.println("�������� �����ϰ� û���ؿ�~");
    }

    public void �ҸӴ�ó���丮�ϱ�(){
    	super.�丮�ϱ�();//�ҸӴ��� �丮�ϱ�� �Ž��� �ö�
    }

    public void �ڵ�������(¯�� ¯){
    	//¯���� �ڵ����� �����ͼ� �����ϰ�, ¯���� ������ null�� �����մϴ�.(¯�� Ŭ���������� �ڵ��� ���� null�̵�.)
    	this.�ڵ����м�bag=¯.getPhone();//¯.���� ��� ����, getphone�� �ڵ��� �� ������->�ڵ����м�bag�� �ڵ��� �� ��.
    	¯.setPhone(null);//¯.���� ��� ����, �ڵ��� ���� null�� ����.
    	System.out.println("������ �ڵ����� �������ϴ�!");
    }

}
