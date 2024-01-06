package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q013 {
	public static void main(String[] args) throws IOException {
		
		/* 국어, 영어, 수학 점수를 전달하면 '합격' 혹은 '불합격'이라는 단어를 반환하는 메소드를 선언하시오.
		1. 라벨 출력
		2. 입력 받기
		- BufferedReader
		- readLine();
		3. 메서드 생성 : 평균 점수 60점 이상은 '합격', 60점 미만은 '불합격', 과락: 한 과목 이상 40점 미만이면 불합격 (평균 = total / 3)
		4. 메서드 호출
		5. 출력	*/
		

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("국어: ");
		int kor = Integer.parseInt(reader.readLine());
		
		System.out.print("영어: ");
		int eng = Integer.parseInt(reader.readLine());
		
		System.out.print("수학: ");
		int math = Integer.parseInt(reader.readLine());
		
		
		test(kor, eng, math);
		
	}

	
	private static String test(int kor, int eng, int math) {
		
		int total = kor + eng + math; // 합계
		int avg = total / 3; // 평균
		
		String result = avg >= 60 ? "합격" : "불합격";
		
		
		System.out.printf("%s입니다.", result);
		return result;
	
	}
}
