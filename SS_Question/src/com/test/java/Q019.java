package com.test.java;

import java.util.Calendar;

public class Q019 {
	public static void main(String[] args) {
		
		
		nowTime();
		
	}
	

	private static void nowTime() {

		Calendar c = Calendar.getInstance();
		
		System.out.printf("현재 시간: %d시 %d분 %d초\n"
				, c.get(Calendar.HOUR_OF_DAY)
				, c.get(Calendar.MINUTE)
				, c.get(Calendar.SECOND));
		
		System.out.printf("현재 시간: %s %d시 %d분 %d초"
				, c.get(Calendar.AM_PM) == 0 ? "오전" : "오후"
				, c.get(Calendar.HOUR_OF_DAY)
				, c.get(Calendar.MINUTE)
				, c.get(Calendar.SECOND));

	}
	
}
