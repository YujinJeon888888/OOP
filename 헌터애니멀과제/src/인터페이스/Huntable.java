package �������̽�;
import Animal.����;

public interface Huntable {
	
	//��� Ȯ���� ���� ����/������ return�ϵ��� ������ �� ����
	
	public default void ����ϱ�() {
		System.out.println("������ ����� �մϴ�.");
		
	}
	
	public default void ����ϱ�(���� animal) {
		//Ư�� ���� ����ϱ�
		System.out.println(animal.�̸� +"�� ��� �մϴ�.");
		
	}	
	
	public default void ����ϱ�(���� [] animals) {
		System.out.println("� ������ � ������ ����մϴ�.");
		// ���� �������� �����ϰ� ��� ����ϱ�	�������� ��������.	
		// animals[i]�� animal[j]�� ����ϵ��� , i�� j�� ���� �޶�� �Ѵ�.
		

	}
	
}
