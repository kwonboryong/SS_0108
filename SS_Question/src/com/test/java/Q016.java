package com.test.java;

public class Q016 {
	public static void main(String[] args) {
		
		// 인자로 받은 숫자들의 합을 구하는 메소드를 선언하시오.
		
		sum(10);
		sum(10, 20);
		sum(10, 20, 30);		
		sum(10, 20, 30, 40);		
		sum(10, 20, 30, 40, 50);		
		
	}

	
	private static void sum(int i) {
		System.out.printf("%d = %d\n", i, i);
	}

	private static void sum(int i, int j) {
		int q = i + j;
		System.out.printf("%d + %d = %d\n", i, j, q);
	}

	private static void sum(int i, int j, int a) {
		int q = i + j + a;
		System.out.printf("%d + %d + %d = %d\n", i, j, a, q);		
	}
	
	private static void sum(int i, int j, int a, int b) {
		int q = i + j + a + b;
		System.out.printf("%d + %d + %d + %d = %d\n", i, j, a, b, q);		
	}
	
	private static void sum(int i, int j, int a, int b, int c) {
		int q = i + j + a + b + c;
		System.out.printf("%d + %d + %d + %d + %d = %d\n", i, j, a, b, c, q);	
	}
	
}
