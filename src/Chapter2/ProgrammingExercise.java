package Chapter2;
import java.util.Scanner;
public class ProgrammingExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. �ϳ��� ���ڿ� �������� 10���� ���� �� �ִٰ� ����. �������� 127�� �ִٸ� ���� �� ���� �ʿ��Ѱ�?
		//�� �� ���� �������� ������?
		//12��, 7��
		//2. ������ ų�ι��ͷ� ��ȯ�ϴ� ���α׷��� �ۼ��Ѵ�. 1������ 1.609ų�ι��Ϳ� ����. ����ڷκ��� ������ ���� �о���δ�.
		double mile;
		double killo_meter;
		Scanner in=new Scanner(System.in);
		System.out.printf("������ �Է��Ͻÿ�:");
		mile=in.nextDouble();
		in.nextLine();
		killo_meter=1.609*mile;
		System.out.println(mile+"������"+killo_meter+"ų�ι����Դϴ�.");
		/*3. ������ ���� �츮�� ��ǰ�� ���� ���� ���� �������� �޴´�. ������������ 10% �ΰ����� �ܵ� ���� �μ�Ǿ��ִ�.
		 * ������ ��ǰ�� ���ݰ� �մ����� ���� �ݾ��� �Է��ϸ� �ΰ����� �ܵ��� ����ϴ� ���α׷��� �ۼ��غ���*/
		int ����_��;
		int ��ǰ����;
		int �ΰ���;
		int �ܵ�;
		System.out.print("���� ��: ");
		����_��=in.nextInt();
		in.nextLine();
		System.out.print("��ǰ ����: ");
		��ǰ����=in.nextInt();
		in.nextLine();
		System.out.print("�ΰ���: "+��ǰ����/10+"\n");
		�ܵ�=����_��-��ǰ����;
		System.out.print("�ܵ�: "+ �ܵ�);
		//4. ����ڷκ��� ���� �������� �Է¹޾� ���Ǹ� ����Ͽ� ����ϴ� ���α׷��� �ۼ��϶�. ��
		//���� �������� �Ǽ��� �ԷµǸ� ��µ� ��� �Ǽ������� �Ͽ��� �Ѵ�. ���Ǹ� ����ϴ� ������ ������ ����.
		double radius;
		System.out.print("\n���� ������: ");
		radius=in.nextDouble();
		double c=(double)4/3*radius*radius*radius;
		System.out.println("���� ����: "+c);
		//5. ����(�ִ� 3�ڸ�)�� 2������ ��ȯ�Ͽ� ����ϴ� ���α׷��� �ۼ��غ���.
		int ����;
		System.out.println("������ �Է��Ͻÿ�");
		����=in.nextInt();
		int A,B,C,D,E,F,G;
		G=����%2;
		F=����%2;
		E=����%2;
		D=����%2;
		C=����%2;
		B=����%2;
		A=����%2;
		System.out.print(����+": "+A+B+C+D+E+F+G);
	}

}
