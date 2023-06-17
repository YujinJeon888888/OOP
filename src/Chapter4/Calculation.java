package Chapter4;
//¿À¹ö·Îµù ¿º
public class Calculation {
    private int x;
    private int y;
    private int z;
    public Calculation(){
    	
    }
    public int sum(int a,int b,int c){
    	x=a;
    	y=b;
    	z=c;
    	return x+y+z;
    }
    public int sum(int a,int b){
    	x=a;
    	y=b;
    	
    	return x+y;
    }
    public static void main(String[]args) {
    	Calculation a=new Calculation();
    	
    	System.out.println(a.sum(10, 20,30));
    	System.out.println(a.sum(10, 20));
    	
    }
}
