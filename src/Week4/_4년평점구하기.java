package Week4;

public class _4���������ϱ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double [][]score= {
				{3.3,3.4},//1�г� 1,2�б�
				{3.5,3.6},//2�г�
				{3.7,4.0},//3�г�
				{4.1,4.2}
		};
		double sum=0;
		for(int year=0;year<score.length;year++) {//��
			for(int term=0;term<score[year].length;term++)//��
			{
				sum+=score[year][term];//��ü ���� ��
			}
		}
		
		int n=score.length;//�迭�� �� ����
		int m=score[0].length;//�迭�� �� ����
		System.out.println("4�� ��ü ������ ����� "+ sum/(n*m));
	}


}
