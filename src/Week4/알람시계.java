package Week4;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class 알람시계 {
	public static void main(String [] args) throws IOException{
		//방법1
		Scanner input =new Scanner(System.in); //효율은 낮지만 아직 편한 Scanner를 이용한다.
		int H,M;        
		H=input.nextInt();
		M=input.nextInt();

		//방법2 : BufferedReader + String의 split를 사용한다.
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//String [] str= br.readLine().split(" ");
		//int H = Integer.parseInt(str[0]);
		//int M = Integer.parseInt(str[1]);

		//방법3 : BufferedReader + StringTokenizer를 사용한다.
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//StringTokenizer st = new StringTokenizer(br.readLine()," "); //공백을 기준으로 분리되어 있다.
		//int H = Integer.parseInt(st.nextToken());
		//int M = Integer.parseInt(st.nextToken());       


		if(M>=45) M-=45; //M이 45이상이면 단순히 빼주고        
		else { 
			M =  M - 45 + 60;  // 그렇지 않다면 45를 빼주고 60분을 더한다.
			H -=1;             // 시간은 하나 줄인다.
		}                
		if(H<0) H=23;        //반례!  H가 0이었다면, 시간이 -1이 되므로, 23시로 수정한다
		System.out.print(H + " " + M);  //양식대로 출력. 야호!
	}   
}
