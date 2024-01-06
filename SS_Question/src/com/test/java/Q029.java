package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q029 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		/* 숫자 2개와 연산자 1개를 입력받아 연산 과정과 결과를 출력
		   - 정수만 입력하시오.(유효성 검사 필요없음)
		   - 나머지 연산 결과는 소수이하 첫째자리까지 출력
		   - 연산자는 산술 연산자(+, -, *, /, %)만 입력
		 */
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("첫 번째 숫자: ");
		int num1 = Integer.parseInt(reader.readLine());
		
		System.out.print("두 번째 숫자: ");
		int num2 = Integer.parseInt(reader.readLine());
		
		System.out.print("연산자: ");
		String cal = reader.readLine(); // 문자열
		
		
		String plus = "+";
		String minus = "-";
		String mult = "*";
		String div = "/";
		String rem = "%";
		
		
		if (cal.equals(plus)) { // 덧셈
			int plus2 = num1 + num2;
			System.out.printf("%d + %d = %d", num1, num2, plus2);
			
		} else if (cal.equals(minus)) { // 뺄셈
			int minus2 = num1 - num2;
			System.out.printf("%d - %d = %d", num1, num2, minus2);
			
		} else if (cal.equals(mult)) { // 곱셈
			int mult2 = num1 * num2;
			System.out.printf("%d * %d = %d", num1, num2, mult2);
			
		} else if (cal.equals(div)) { // 나눗셈 (*반올림한 숫자로 출력 = 피연산자를 double형으로 바꾸기)
			double div2 = (double)num1 / num2;
			System.out.printf("%d / %d = %.1f", num1, num2, div2);
			
		} else if (cal.equals(rem)) { // 나머지
			double rem2 = num1 % num2;
			System.out.printf("%d %% %d = %.1f", num1, num2, rem2);
			
		} else {
			System.out.println("연산이 불가능합니다.");
			
		}
		
	}

}
