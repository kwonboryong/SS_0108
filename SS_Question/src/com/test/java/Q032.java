package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Q032 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		/* 주차 요금을 계산하시오.
		   - 무료 주차: 30분
		   - 초과 10분당: 2,000원
		   
		   1. 라벨 출력
		   2. 입력 받기
		   3. 들어온/나간 시각 -> Epoch Time 사용
		   4. 두 시각 간의 차 구하기 (단위 환산)
		   5. 연산
		   6. 출력
		 */
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("[들어온 시간]\n");
		System.out.print("시: ");
		int hour_in = Integer.parseInt(reader.readLine());
		System.out.print("분: ");
		int minute_in = Integer.parseInt(reader.readLine());
		
		System.out.print("[나간 시간]\n");
		System.out.print("시: ");
		int hour_out = Integer.parseInt(reader.readLine());
		System.out.print("분: ");
		int minute_out = Integer.parseInt(reader.readLine());
		
		
		Calendar in = Calendar.getInstance();
		in.set(Calendar.HOUR_OF_DAY, hour_in);
		in.set(Calendar.MINUTE, minute_in);
		in.getTimeInMillis();
		
		Calendar out = Calendar.getInstance();
		out.set(Calendar.HOUR_OF_DAY, hour_out);
		out.set(Calendar.MINUTE, minute_out);
		out.getTimeInMillis();
		
		
		long gab = (out.getTimeInMillis() - in.getTimeInMillis()) / 1000 / 60; // 주차한 시간
		int time = (int)gab - 30; // 초과시간 (주차시간 - 무료 주차)
		
		
		if (gab < 30) {
			int money = 0;
			System.out.printf("주차 요금은 %,d입니다.", money);
			
		} else if (gab >= 30) { // 주차한 시간이 30분 이상일 때
			int money = (time / 10) * 2000; // ***초과 요금: 10분 당 2,000원 => (초과시간 / 10) * 2000
			System.out.printf("주차 요금은 %,d입니다.", money);
		} 
		
	}

}
