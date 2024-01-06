package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q015 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		/* 사과 나무 씨앗을 심을 날로부터 특정 시간이 흘렀을 때, 사과 총 몇 개가 열리는지 구하는 메소드를 선언하시오.
		1. 라벨 출력
		2. 입력 받기
		- BufferedReader
		- readLine();
		3. 메서드 생성 - 맑은날 입력 * 5, 흐린날 입력 * 2, 나무 == 100일때 사과 1개, 10센치에 1개씩 열림
		4. 메서드 호출
		5. 출력
		*/
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("맑은 날: ");
		int sunny = Integer.parseInt(reader.readLine());
		
		System.out.print("흐린 날: ");
		int foggy = Integer.parseInt(reader.readLine());
		
		getApple(sunny, foggy);
		
	}

	
	private static int getApple(int sunny, int foggy) {
		 
		int tree = (sunny * 5) + (foggy * 2);
		
		int apple = (tree >= 100) ? ((tree - 100) / 10) : 0; 
		// *** 나무 >= 100일 때부터 사과 1개, 10센치에 1개씩 열림 (예. 195 -> 사과 9개 => tree - 100 / 10해서 10의 단위만 셈)
		
		System.out.printf("사과가 총 %d개 열렸습니다.", apple);
		return apple;
		
	}
}
