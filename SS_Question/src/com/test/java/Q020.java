package com.test.java;

import java.util.Calendar;

public class Q020 {
	public static void main(String[] args) {
		
		// 오늘 태어난 아이의 백일과 첫돌을 출력하시오.
		
		
		Calendar hundred = Calendar.getInstance(); // 현재 시간 생성

		hundred.set(2024, 03, 15); // 특정 날짜로 수정
		System.out.printf("백일: %tF\n", hundred);
		
		
		Calendar one_year = Calendar.getInstance(); // 현재 시간 생성
		
		one_year.set(2025, 00, 06); // 특정 날짜로 수정
		System.out.printf("첫돌: %tF\n", one_year);
		
	}
	
}
