package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q040 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("시작 숫자: ");
		int start = Integer.parseInt(reader.readLine());
		
		System.out.print("종료 숫자: ");
		int end = Integer.parseInt(reader.readLine());
		
		
		int sum = 0; // 누적 변수
		int even = 0; // 짝수 변수
		int add = 0; // 홀수 변수
		
		
		for (int i = start; i <= end; i++) {
				
				if (i % 2 == 0) { 
					even += i; // 짝수 합 누적
				} else { 
					add += i; // 홀수 합 누적
				}
			
				
			if (i == end) { // 끝 숫자
				System.out.printf("+ %d = %d", i, add - even);
			
			} else if (i % 2 == 0) { // 짝수
				System.out.printf("- %d", i);
				
			} else if (i == start) { // 첫 숫자
				System.out.printf("%d ", i);
				
			} else { // 홀수
				System.out.printf(" + %d ", i);
				
			}
		
		} // for문

	}
}