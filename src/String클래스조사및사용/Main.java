package StringŬ��������׻��;

import java.util.Scanner;

public class Main {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���ڿ��� �Է��ϼ���: ");
		String s = new String(in.nextLine());
		�޴�(s);
	}

	private static void �޴�(String s) {
		// TODO Auto-generated method stub
		int num;
		while (true) {
			System.out.println("======================================================================");
			System.out.println("1. �ܾ�� �и� 2. �ܾ��� �ε��� ã�� 3. �ε������� ��� 4. ���� ���� 5. ���� �����ϴ��� ã�� 0. ����");
			System.out.println("======================================================================");
			System.out.print("��ȣ�� �Է��ϼ���: ");
			num = in.nextInt();

			if (num == 1) {
				
				String[] tokens = s.split(" ");// ���� �������� ��� �Ÿ� String �迭�� �������
				for (String token : tokens) {// token�� tokens�ְ� ��� �ְ� ��� �ְ� ���..
					System.out.println(token);
				}
			}
			if (num == 2) {
				System.out.println("ã�� ���� �ܾ �Է��ϼ���");
				in.nextLine();
				String ss = in.nextLine();
				int index = s.indexOf(ss);// index�� ����ҰŴϱ� index�� ����

				if (index == -1)// The indexOf() method returns the first index at which a given element can be
					// found in the array, or -1 if it is not present.//0�� �ε������� �׷���
					System.out.println(ss + "�� �����ϴ�. ");
				else
					System.out.println(ss + "�� ��ġ: " + index);
			}
			if (num == 3) {
				System.out.print("���� �ε������� ������� ��������: ");
				int n = in.nextInt();
				String sub_s = s.substring(n);// �ε������� �߸� ���ڿ� ����Ϸ��� �װ� ��Ƴ�����
				System.out.println("�ε��� " + n + "���� �����ϴ� ���ڿ��� " + sub_s + " �Դϴ�.");
			}
			if (num == 4) {

				String from_c;//CharSequence�� String��. 
				String to_c; 
				System.out.print("���� ���ڸ� �������� �Է��ϼ���: ");
				in.nextLine();
				from_c=in.nextLine();

				System.out.print("���� ���ڷ� �������� �Է��ϼ���: ");

				to_c=in.nextLine();

				String a = s.replaceAll(from_c, to_c);
				System.out.println(a);

			}
			if (num == 5) {
				System.out.print("���� ���ڸ� �����ϴ��� ã�� �ͽ��ϱ�?: ");
				in.nextLine();
				String ss = in.nextLine();
				if (s.contains(ss)) {
					System.out.println("�����ϳ׿�");
				} else
					System.out.println("���� �� �ϳ׿�");
			}
			if (num == 0) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
		}

	}

}
