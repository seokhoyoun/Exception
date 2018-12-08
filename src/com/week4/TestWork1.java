package com.week4;

import java.util.Calendar;

public class TestWork1 {
	

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH)+1;
		int date = today.get(Calendar.DATE);
		int hour = today.get(Calendar.HOUR);
		int minute = today.get(Calendar.MINUTE);
		int second = today.get(Calendar.SECOND);
		int day = today.get(Calendar.DAY_OF_WEEK);
		String sday = null;
		
		switch(day) {
		case 1 : sday = "일요일"; break;
		case 2 : sday = "월요일"; break;
		case 3 : sday = "화요일"; break;
		case 4 : sday = "수요일"; break;
		case 5 : sday = "목요일"; break;
		case 6 : sday = "금요일"; break;
		case 7 : sday = "토요일"; break;
		}
		System.out.printf("%d년 %d월 %d일 %s %d시 %d분 %d초 ",year,month,date,sday,hour,minute,second);
	}

}
