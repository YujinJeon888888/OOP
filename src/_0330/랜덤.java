package _0330;
import java.util.Random;
public class ���� {
	private static void InItArray(int[] ar,int start) {
		// TODO Auto-generated method stub
		for(int i=0;i<ar.length;i++) {
			ar[i]= (i+start);
		}
	}
	private static void ShowArray(int[] ar) {
		// TODO Auto-generated method stub
		for(int i=0;i<ar.length;i++) {
			System.out.printf("%3d",ar[i]);
		}
		System.out.println();
	}
	private static void InItArray_Random(int[] ar) {
		// TODO Auto-generated method stub
		Random r=new Random();//��
		Math.random();//���ϰ� double//��
		for(int i=0;i<ar.length;i++) {
			ar[i]=(int)(Math.random()*100);//0���� �Է°�����, ���������� �°� next�f��
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] ar=new int[20];
		//�ʱ�ȭ�ϱ�
		InItArray(ar,10);//�����Ͷ� �迭�� �־���
		ShowArray(ar);
		
		//�������� �ʱ�ȭ�ϱ�
		InItArray_Random(ar);
		ShowArray(ar);
	
	}//���γ�
	
}//Ŭ������
