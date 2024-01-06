package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q025 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		/* 숫자 2개를 입력받아 큰수와 작은수를 출력하시오.
		   - 두 숫자가 얼마의 차이를 보이는지 출력하시오.
		   
		   1. 라벨 출력
		   2. 입력 받기
		   3. 조건문 이용 + 연산(큰 수 - 작은 수)
		   4. 출력 */
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("첫 번째 숫자: ");
		int first = Integer.parseInt(reader.readLine());
		
		System.out.print("두 번째 숫자: ");
		int second = Integer.parseInt(reader.readLine());
		
		
		if (first > second) {
			int gab = first - second;
			System.out.printf("큰 수는 %d이고, 작은 수는 %d입니다. 두 숫자는 %d(가)이 차이납니다.", first, second, gab);
		} else if (first < second) {
			int gab = second - first;
			System.out.printf("큰 수는 %d이고, 작은 수는 %d입니다. 두 숫자는 %d(가)이 차이납니다.", second, first, gab);
		} else {
			System.out.println("두 숫자는 동일합니다.");
		}
		
	}
	
}
