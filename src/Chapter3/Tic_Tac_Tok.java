package Chapter3;
import java.util.Scanner;
public class Tic_Tac_Tok {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		char[][] board=new char[3][3];//게임판
		int x,y;
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				board[i][j]=' ';//2차원 배열 초기화. ★인덱스로 접근 가능. String형 있어서 ""로 초기화 못 함
			}
		}
		//게임판 그리기
		do{
			for(int i=0;i<3;i++)
			{
				System.out.println("  "+board[i][0]+"|  "+board[i][1]+"|  "+board[i][2]);	
				
				if(i!=2)
				{
					System.out.println("---|---|---");//이 부분은 2번만 반복됨.
				}
			}
		
			System.out.println("다음 수의 좌표를 입력하시오: ");
			x=scan.nextInt();
			y=scan.nextInt();
			//사용자가 놓은 위치 검사
			if(board[x][y]!=' ')
			{
				System.out.println("잘못된 위치입니다. ");//빈칸이 아닌 곳에 입력하면 에러메세지 출력.
				continue;
			}else
				board[x][y]='X';//빈칸에 입력한다면 마크.
			//컴퓨터가 놓을 위치를 결정.
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
					break;//break:반복문탈출. 내부반복문에서 break;했더라도 외부반복문 계속 실행중이기 때문에  if문으로 j==2일때 또 검사해서 반복문 탈출하게 만드는 것.
			}
			if(i<3&&j<3)//int i.j는 전역변수->변수에 저장한 값 남아있음. 가로로 쭉 훑어서 빈칸 찾은 곳에 'O' 마크.
			{
				
				board[i][j]='O';
			}
		}while(true);//do while 문-> 일단 보드판 그려주고 시작.->입력좌표에 따른 출력이 다음 반복에서 실행됨.
	
	}
}
