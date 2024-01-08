package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex25_while {
	public static void main(String[] args) throws IOException {
		
		/* while, do while문
		   - if문과 똑같음. -> 그러나 while문은 반복문
		   - 조건이 false가 될 때까지 반복
		   - while (조건식) {
		        구현부;
		     }
		   
		 */
		
		
		// m1();
		// m2();
		// m3();
		m4();
		
		
		
		
		
	}

	private static void m4() {
		// do while 
		// 1 ~ 10 출력
		
		int n = 11;
		
		while (n <= 10) {
			System.out.println(n);
			n++;
		}
		
		
		int m = 11;
		
		do {
			System.out.println(m);
			m++;
		} while (m <= 10);		
		
		
		
		
	}

	private static void m3() throws IOException {
		// 자판기
		// - 메뉴 출력 -> 음료 선택 -> 결과 출력 ==> 반복시키기
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		boolean loop = true; // 확실하게 특정 while문을 탈출할 수 있는 방법
		String sel = "";
		
		
		while (loop) {
			System.out.println("===================");
			System.out.println("  자판기");
			System.out.println("===================");
			System.out.println("1. 콜라");
			System.out.println("2. 사이다");
			System.out.println("3. 박카스");
			System.out.println("4. 종료");
			System.out.println("-------------------");
			
			System.out.print("선택: ");
			sel = reader.readLine();
			
			
			if (sel.equals("1")) {
				System.out.println("700원입니다.");
				pause(reader);
			} else if (sel.equals("2")) {
				System.out.println("600원입니다.");
				pause(reader);
			} else if (sel.equals("3")) {
				System.out.println("500원입니다.");
				pause(reader);
			} else { // 종료: while문 탈출
				break;
				
//				while () {
//					loop = false; // 확실하게 특정 while문을 탈출할 수 있는 방법
//				}
			}
			
		} // while문
		
		System.out.println("자판기 종료");
		
	} // m3 
	

	private static void pause(BufferedReader reader) throws IOException {
		System.out.println("계속 하려면 엔터를 입력하세요.");
		reader.readLine(); // 일시정지: 엔터를 치면 이 블럭이 풀림 
	}

	
	private static void m2() {
		// 1 ~ 100까지 누적하기
		// for문
		int sum = 0;
		
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		
		System.out.println(sum);
		
		// while문
		sum = 0;
		
		int num = 1; // 초기식
		
		while (num <= 100) {
			sum += num;
			num++;
		}

		System.out.println(sum);
		
	}

	
	private static void m1() {
		// 요구사항: 1 ~ 10까지 출력하시오
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);	
		}
		System.out.println();
		
		
		int num = 1; // 초기식
		
		while (num <= 10) { // 조건식
			System.out.println(num);
			num++; // 증감식
		}
		
		
	}
	

}
