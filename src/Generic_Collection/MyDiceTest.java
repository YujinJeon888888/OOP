package Generic_Collection;

public class MyDiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// !!����� ��!! ����Ÿ������ ����
		MyDice<String> mydice_color=new MyDice<String>();//�÷����̽�
		MyDice<Integer> mydice_number=new MyDice<Integer>();//���ڴ��̽�
		MyDice<Double> d3=new MyDice<Double>();
		//������ �ΰ��� Ŭ������ ������ ��.
		mydice_color.result="������";
		mydice_number.result=3;
		d3.result=3.2;
		
		System.out.println("������ "+mydice_color.result+" ���� ���ڴ� "+		mydice_number.result+" �Ҽ���?? "+d3.result);
	}

}
