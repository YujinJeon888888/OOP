package Chapter4;

public class Date2 {
    private int ����;
    private int ��;
    private int ��;
    
    	
    public Date2() {
    	
    }
    public void setDate2(int year,int month,int day) {
    	����=year;
    	��=month;
    	��=day;
    }
    public void print1(){
    	System.out.println(����+"�� "+��+"�� "+��+"�� ");
    }

    public void print2(){
    	if(��==1)
    		System.out.print("January ");
    	if(��==2)
    		System.out.print("Fabruary ");
    	if(��==3)
    		System.out.print("March ");
    	System.out.println(��+","+����);
    }

}
