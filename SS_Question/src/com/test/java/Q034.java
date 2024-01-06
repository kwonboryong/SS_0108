package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Q034 { // 안풀림!!!
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		/* 날짜를 입력받아 아래의 조건에 맞게 결과를 출력하시오.
		   - 입력받은 날짜가 평일이면 해당 주의 토요일을 알아낸다.
		   - 입력받은 날짜가 토/일요일이면 아무것도 안한다. 
		   (토: 7, 일: 1, 월: 2, 화: 3, 수: 4, 목: 5, 금: 6) 
		   
		   0. 필요한 변수 선언
		   1. 라벨 출력
		   2. 입력 받기
		   3. 시각 객체 생성
		   4. 시각 객체 입력값으로 변경(.set)
		   5. 해당 날짜의 요일을 알아낸다 (해당 요일 + n = 토요일(1))
		   6. 출력
		 */
		
		int year = 0;
		int month = 0;
		int day = 0;
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("년: ");
		year = Integer.parseInt(reader.readLine());
		
		System.out.print("월: ");
		month = Integer.parseInt(reader.readLine());
		
		System.out.print("일: ");
		day = Integer.parseInt(reader.readLine());
		
		
		Calendar now = Calendar.getInstance(); // 현재 시각
		now.set(year, month, day); // 입력 시각으로 변경
		
		int week = now.get(Calendar.DAY_OF_WEEK); // 요일
		
		
		if (week >= 2 && week <= 6) {
			System.out.println("입력하신 날짜는 '평일'입니다.\n해당 주의 토요일로 이동합니다.");

			now.add(Calendar.DATE, (7 - Calendar.DAY_OF_WEEK));
			System.out.printf("이동한 날짜는 '%tF'입니다.", now);
			
		} else { // 주말
			System.out.println("입력하신 날짜는 '휴일(토/일)'입니다.\n결과가 없습니다.");
		}
		
	}

}
