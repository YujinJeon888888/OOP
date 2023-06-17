package Chapter4;

public class Date {
	private int year;
	private int month;
	private int day;

	public void setDate(int year,int month, int day){
		this.year=year;
		this.month=month;
		this.day=day;
	}

	public void print1(){
		System.out.println(year+"³â"+month+"¿ù"+day+"ÀÏ");
	}
	public void print2(){
		System.out.println(year+"."+month+"."+day);
	}
	public static void main(String[]args) {
		Date obj=new Date();
		obj.setDate(2002,6,21);
		System.out.println("print1");
		obj.print1();
		System.out.println("print2");
		obj.print2();
	}
}
