package ����;
	import java.util.Scanner;

	public class ������������� {
	    public static void main(String args[]) {
	        
	        Scanner input =new Scanner(System.in);
	        
	        String str="";  //���ڿ��� ������ String
	        str=input.nextLine();
	        
	        for(int i=0; i<str.length(); i++){
	            
	            System.out.print(str.charAt(i));
	            if(i%10==9 ) System.out.println();
	            
	        }
	        
	        System.out.println("--------------------------------------------------------------");
	        char [] ar=str.toCharArray();  //String �� ���ڹ迭�� ��ȯ!
	        
	        for(int i=0; i<str.length(); i++){
	            
	            System.out.print(ar[i]);
	            if(i%10==9) System.out.println();
	        }
	        
	        
	        
	       
	        
	  
	     
	    }

	}

