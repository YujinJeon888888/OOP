package 백준;
import java.util.*;
public class _2차배열 {
	  public static void main(String[] args) { 
	int n,m; 
	    int pr = 1; 
	    int[][] arr=new int[100][100];
	    Scanner in=new Scanner(System.in);
	    n=in.nextInt();
	    m=in.nextInt();
	    for(int i=0;i<n+m-1;i++) // i는 n + m - 1 까지 (대각선의 합)
	    {
	        for(int j=0;j<m;j++) // j는 m까지 
	        {
	            for(int k=0;k<n;k++)// k는 n 까지 
	            {
	                if(j+k == i) // j+k index 값이 i와 같으면 
	                {
	                   arr[k][j] = pr++; // arr배열에 pr값 대입 후 증가 
	                   break;
	                }
	            }
	        }
	    } 

	    //2차원 배열 출력 
	    for(int i=0;i<n;i++){
	        for(int j=0;j<m;j++){
	            System.out.printf("%d ",arr[i][j]);
	        }
	        System.out.printf("\n");
	    }
	  }
	}

