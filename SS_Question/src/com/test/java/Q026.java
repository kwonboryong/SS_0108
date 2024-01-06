package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q026 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		/* 학생의 국어 점수를 입력받아 성적을 출력하시오.
		   1. 라벨 출력
		   2. 입력 받기
		   3. 중첩 조건문 - 유효성 검사, 등급
		   4. 출력 */
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("점수: ");
		int score = Integer.parseInt(reader.readLine());
		
		
		if (score >= 0 && score <= 100) {
			
			if (score >= 90 && score <= 100) {
				System.out.printf("입력한 %d점은 성적 A입니다.\n", score);
			} else if (score >= 80 && score < 90) {
				System.out.printf("입력한 %d점은 성적 B입니다.\n", score);
			} else if (score >= 70 && score < 80) {
			System.out.printf("입력한 %d점은 성적 C입니다.\n", score);
			} else if (score >= 60 && score < 70) {
				System.out.printf("입력한 %d점은 성적 D입니다.\n", score);
			} else if (score >= 0 && score < 60) {
				System.out.printf("입력한 %d점은 성적 F입니다.\n", score);
			} 
		} else {
			System.out.println("점수가 올바르지 않습니다. 0 ~ 100 사이의 값을 입력하시오.");
		}
		
	}
	
}
