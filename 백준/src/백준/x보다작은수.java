package 백준;
import java.util.*;
public class x보다작은수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N,x;
		Scanner in=new Scanner(System.in);
		N=in.nextInt();
		x=in.nextInt();
		
		int[] arr= new int[N]; 
		for(int i=0;i<N;i++)
		{
			arr[i]=in.nextInt();
			if(arr[i]<x)
				System.out.print(arr[i]+" ");
		}
		
		
	}

}
