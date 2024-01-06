package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Q022 {
	public static void main(String[] args) throws IOException {
		
		// 남녀 커플의 이름과 만난날을 입력받아 기념일을 출력하시오.
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("남자 이름: ");
		String nameMan = reader.readLine();
		
		System.out.print("여자 이름: ");
		String nameWoman = reader.readLine();

		
		System.out.print("만난 날(년): ");
		int year = Integer.parseInt(reader.readLine());
		
		System.out.print("만난 날(월): ");
		int month = Integer.parseInt(reader.readLine());
		
		System.out.print("만난 날(일): ");
		int day = Integer.parseInt(reader.readLine());

		
		System.out.printf("'%s'과(와) '%s'의 기념일\n", nameMan, nameWoman);
		
		
		Calendar hundred = Calendar.getInstance(); // 현재 시각
		
		hundred.add(Calendar.DATE, 100); // 100일 날짜 계산
		System.out.printf("100일: %tF\n", hundred); // %tF => 2024-04-15 식으로 출력
		
		
		Calendar two_h = Calendar.getInstance();
		
		two_h.add(Calendar.DATE, 200); 
		System.out.printf("200일: %tF\n", two_h); 
		
		
		Calendar three_h = Calendar.getInstance();
		
		three_h.add(Calendar.DATE, 300); 
		System.out.printf("300일: %tF\n", three_h); 
		
		
		Calendar five_h = Calendar.getInstance();
		
		five_h.add(Calendar.DATE, 500); 
		System.out.printf("500일: %tF\n", five_h); 
		
		
		Calendar thousand = Calendar.getInstance();
		
		thousand.add(Calendar.DATE, 1000); 
		System.out.printf("1000일: %tF\n", thousand); 
		
	}

}
