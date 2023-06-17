package 백준;
	import java.util.Scanner;

	public class 열개씩끊어출력 {
	    public static void main(String args[]) {
	        
	        Scanner input =new Scanner(System.in);
	        
	        String str="";  //문자열을 저장할 String
	        str=input.nextLine();
	        
	        for(int i=0; i<str.length(); i++){
	            
	            System.out.print(str.charAt(i));
	            if(i%10==9 ) System.out.println();
	            
	        }
	        
	        System.out.println("--------------------------------------------------------------");
	        char [] ar=str.toCharArray();  //String 을 문자배열로 변환!
	        
	        for(int i=0; i<str.length(); i++){
	            
	            System.out.print(ar[i]);
	            if(i%10==9) System.out.println();
	        }
	        
	        
	        
	       
	        
	  
	     
	    }

	}

