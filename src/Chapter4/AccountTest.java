package Chapter4;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account ��1=new Account("��1");
		��1.deposit(10000);
		��1.withdraw(2000);
		Account ��2=new Account("��2");
		��2.deposit(10000);
		��2.withdraw(6000);
		
		��1.show();
		��2.show();
	}

}
