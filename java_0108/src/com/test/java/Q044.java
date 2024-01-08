package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q044 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		

		int sum = 0; // 누적 변수
		String text = "";
		
		
		for (;;) {
			System.out.print("숫자: ");
			int num = Integer.parseInt(reader.readLine());
			
			
			if (num % 2 == 0) { // 짝수
				sum += num;
				text += " + " + num;
				
			} else { 
				sum -= num; // 홀수
				text += " - " + num;
			}
			
			
			if (sum >= 100) { // 누적값이 100을 넘어가는 순간 루프 종료
					break;			
			}
				
		}
		
		System.out.printf(text + " = " + sum);

	}
}

