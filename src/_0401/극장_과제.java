package _0401;
import java.util.Scanner;
public class 극장_과제 {
	static Scanner in=new Scanner(System.in);
	private static void initSeats(int[][] ar) {//public:어디서나 접근, private:어디서나 접근 못하게
		// TODO Auto-generated method stub
		for(int row=0;row<ar.length;row++) {
			for(int col=0;col<ar[row].length;col++)
			{
				ar[row][col]=0;
			}
		}
	}
	private static void showSeats(int[][] ar) {
		// TODO Auto-generated method stub
		for(int row=0;row<ar.length;row++) {
			for(int col=0;col<ar[row].length;col++)//행길이.
			{
				//□■
				if(ar[row][col]==0)
					System.out.print("□ ");
				else
					System.out.print("■ ");
			}
		System.out.println();
		}
	}
	private static int[][] inputSeats(int[][] seats,int 번호,int 행,int 열) {
		// TODO Auto-generated method stub
		System.out.println("== 좌석을 예약합니다.! ==");
	
		
		while(true)	
		{	
			//행
			System.out.print("행을 입력하세요(0~9): ");
			행=in.nextInt();
			in.nextLine();
			if(!(행>=0&&행<=9))
					{
						System.out.println("다시 입력하세요.");
						continue;
					}	
			while(true)//열
			{
				
			System.out.print("열을 입력하세요(0~9): ");
			열=in.nextInt();
			in.nextLine();
			if(!(열>=0&&열<=9))
					{
						System.out.println("다시 입력하세요.");
						continue;
					}
			else
				break;
			}//while(열)
			if(번호==1)//예약
			{
				if(seats[행][열]==1)
					{
					System.out.println("이미 예약되었습니다.");	
					continue;
					}
				else
				{
					seats[행][열]=1;
					break;
				}
			}
			if(번호==2)//취소
			{
				if(seats[행][열]==0)
					{
					System.out.println("이미 예약되지 않은 자리입니다.");	
					continue;
					}
				else
					{
						seats[행][열]=0;
						break;
					}
			}
		}//while(행)
		return seats;
	}	
	private static void welcome() {
		// TODO Auto-generated method stub
		System.out.println("어서오세요~*^^*");
	}
	private static int show메뉴(String 메뉴,int 번호) {
		// TODO Auto-generated method stub
		메뉴="##########################################################\n1. 예약하기 , 2. 취소하기, 3. 좌석보이기,  0. 그만하기\n##########################################################";
		System.out.println(메뉴);
		System.out.print("입력값: ");
		번호=in.nextInt();
		in.nextLine();
		return 번호;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] seats=new int [10][10];
		String 메뉴="";
		int 번호=0;
		int 행=0,열=0;
		initSeats(seats);//초기화	
		welcome();
		while(true)
		{	
			번호=show메뉴(메뉴,번호);//대입을 해야 증발 안함.(대입 안 할 경우-> 계속 0)//질문하기
			if(번호==1)
			{
				inputSeats(seats,번호,행,열);
			}
			else if(번호==2)
			{
				inputSeats(seats,번호,행,열);
			}
			else if(번호==3)
			{
				showSeats(seats);
			}
			else if(번호==0)
			{
				break;
			}
		}
	}//main
	
}//class
