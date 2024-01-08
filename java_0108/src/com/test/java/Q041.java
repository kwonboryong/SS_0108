package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q041 {
	public static void main(String[] args) throws NumberFormatException, IOException {


		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("시작 숫자: ");
		int start = Integer.parseInt(reader.readLine());
		
		System.out.print("종료 숫자: ");
		int end = Integer.parseInt(reader.readLine());
		
		
		int sum = 0; // 누적 변수
	
		
		for (int i = start; i <= end; i++) {
				sum += i; // 합
		
			if (sum >= 1000) { // 누적값이 1000을 넘어가는 순간 루프 종료
				System.out.printf("%d", i);
				System.out.printf(" = %d", sum);
				break;
			} else {
				System.out.printf("%d + ", i);
			}
			
		}
	}
}
