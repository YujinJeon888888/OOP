package Week4;
import java.util.*;
public class 극장예약시스템 {
	static Scanner in=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		메뉴();
	}

	private static void 메뉴() {
		// TODO Auto-generated method stub
		int num;
		int[][] seats=new int[10][10];
		welCome();
		while(true) {
			System.out.println("============================");
			System.out.println("1. 예약하기, 2. 취소하기, 3. 좌석보이기, 0. 그만하기");
			System.out.println("============================");
			num=in.nextInt();
			
			if(num==1) {
				예약하기(seats);
			}
			if(num==2) {
				취소하기(seats);
			}
			if(num==3) {
				좌석보이기(seats);
			}
			if(num==4) {
				break;
			}
			
		}
	}

	private static void welCome() {
		System.out.println("**************************************");
		System.out.println("         Welcome to Ewha Movie");
		System.out.println("**************************************");
	}

	private static void 좌석보이기(int seats[][]) {
		// TODO Auto-generated method stub
		for(int row=0;row<seats.length;row++) {
			for(int col=0;col<seats[row].length;col++)
				{
				if(seats[row][col]==1)
					System.out.print("■ ");
				else if(seats[row][col]==0)
					System.out.print("□ ");
				}
			System.out.println();
		}
	}

	private static void 취소하기(int seats[][]) {
		// TODO Auto-generated method stub
		int row,col;
		while(true) {
			System.out.print("취소할 행: ");
			row=in.nextInt();
			
			if(row<0||row>seats.length-1) {
				System.out.println("그런 행은 없습니다.");
				continue;
			}
			System.out.print("취소할 열: ");
			col=in.nextInt();
			if(col<0||col>seats[row].length-1) {
				System.out.println("그런 열은 없습니다.");
				continue;
			}
			if(seats[row][col]==0) {
				System.out.println("이미 없는 자리입니다.");
				continue;
			}
			else//예외사항에 걸리지 않으면 반복 종료
				break;
		}
		seats[row][col]=0;
	}

	private static void 예약하기(int seats[][]) {
		// TODO Auto-generated method stub
		int row,col;
		while(true) {
			System.out.print("예약할 행: ");
			row=in.nextInt();
			
			if(row<0||row>seats.length-1) {
				System.out.println("그런 행은 없습니다.");
				continue;
			}
			System.out.print("예약할 열: ");
			col=in.nextInt();
			if(col<0||col>seats[row].length-1) {
				System.out.println("그런 열은 없습니다.");
				continue;
			}
			if(seats[row][col]==1) {
				System.out.println("이미 예약된 자리입니다.");
				continue;
			}
			else//예외사항에 걸리지 않으면 반복 종료
				break;
		}
		seats[row][col]=1;
	}

}
