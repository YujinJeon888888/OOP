package Chapter4;

public class Account {
	private String name;
	private int balance;
    public Account(String name) {
    	this.name=name;
    	System.out.println("���ο� ���°� ����������ϴ�.");
    }
    public void withdraw(int amount){
    	this.balance-=amount;
    	System.out.println(amount+"�� ���");
    }
    
    public void show() {
    	System.out.println(name+"���� ���� �ܰ�� "+balance+"���Դϴ�.");
    }

    public void deposit(int amount){
    	this.balance+=amount;
    	System.out.println(amount+"�� ����");
    }
    
}