package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q012 {
	public static void main(String[] args) throws NumberFormatException, IOException{

		/* 숫자를 전달하면 '짝수' 혹은 '홀수' 라는 단어를 반환하는 메소드를 선언하시오. 
		1. 라벨 출력
		2. 입력 받기
		- BufferedReader
		- readLine();
		3. 메서드 생성 - 나머지(%) 연산자를 이용한 연산 메서드 
		(2로 나눴을 때 나머지가 있으면 홀수, 나머지가 없으면 짝수)
		4. 메서드 호출
		5. 출력	*/

		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("숫자: ");
		int num = Integer.parseInt(reader.readLine()); // 문자열 -> 숫자
		
		
		getNumber(num); // 메서드 호출

	}
	
	
	private static String getNumber(int num) {

		String result = num % 2 == 0 ? "짝수" : "홀수";
		System.out.printf("입력하신 숫자 '%d'는(은) '%s'입니다.\n", num, result);
		
		return result;
	}
	
}
