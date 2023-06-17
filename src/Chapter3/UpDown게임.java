package Chapter3;
import java.util.Scanner;
public class UpDown°ÔÀÓ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int computer=(int)Math.random()*100+1;
		System.out.print("¼ö¸¦ ¸ÂÃçº¸¼¼¿ä(1~100): ");
		int num;
		Scanner in=new Scanner(System.in);
		int ½ÃµµÈ½¼ö=1;
		while(true)
		{	
			num=in.nextInt();
			in.nextLine();
			if(num>computer)
				System.out.println("down!");
			if(num<computer)
				System.out.println("up!");
			
			if(num==computer)
				{
				System.out.println("¸ÂÇû½À´Ï´Ù");
				break;}
			½ÃµµÈ½¼ö++;		
		}
	System.out.println("½ÃµµÈ½¼ö: "+½ÃµµÈ½¼ö);
	}
	

}
