package Chapter3;
import java.util.Scanner;
public class Tic_Tac_Tok {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		char[][] board=new char[3][3];//������
		int x,y;
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				board[i][j]=' ';//2���� �迭 �ʱ�ȭ. ���ε����� ���� ����. String�� �־ ""�� �ʱ�ȭ �� ��
			}
		}
		//������ �׸���
		do{
			for(int i=0;i<3;i++)
			{
				System.out.println("  "+board[i][0]+"|  "+board[i][1]+"|  "+board[i][2]);	
				
				if(i!=2)
				{
					System.out.println("---|---|---");//�� �κ��� 2���� �ݺ���.
				}
			}
		
			System.out.println("���� ���� ��ǥ�� �Է��Ͻÿ�: ");
			x=scan.nextInt();
			y=scan.nextInt();
			//����ڰ� ���� ��ġ �˻�
			if(board[x][y]!=' ')
			{
				System.out.println("�߸��� ��ġ�Դϴ�. ");//��ĭ�� �ƴ� ���� �Է��ϸ� �����޼��� ���.
				continue;
			}else
				board[x][y]='X';//��ĭ�� �Է��Ѵٸ� ��ũ.
			//��ǻ�Ͱ� ���� ��ġ�� ����.
			int i=0,j=0;
			i=(int)Math.random()*3;
			j=(int)Math.random()*3;
			for(i=0;i<3;i++)
			{   
				for(j=0;j<3;j++)
				{
					if(board[i][j]==' ')
						break;
				}
				if(board[i][j]==' ')
					break;//break:�ݺ���Ż��. ���ιݺ������� break;�ߴ��� �ܺιݺ��� ��� �������̱� ������  if������ j==2�϶� �� �˻��ؼ� �ݺ��� Ż���ϰ� ����� ��.
			}
			if(i<3&&j<3)//int i.j�� ��������->������ ������ �� ��������. ���η� �� �Ⱦ ��ĭ ã�� ���� 'O' ��ũ.
			{
				
				board[i][j]='O';
			}
		}while(true);//do while ��-> �ϴ� ������ �׷��ְ� ����.->�Է���ǥ�� ���� ����� ���� �ݺ����� �����.
	
	}
}
