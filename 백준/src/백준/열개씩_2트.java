package 백준;
import java.util.Scanner;
public class 열개씩_2트
{
	static Scanner in=new Scanner(System.in);
    public static void main(String[] args)
    {
    	String s="";
    	s=in.nextLine();
    	
    	for(int i=0;i<s.length();i++)
    	{
    		System.out.print(s.charAt(i));
    		if((i+1)%10==0)
    			System.out.println();
    	}
        
    }
}
