package ����;
import java.util.*;
public class _2���迭 {
	  public static void main(String[] args) { 
	int n,m; 
	    int pr = 1; 
	    int[][] arr=new int[100][100];
	    Scanner in=new Scanner(System.in);
	    n=in.nextInt();
	    m=in.nextInt();
	    for(int i=0;i<n+m-1;i++) // i�� n + m - 1 ���� (�밢���� ��)
	    {
	        for(int j=0;j<m;j++) // j�� m���� 
	        {
	            for(int k=0;k<n;k++)// k�� n ���� 
	            {
	                if(j+k == i) // j+k index ���� i�� ������ 
	                {
	                   arr[k][j] = pr++; // arr�迭�� pr�� ���� �� ���� 
	                   break;
	                }
	            }
	        }
	    } 

	    //2���� �迭 ��� 
	    for(int i=0;i<n;i++){
	        for(int j=0;j<m;j++){
	            System.out.printf("%d ",arr[i][j]);
	        }
	        System.out.printf("\n");
	    }
	  }
	}

