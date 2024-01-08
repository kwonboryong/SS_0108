package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex22_switch {
	public static void main(String[] args) throws IOException {
		
		/* switch문, switch case문
		   - switch(조건) {
		     case 값;       -> 최소 1개는 있어야 함, 여러개 사용 가능
		        구현부;
		        break;
		     case 값;
		        구현부;
		        break;
		     case 값;
		        구현부;
		        break;
		     default 값;   -> 생략 가능
		        구현부;
		        break;
		   }
		   - 조건: 값(데이터)
		 */
		
		//m1(); 
		//m2();
		//m3();
		m4();
		
//		aaa: -> Label = 코드의 위치를 설명하는 용도 (표지판)
		
		
	}

	
	
	
	
	private static void m4() {
		// 양수, 음수 구분하기
		
		int num = 10;
		
		if (num > 10) {
			System.out.println("양수입니다.");
		} else {
			System.out.println("양수입니다.");
		}
		
		
//		switch (num) {
//			case true:
//				System.out.println("양수입니다.");
//				break;
//			case false:
//				System.out.println("음수입니다.");
//				break;
//		}
		
		
		
	}


	private static void m3() {
		// 요구사항: 사용자 월 입력 -> 해당 월의 마지막 일은?
		
		int lastDay = 0; // 마지막 날
		
		int month = 5;
		
		switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				lastDay = 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				lastDay = 30;
				break;
			case 2:
				lastDay = 28;
				break;
		}
		
		System.out.printf("%d월은 %d일까지 있습니다.", month, lastDay);
		
	}


	private static void m2() throws IOException {
		// 요구사항: 자판기 =  메뉴 출력 -> 음료 선택 -> 가격 출력
		// -> 가격 변동: 앞으로 평생 콜라와 사이다의 가격을 동일하게 판매
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("=================================");
		System.out.println("	     자판기");
		System.out.println("=================================");
		System.out.println("1. 콜라");
		System.out.println("2. 사이다");
		System.out.println("3. 박카스");
		System.out.println("---------------------------------");
		System.out.print("번호 선택: ");
		
		String input = reader.readLine();
		
		
//		if (input.equals("1")) {
//			System.out.println("700원입니다.");
//			
//		} else if (input.equals("2")) {
//			System.out.println("500원입니다.");
//			
//		} else if (input.equals("3")) {
//		System.out.println("200원입니다.");
//		
//		} else {
//			System.out.println("선택하신 음료는 없는 음료입니다.");
//		}
		
		if (input.equals("1") || input.equals("2")) {
			System.out.println("700원입니다.");

		} else if (input.equals("3")) {
		System.out.println("200원입니다.");

		} else {
			System.out.println("선택하신 음료는 없는 음료입니다.");
		}
		
		
//		switch (input) {
//			case "1":
//				System.out.println("700원입니다.");
//				break;
//			case "2":
//				System.out.println("500원입니다.");
//				break;
//			case "3":
//				System.out.println("200원입니다.");
//				break;
//			default:
//				System.out.println("음료 없음");
//				break;
//		}
		
		switch (input) {
		case "1":
		case "2":
			System.out.println("700원입니다.");
			break;
		case "3":
			System.out.println("200원입니다.");
			break;
		default:
			System.out.println("음료 없음");
			break;
		}
	}

	
	private static void m1() {
		
		// 요구사항: 숫자를 1개 입력 받아서 한글로 출력하시오
		// 1 -> "하나", 2 -> "둘"
		
		int num = 1;
		
		if (num == 1) {
			System.out.println("하나");
		} else if (num == 2) {
			System.out.println("둘");
		} else if (num == 3) {
		System.out.println("셋");
		}
		
		
		switch (num) {
			case 1:
				System.out.println("하나");
				break;
			case 2:
				System.out.println("둘");
				break;
			case 3:
				System.out.println("셋");
				break;
		}
		
	} // m1
	
}
