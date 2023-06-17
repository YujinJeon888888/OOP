package ¿¹Á¦;
import java.util.Random;
public class setArray_random {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	}



public static void setArray(int [] ar,int start, int end){
		Random r=new Random();
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=(int)(Math.random()*1000)%(end-start+1)+start;
		}
}

}