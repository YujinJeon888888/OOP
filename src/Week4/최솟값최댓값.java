package Week4;
import java.util.*;
public class 譆歐高譆渤高 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray=new int[5];
		int value;
		int max=0;
		int min=99999;
		Scanner in=new Scanner(System.in);
		
		for(int i=0;i<5;) {
			System.out.print("["+i+"]: ");
			value=in.nextInt();
			if(value<0)
				continue;
			intArray[i]=value;
			if(intArray[i]<min)
				min=intArray[i];
			if(intArray[i]>max)
				max=intArray[i];
			i++;
		}
		
		System.out.println("譆渤高: "+max+" 譆歐高: "+min);
	}

}
