package �������̽�;

public interface Workable {
	//���ָ� �θ� ��  hp, power, money ��  ������ �����غ����?->power
	//���ֺθ����� ������ �����غ�����.  �� �����鿡�� �����ϴ� ���� ��Ģ������
	//�������� ����� default �޼ҵ�� �߰��ص� �˴ϴ�.

	public default void ���ֺθ���() {
		System.out.println("������ (�⺻������) ���ָ� �θ��ϴ�.");
	}
	public default void work() {
		System.out.println("������ (�⺻������) ���� �մϴ�.");
	}
}
