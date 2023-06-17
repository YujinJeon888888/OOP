package chapter7;

import java.util.Calendar;

public class Calendar클래스 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar d=Calendar.getInstance();
		System.out.println(d);
		System.out.println(d.get(Calendar.YEAR)+"년");
		System.out.println(d.get(Calendar.MONTH)+1+"월");
		System.out.println(d.get(Calendar.DATE)+"일");
		
		d.set(Calendar.HOUR, 12);
		d.set(Calendar.MINUTE, 34);
		d.set(Calendar.SECOND, 0);
		System.out.println(d);
	}

}
