package com.test.java;

public class Q018 {
	public static void main(String[] args) {
		
		// 인자로 받은 숫자들 중 양수의 갯수를 반환하는 메소드를 선언하시오.
		// 양수 : 숫자 변수 > 0
		
		int count;
		
		count = positive(10);
		count = positive(10, 20);
		count = positive(10, 20, -30);
		count = positive(10, 20, -30, 40);
		count = positive(10, 20, -30, 40, 50);
		
	}

	
	private static int positive(int a) {
		
		int count = (a > 0) ? 1 : 0;
		
		System.out.printf("양수: %d개\n", count);
		return count;
	}
	

	private static int positive(int a, int b) {
		
		int count = (a > 0) ? 1 : 0;
		count = b > 0 ? ++count : count; 
		// *** b가 양수(>0)일 때, 갯수에 1을 더함 (양수가 아니면 그대로)
		
		System.out.printf("양수: %d개\n", count);
		return count;
	}
	
	
	private static int positive(int a, int b, int c) {
		
		int count = (a > 0) ? 1 : 0;
		count = b > 0 ? ++count : count;
		count = c > 0 ? ++count : count;
		
		System.out.printf("양수: %d개\n", count);
		return count;
	}
	
	
	private static int positive(int a, int b, int c, int d) {
		
		int count = (a > 0) ? 1 : 0;
		count = b > 0 ? ++count : count;
		count = c > 0 ? ++count : count;
		count = d > 0 ? ++count : count;
		
		System.out.printf("양수: %d개\n", count);
		return count;
	}

	
	private static int positive(int a, int b, int c, int d, int e) {
		
		int count = (a > 0) ? 1 : 0;
		count = b > 0 ? ++count : count;
		count = c > 0 ? ++count : count;
		count = d > 0 ? ++count : count;
		count = e > 0 ? ++count : count;
		
		System.out.printf("양수: %d개\n", count);
		return count;
	}

}
