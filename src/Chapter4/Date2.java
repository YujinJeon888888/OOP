package Chapter4;

public class Date2 {
    private int 연도;
    private int 월;
    private int 일;
    
    	
    public Date2() {
    	
    }
    public void setDate2(int year,int month,int day) {
    	연도=year;
    	월=month;
    	일=day;
    }
    public void print1(){
    	System.out.println(연도+"년 "+월+"월 "+일+"일 ");
    }

    public void print2(){
    	if(월==1)
    		System.out.print("January ");
    	if(월==2)
    		System.out.print("Fabruary ");
    	if(월==3)
    		System.out.print("March ");
    	System.out.println(일+","+연도);
    }

}
