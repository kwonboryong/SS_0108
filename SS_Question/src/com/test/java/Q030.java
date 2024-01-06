package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q030 {
	public static void main(String[] args) throws IOException {
		
		/* 영문자 1개를 입력받아 대/소문자 변환을 한 뒤 출력하시오.
		  - 유효성 검사를 하시오.(영문자만 입력 가능)
		  - 영소문자와 대문자 값의 차이: 32
		 */

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("문자: ");
		int code = reader.read(); // 유니코드 값
		
		
		if (code >= 97 && code <= 122) {
			int code2 = code - 32;
			System.out.printf("'%c의 대문자는 '%c'입니다.", code, code2);
			
		} else if (code >= 65 && code <= 90) {
			int code2 = code + 32;
			System.out.printf("'%c의 소문자는 '%c'입니다.", code, code2);
			
		} else {
			System.out.println("영문자만 입력하시오.");
			
		}
		
	}

}
