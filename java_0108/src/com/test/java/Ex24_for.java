package com.test.java;

public class Ex24_for {
	public static void main(String[] args) {
		
		/* 중첩된 for문
		   - 단일 for문
		   - 2중 for문
		   - 3중 for문 */
		
		//m1();
		//m2();
		//m3();
		m4();
		
		
		
	}

	private static void m4() {
		// 별 찍기 (5 * 5)
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		
		for (int i = 0; i < 5; i++) {
			for (int j = i; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		
		
		
		
		
	}

	private static void m3() {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
	
				//if (i == 5) { // i가 5일 때의 10회가 없어짐 (총 90회 출력)
				//	break;
				//}
				
				if (j == 5) { // i가 0 ~ 9까지 1번 당 10회씩, 1번에 j=5가 10회 빠짐 (총 50회 출력)
					break;
				}
				
				System.out.printf("i: %d, j: %d\n", i, j);
			}
		}
		
		
		
		
	}

	private static void m2() {
		// 구구단: 2단 ~ 9단 출력
		
		int dan = 2;
		
		for (int j = 2; j < 9; j++) {
			System.out.println("==============");
			System.out.printf("     %d단\n", j);
			System.out.println("==============");
			
			for(int i = 1; i <= 9; i++) {
				System.out.printf("%d * %d = %2d\n", j, i, dan * j);
			}
			System.out.println(); // 단마다 띄어쓰기
		}
		
		
		
		
	}

	private static void m1() {
		// 단일 for문
		for (int i = 0; i < 10; i++) {
			System.out.println("i: " + i); 
		}
		
		// 2중 for문
		for (int i = 0; i < 10; i++) { // 대회전
			
			for (int j = 0; j < 10; j++) { // 소회전
				System.out.printf("i: %d j: %d\n", i, j); // 100회
				
			}
		}
		
		// 3중 for문
		for (int i = 0; i < 24; i++) { // 대회전 -> 시침
			for (int j = 0; j < 60; j++) { // 중회전 -> 분침
				for (int k = 0; k < 60; k++) { 
				System.out.printf("i: %d j: %d k: %d\n", i, j, k); // 소회전 -> 초침
				} // 총 1000회 출력
			}
		}
		
//		전교생 탐색
//		for (학년) {
//			for (반) {
//				for (번호) {
//					
//				}
//			}
//		}
		
		
		
	}

}
