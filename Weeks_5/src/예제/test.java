package ¿¹Á¦;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
	}
	public static void draw_star(int h,int n){
if (n==1)
{
	for(int i=0; i<h; i++){
					
					for(int k=0; k<i; k++)
						System.out.print(" "); //ºó Ä­
					
					
					for(int k=0; k<h-i; k++)			
						System.out.print("* "); 
					
					System.out.println();
				}
			}
	}
}
