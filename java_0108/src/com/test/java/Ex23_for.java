package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex23_for {
	public static void main(String[] args) throws IOException {
		
		/* 반복문 - for문
		  - 특정 코드를 원하는 횟수만큼 반복
		  - 생산성 + 유지보수성 향상
		  - for (초기식;, 조건식;, 증감식) {
		     구현부;
		    }
		 */
		// m1();
		// m2();
		// m3();
		// m4();
		// m5();
		// m6();
		// m7();
		// m8();
		// m9();
		// m10();
		// m11();
		// m12();
		m13();
		
		
	}
	

	private static void m13() throws NumberFormatException, IOException {
		// 요구사항: 숫자 5개 입력(1 ~ 10 사이) -> 가장 큰 수는?
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int max = 1; // 입력 받을 숫자 중 가장 작은 수로 초기화 -> 최댓값이 된다.
		int min = 10; // 입력 받을 숫자 중 가장 큰 수로 초기화 -> 최솟값이 된다.
		
		
		for (int i = 0; i < 5; i++) {
			
			System.out.print("숫자: ");
			int num = Integer.parseInt(reader.readLine());
			
			if (num > max) {
				max = num; 
				// 입력한 숫자 > 가장 작은 수 => 입력한 숫자를 가장 작은 수에 대입
				// 입력한 숫자 < 가장 작은 수 => 실행 X (제자리임)
			} 
			
			if (num < min) { // 최솟값
				min = num;
			} 
			
		}

		System.out.println("max: " + max);
		System.out.println("min: " + min);
	}


	private static void m12() {
		// 문제 39: 1 + 2 + 3 + 4
		
		int sum = 0;
		for (int i = 1; i <= 3; i++) {
			System.out.print(i + " + ");
			sum += i;
		}
		System.out.print("\b\b=" + sum); // 정석인데 이클립스엔 적용 안됨
		
		
		
	}


	private static void m11() {
		/* 난수
		  - 임의의 수
		  
		  만드는 방법
		  1. Math 클래스: 수학 기능 제공 (PI...)
		  2. Random 클래스
		  
		  
		 */
		
		System.out.println(3.14);
		System.out.println(Math.PI);
		
		// 0이상 ~ 1미만의 랜덤한 수 출력
		// System.out.println(Math.random());
		
		
		for (int i = 0; i < 10; i++) {
		// 가공
		// 1. 10을 곱하기 (* 10) 
		// 2. int형으로 변환 (int)(Math.random())
			// 0 ~ 9
			System.out.println((int)(Math.random() * 10));
		}
		
		
		
		// 주사위 (1 ~ 6)
		System.out.println((int)(Math.random() * 6) + 1); // 0에서 6의 전(5)까지의 난수 출력 + 1
		
		// 5 ~ 8
		System.out.println((int)(Math.random() * 4) + 5); // 0에서 5의 전(4)까지의 난수 출력 + 5
		
		
		
		
		
	}


	private static void m10() {
		
		// 학교에 선생님이 학생(30명)을 상담한다.
		
		for (int i = 1; i <= 30; i++) {
			
//			if (i >= 16) { // 학생 15명까지만 상담
//				break;
//			}
			
			if (i == 10) { // 10번 학생은 결석 (상담 X)
				continue;	
			}
			
			System.out.println(i + "번 학생 상담 중...");
			
		}
		
		
		
		
		
		
	}


	private static void m9() {

		// break;: 현재 제어문을 탈출하라는 뜻
		for (int i = 1; i <= 10; i++) {
			
			if (i == 5) {
			break; // for문에 속한 break;
			}
			
			System.out.println(i); 
		}
		System.out.println();
		
		
		// continue;: 하던 일을 멈추고 맨 위로 올라가라는 뜻
		for (int i = 1; i <= 10; i++) {
			
			if (i == 5) { // i가 5일 때, 위의 for문으로 돌아가라 => 5는 출력 X 
				continue;
			}
			
			System.out.println(i); 
		}
		
		
		
		
	}


	private static void m8() throws NumberFormatException, IOException {
		/* 예외적인 상황
		무한 루프 (Infinite Loop)
		1. 사용자의 실수
		2. 사용자의 의도 (일부러) */
		
		// 21억 회전
//		for (int i = 0; i < 10; i--) { 
//			System.out.println("무한 루프");
//		}
//		
//		// 무한 루프
//		for (int i = 0; true; i++) { 
//			System.out.println("무한 루프");
//		}
		
		
		/* 회전 수를 모를 때  ⇒ 무한루프 사용
		 사용자가 숫자 입력의 합을 구하기 (입력 횟수 모름)
		*/
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int sum = 0;
		
		for(;;) {
			System.out.print("숫자: ");
			int num = Integer.parseInt(reader.readLine());

			if (num == 0 ) { // 0을 입력하면 종료
				break;
			}
			
			sum += num;
		}
	}


	private static void m7() throws NumberFormatException, IOException {
		// 요구사항: 구구단 호출하기
		/* 5단
		  5 * 1 = 5
		  5 * 2 = 10
		  5 * 3 = 15  */
		
//		for (int i = 1; i <= 9; i++) {
//			System.out.printf("5 * %d = %2d\n", i, 5 * i);
//		}
		
		
		// 요구사항: 사용자가 원하는 단을 출력

		 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		 
		 System.out.print("단 입력: ");
		 int dan = Integer.parseInt(reader.readLine());
		
		
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %2d\n", dan, i, dan * i);
		}
	}


	private static void m6() throws NumberFormatException, IOException {
		// 요구사항: 사용자가 입력한 숫자들의 합 (10개)


		 int sum = 0; // 누적 변수
		 
		 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		 for (int i = 1; i < 10; i++) {
			 System.out.print("숫자 입력: "); // 10번 입력받아야 하기 때문에 for문 안에 위치
			 int num = Integer.parseInt(reader.readLine());
			 sum += i;
		 }
		 
		 System.out.println(sum);
	}


	private static void m5() throws IOException {
		// 요구사항: 1부터 사용자가 입력한 숫자까지의 합
		
		 int sum = 0; // 누적 변수
		 
		 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		 
		 System.out.print("숫자 입력: ");
		 int num = Integer.parseInt(reader.readLine());
		
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		
		System.out.println(sum);
	}


	private static void m4() {
		// 1 ~ 10까지의 합 (누적 연산)
		// 누적 변수 필요 (0으로 초기화)
		int sum = 0;
		
		// sum = 1 + 2 + 3 + 4 ...
		
		for (int i = 1; i < 11; i++) {
			sum += i; // (sum = sum + i)
		  /*      1회(i=2): 0 = 0 + 1 => sum = 1
		   *           2회: 1 = 1(sum) + 2 => sum = 3
		   *           3회: 3 = 3 + 3 => sum = 6
		   */
		}
	}


	private static void m3() {
		// 반복문 -> 루프 변수가 중요
		// 요구사항: 숫자 1 ~ 10까지 출력
		
		int num = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.println(num);
			num++;
		}
		
		for (int i = 0; i < 11; i++) {
			System.out.println(i);
		}

		// 홀수만 출력
		for (int i = 1; i < 11; i+=2) {
			System.out.println(i);
		}
		
		// 짝수만 출력
		for (int i = 2; i < 11; i+=2) {
			System.out.println(i);
		}
		
		// 1 ~ 100사이의 7의 배수 출력
		for (int i = 7; i < 101; i+=7) {
			System.out.println(i);
		}
		
		
	}

	
	private static void m2() {
		/* 반복문 => 회전수 제어가 중요 */
		
		// 1: 루프 변수
		for (int i = 1; i <= 5; i++) {
			System.out.println("실행문");
		}
		System.out.println();

		for (int i = 10; i >= 6; i--) {
			System.out.println("실행문");
		}
		System.out.println();
		
		for (int i = 1; i <= 21; i+=5) {
			System.out.println("실행문");
		}
		System.out.println();
		
		
		// 가장 보편적인 형태
		for (int i = 0; i < 5; i++) {
			System.out.println("실행문");
		}
	}
	

	private static void m1() {
		// 요구사항: "안녕하세요" -> 5회 반복
		
		// 실행 순서
		// 1. 초기식: int i = 1;
		// 2. 조건식: i <= 5;
		// 3. 구현부: System.out.println("안녕하세요.");
		// 4. 증감식: i++
		for (int i = 1; i <= 5; i++) {
			System.out.println("안녕하세요.");
		}
	}
}
