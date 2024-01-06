package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Q021 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		/* 태어난 년도를 입력하면 나이를 출력하시오.
		 
		   - 올해를 기준으로 나이를 계산
		   - 내년, 내후년에 실행해도 그때에 맞는 나이를 출력 -> 현재 시간 이용
		   
		   - 나이: 현재 년도 - 태어난 년도 + 1 (우리나라식) */

		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.print("태어난 년도: "); // 생일 입력 받기
		int born = Integer.parseInt(reader.readLine());
		
		
		Calendar now = Calendar.getInstance(); // 현재 시각 생성
		
		int age = (now.get(Calendar.YEAR) - born) + 1; // 나이: 현재 년도 - 태어난 년도 + 1 (한국식)
		System.out.printf("나이: %d세", age);

	}
	
}
