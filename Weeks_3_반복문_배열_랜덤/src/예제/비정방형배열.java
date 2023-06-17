package 예제;
import java.util.Scanner;
public class 비정방형배열 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*		 * int[][] i=new int[4][]; //*인덱스랑 생성이랑 헷갈리지 않기. i[0]=new int[1];//1번째 행에 1개의 열
		 * i[1]=new int[2];//2번째 행에 2개의 열 i[2]=new int[3];//3번째 행에 3개의 열 i[3]=new
		 * int[4];//4번째 행에 4개의 열
		 * 
		 * //length System.out.println(i.length);//i의 행의 갯수->4개.
		 * System.out.println(i[0].length);//i의 첫 번째 행의 열의 갯수->1
		 * System.out.println(i[1].length);//i의 2 번째 행의 열의 갯수->2
		 * System.out.println(i[2].length);//i의 3 번째 행의 열의 갯수->3
		 * System.out.println(i[3].length);//i의 4 번째 행의 열의 갯수->4
		 * */
		  
		//비정방형 배열의 생성과 접근 
		int[][] arr= {{10,20,30},{20,21},{30,31,32},{40,41}};//소괄호	x 중괄호 o 
		//행마다 열크기를 3열,2열,3열,2열로 주고 반복문을 이용해 값 넣기 
		arr[1]=new int[2]; 
		arr[2]=new int[3]; 
		arr[3]=new int[2]; 
		arr[0]=new int[3];
		 
		Scanner in=new Scanner(System.in);
		for(int j=0;j<arr.length;j++)
			{
				for(int k=0;k<arr[j].length;k++)
					{
						System.out.printf("arr[%d][%d]를 입력하세요: ",j,k);
						arr[j][k]=in.nextInt();
						in.nextLine();
					}
			}
		//1,3=>열 2개
		for(int i=0;i<4;i++)
		{	
			if(arr[i].length<3)
				System.out.println("  "+arr[i][0]+"|  "+arr[i][1]+"|  ");	
			else
				System.out.println("  "+arr[i][0]+"|  "+arr[i][1]+"|  "+arr[i][2]);	
			
			if(i!=3)
			{
				System.out.println("----|----|----");//이 부분은 3번만 반복됨.
			}
		}
	}//main
}//class
