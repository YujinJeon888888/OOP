package ����;
import java.util.Scanner;
public class ���������迭 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*		 * int[][] i=new int[4][]; //*�ε����� �����̶� �򰥸��� �ʱ�. i[0]=new int[1];//1��° �࿡ 1���� ��
		 * i[1]=new int[2];//2��° �࿡ 2���� �� i[2]=new int[3];//3��° �࿡ 3���� �� i[3]=new
		 * int[4];//4��° �࿡ 4���� ��
		 * 
		 * //length System.out.println(i.length);//i�� ���� ����->4��.
		 * System.out.println(i[0].length);//i�� ù ��° ���� ���� ����->1
		 * System.out.println(i[1].length);//i�� 2 ��° ���� ���� ����->2
		 * System.out.println(i[2].length);//i�� 3 ��° ���� ���� ����->3
		 * System.out.println(i[3].length);//i�� 4 ��° ���� ���� ����->4
		 * */
		  
		//�������� �迭�� ������ ���� 
		int[][] arr= {{10,20,30},{20,21},{30,31,32},{40,41}};//�Ұ�ȣ	x �߰�ȣ o 
		//�ึ�� ��ũ�⸦ 3��,2��,3��,2���� �ְ� �ݺ����� �̿��� �� �ֱ� 
		arr[1]=new int[2]; 
		arr[2]=new int[3]; 
		arr[3]=new int[2]; 
		arr[0]=new int[3];
		 
		Scanner in=new Scanner(System.in);
		for(int j=0;j<arr.length;j++)
			{
				for(int k=0;k<arr[j].length;k++)
					{
						System.out.printf("arr[%d][%d]�� �Է��ϼ���: ",j,k);
						arr[j][k]=in.nextInt();
						in.nextLine();
					}
			}
		//1,3=>�� 2��
		for(int i=0;i<4;i++)
		{	
			if(arr[i].length<3)
				System.out.println("  "+arr[i][0]+"|  "+arr[i][1]+"|  ");	
			else
				System.out.println("  "+arr[i][0]+"|  "+arr[i][1]+"|  "+arr[i][2]);	
			
			if(i!=3)
			{
				System.out.println("----|----|----");//�� �κ��� 3���� �ݺ���.
			}
		}
	}//main
}//class
