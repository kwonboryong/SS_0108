package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q011 {
	public static void main(String[] args) throws IOException {
		
		/* 숫자를 2개 입력받아 연산식을 반환하는 메소드를 선언하시오.
		1. 라벨 받기
		2. 입력 받기
		- bufferedReader
		- reader.read();
		3. 메서드 생성
		4. 메서드 호출 */
		

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		// 라벨 + 입력 받기
		System.out.print("첫번째 숫자: ");
		int first = Integer.parseInt(reader.readLine());
		System.out.print("두번째 숫자: ");
		int second = Integer.parseInt(reader.readLine());
		
		// 메서드 호출
		int result_a = add(first, second); // 덧셈
		System.out.println(result_a);
		
		int result_s = subtract(first, second); // 뺄셈
		System.out.println(result_s);
		
		int result_m = multiply(first, second); // 곱셈
		System.out.println(result_m);
		
		double result_d = divide(first, second); // 나눗셈
		//System.out.println(result_d);
		
		int result_mod = mod(first, second); // 나머지
		System.out.println(result_mod);
		
	}

	// 메서드 선언
	private static int add(int first_num, int second_num) { // 덧셈
		
		int plus = first_num + second_num;
		System.out.printf("%d + %d = ", first_num, second_num);
		
		return plus;
	}

	
	private static int subtract(int first_num, int second_num) { // 뺄셈
		
		int minus = first_num - second_num;
		System.out.printf("%d - %d = ", first_num, second_num);
		
		return minus;
	}
	
	
	private static int multiply(int first_num, int second_num) { // 곱셈

		int mul = first_num * second_num;
		System.out.printf("%d * %d = ", first_num, second_num);
		
		return mul;
	}

	
	private static double divide(int first_num, int second_num) { // 나눗셈

		double div = (double)first_num / second_num;
		System.out.printf("%d / %d = %.1f\n", first_num, second_num, div);
		
		return div;
	}

	
	private static int mod(int first_num, int second_num) { // 나머지

		int mod1 = first_num % second_num;
		System.out.printf("%d %% %d = ", first_num, second_num);
		
		return mod1;
	}
	
}
