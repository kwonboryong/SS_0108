package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q027 {
	public static void main(String[] args) throws IOException {
		
		/* 문자 1개를 입력받아 아래와 같이 출력하시오.
		   - f, F → Father
		   - m, M → Mother
		   - s, S → Sister
		   - b, B → Brother
		   - 유효성 검사를 하시오.(위의 문자가 아닌 문자는 예외 처리)
		   
		   1. 라벨 출력
		   2. 입력 받기: reader.read(); -> 유니코드 값으로 출력됨
		   3. 유효성 검사: 위 문자만 입력 가능
		   4. 출력 */
		

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("문자: ");
		int word = reader.read();
		
		
		if (word == 70 || word == 102) {
			System.out.println("Father");
		} else if (word == 77 || word == 109) {
			System.out.println("Mother");
		} else if (word == 83 || word == 115) {
			System.out.println("Sister");
		} else if (word == 66 || word == 98) {
			System.out.println("Brother");
		} else {
			System.out.println("입력한 문자가 올바르지 않습니다.");
		}
		
	}
	
}
