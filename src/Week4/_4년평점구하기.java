package Week4;

public class _4년평점구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double [][]score= {
				{3.3,3.4},//1학년 1,2학기
				{3.5,3.6},//2학년
				{3.7,4.0},//3학년
				{4.1,4.2}
		};
		double sum=0;
		for(int year=0;year<score.length;year++) {//행
			for(int term=0;term<score[year].length;term++)//열
			{
				sum+=score[year][term];//전체 평점 합
			}
		}
		
		int n=score.length;//배열의 행 갯수
		int m=score[0].length;//배열의 열 갯수
		System.out.println("4년 전체 평점의 평균은 "+ sum/(n*m));
	}


}
