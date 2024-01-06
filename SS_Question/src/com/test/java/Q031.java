package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q031 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		/* 숫자 5개를 입력받아 짝수와 홀수의 개수를 출력하시오.
		   - 짝수: num % 2 = 0 / 홀수: num % 2 != 0
		   - 개수: ++짝수; / ++홀수; */

		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("숫자 입력: ");
		int num1 = Integer.parseInt(reader.readLine());
		System.out.print("숫자 입력: ");
		int num2 = Integer.parseInt(reader.readLine());
		System.out.print("숫자 입력: ");
		int num3 = Integer.parseInt(reader.readLine());
		System.out.print("숫자 입력: ");
		int num4 = Integer.parseInt(reader.readLine());
		System.out.print("숫자 입력: ");
		int num5 = Integer.parseInt(reader.readLine());
		
		
		int even = 0; // 짝수 개수
		int odd = 0; // 홀수 개수
		
		
		if (num1 % 2 == 0) { // num1이 짝수면
			++even;          // 짝수 개수 누적
		} else if (num1 % 2 != 0) { // num1이 홀수면
			++odd;                  // 홀수 개수 누적
		}
		
		if (num2 % 2 == 0) {
			++even;
		} else if (num2 % 2 != 0) {
			++odd;
		}
		
		if (num3 % 2 == 0) {
			++even;
		} else if (num3 % 2 != 0) {
			++odd;
		}
		
		if (num4 % 2 == 0) {
			++even;
		} else if (num4 % 2 != 0) {
			++odd;
		}
		
		if (num5 % 2 == 0) {
			++even;
		} else if (num5 % 2 != 0) {
			++odd;
		}
		
		System.out.printf("짝수는 %d개 홀수는 %d개 입력했습니다.\n", even, odd);
		System.out.printf("홀수가 짝수보다 %d개 더 많습니다.", odd - even);
		
	}

}
