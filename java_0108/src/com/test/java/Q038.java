package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q038 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// 입력 횟수(N)와 숫자 N개를 입력받아 짝수의 합과 홀수의 합을 각각 출력하시오.
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int sum = 0;
		
		System.out.print("입력 횟수: ");
		int count = Integer.parseInt(reader.readLine());
		
		
		int even = 0; // 짝수 개수
		int add = 0; // 홀수 개수
		
		int evenSum = 0; // 짝수 합
		int addSum = 0; // 홀수 합
		
		
		for(int i = 0; i < count; i++) {
			
			System.out.print("숫자: ");
			int num = Integer.parseInt(reader.readLine());

			
			if (num % 2 == 0) { // 짝수면 짝수의 갯수 셈
				++even;
				evenSum += num; // 짝수 합 누적
			} else { // 홀수 갯수
				++add;
				addSum += num;  // 짝수 합 누적
			}

		}
		
		
		System.out.printf("짝수 %d개의 합: %d\n", even, evenSum);
		System.out.printf("홀수 %d개의 합: %d", add, addSum);
		
	}

}
