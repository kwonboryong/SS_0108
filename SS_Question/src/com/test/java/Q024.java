package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Q024 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		/* 여러 배달 음식을 같은 시간에 받기를 원하는 고객이 있다. 고객이 각각의 매장에 몇시에 전화를 해야 모든 음식을 같은 시간에 받을 수 있는지 알려주시오.
		
		 - 전화를 걸면 짜장면은 10분 뒤에, 치킨은 18분 뒤, 피자는 25분 뒤 도착.
		 - 음식을 받기 원하는 시간은 오후 11시 이전에만 가능.(날짜 변경 금지) => 유효성 검사
		 ( 원하는 시간 < 23)
		 
		 1. 라벨 출력
		 2. 입력 받기
		 3. 연산
		 - (1) 현재 시각 생성
		 - (2) 원하는 시각으로 수정 (.set)
		 - (3) 연산: 음식 원하는 시각 - 배달 걸리는 시간
		 - (4) 유효성 검사 -> 못함
		 4. 출력 */

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		
		System.out.println("음식을 받기 원하는 시각");
		
		System.out.print("시: ");
		int time = Integer.parseInt(reader.readLine());
		
		System.out.print("분: ");
		int minute = Integer.parseInt(reader.readLine());

		
		System.out.printf("짜장면: %d시 %d분\n", time, minute - 10);
		System.out.printf("치킨: %d시 %d분\n", time, minute - 18);
		System.out.printf("피자: %d시 %d분", time, minute - 25);
		
	}

}
