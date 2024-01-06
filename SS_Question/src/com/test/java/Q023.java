package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Q023 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		/* 아빠와 딸의 생일을 입력받아 아빠가 딸보다 며칠을 더 살았는지 출력하시오.
		 
		 1. 라벨 출력
		 2. 입력 받기 - 아빠 생년월일, 딸 생년월일
		 3. 연산
		 - (1) 현재 시각 생성
		 - (2) 각자 생일로 날짜 수정
		 - (3) Epoch Time 사용 (아빠 생일, 딸 생일)
		 - (4) 연산 (*딸의 생일 누적초 - 아빠의 생일 누적초)
		 4. 출력(단위 수정: 일) */

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.print("아빠 생일(년): ");
		int yearDad = Integer.parseInt(reader.readLine());
		
		System.out.print("아빠 생일(월): ");
		int monthDad = Integer.parseInt(reader.readLine());
		
		System.out.print("아빠 생일(일): ");
		int dayDad = Integer.parseInt(reader.readLine());
		
		
		System.out.print("딸 생일(년): ");
		int yearDaughter = Integer.parseInt(reader.readLine());
		
		System.out.print("딸 생일(월): ");
		int monthDaughter = Integer.parseInt(reader.readLine());
		
		System.out.print("딸 생일(일): ");
		int dayDaughter = Integer.parseInt(reader.readLine());
		
		
		Calendar dad = Calendar.getInstance(); // (1) 현재 시각 생성
		dad.set(1971, 5, 10); // (2) 생일로 날짜 수정
		
		Calendar daughter = Calendar.getInstance();
		daughter.set(1999, 7, 22);
		
		long gab = (daughter.getTimeInMillis() - dad.getTimeInMillis()); // (4) 연산
		
		
		System.out.printf("아빠는 딸보다 총 %,d일을 더 살았습니다.", gab / 1000 / 60 / 60 / 24); // 단위 수정
		
	}

}
