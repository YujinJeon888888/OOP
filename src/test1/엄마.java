package test1;

public class ���� extends test1.�ҸӴ� {//Ư����Ű���ִ°� ����ϰ� ������ test1. ��� ���ص� �Ǹ� ���ְ�
    private String �ϱ���;
    public �ڵ��� �ڵ����м�bag;

    public void �丮�ϱ�(){
    	System.out.println("���İ�Ƽ�� ������~");
    }

    public void û���ϱ�(){
    	System.out.println("�������� �����ؿ�");
    }

    public void �ҸӴ�ó���丮�ϱ�(){
    	super.�丮�ϱ�();//�Ž����ö�.
    	//new �ҸӴ�().�丮�ϱ�();
    }

    public void �ڵ�������(¯�� ¯){
    	//¯���� �ڵ����� �����ͼ� �����ϰ�, ¯���� ������ null�� �����մϴ�.
    	this.�ڵ����м�bag=¯.getPhone();//¯���� �� ���� ������ �ڵ������濡 ����.
    	¯.setPhone(null);//phone �� ���� null�� ������
    }

}
