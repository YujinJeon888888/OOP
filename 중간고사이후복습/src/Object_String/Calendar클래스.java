package Object_String;

import java.util.Calendar;

public class Calendar클래스 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Calender은 추상클래스->new Calender로 생성 불가능. gerInstance()로 생성!
		//메소드명이 gerInstance()일 뿐 싱글톤 아님
		
		Calendar now=Calendar.getInstance();
		int year=now.get(Calendar.YEAR);
		int month=now.get(Calendar.MONTH)+1;//now에 저장된 달. 달은 0~11이라서 +1함
		
		Calendar first=Calendar.getInstance();
		
		first.clear();//현재 날짜와 시간 정보를 모두 지움
		first.set(2022, 0,1);//2022년 1월 1일
		first.set(Calendar.HOUR_OF_DAY,20);//저녁 8시로 설정
		first.set(Calendar.MINUTE,30);//30분으로 설정
		System.out.println(first.getTime());
	}
}
