package Chapter4;

public class Account {
	private String name;
	private int balance;
    public Account(String name) {
    	this.name=name;
    	System.out.println("새로운 계좌가 만들어졌습니다.");
    }
    public void withdraw(int amount){
    	this.balance-=amount;
    	System.out.println(amount+"원 출금");
    }
    
    public void show() {
    	System.out.println(name+"님의 계좌 잔고는 "+balance+"원입니다.");
    }

    public void deposit(int amount){
    	this.balance+=amount;
    	System.out.println(amount+"원 저축");
    }
    
}