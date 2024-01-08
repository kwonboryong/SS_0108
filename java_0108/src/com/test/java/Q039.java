package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q039 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("시작 숫자: ");
		int start = Integer.parseInt(reader.readLine());
		
		System.out.print("종료 숫자: ");
		int end = Integer.parseInt(reader.readLine());
		
		
		int sum = 0; // 누적 변수
		
		
		for (int i = start; i <= end; i++) {
				sum += i; // 합
			
			if (i == end) { 
				System.out.printf("%d", i);
				System.out.printf(" = %d", sum);
			} else {
				
				System.out.printf("%d + ", i);
			}
		
		}
		
	}
}

