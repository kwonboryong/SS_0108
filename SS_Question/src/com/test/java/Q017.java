package com.test.java;

public class Q017 {
	public static void main(String[] args) {
		
		// 인자로 받은 이름들을 직급 순으로 출력하는 메소드를 선언하시오.
		
		position("홍길동");
		position("홍길동", "유재석");
		position("홍길동", "유재석", "박명수");
		position("홍길동", "유재석", "박명수", "정형돈");
	}


	private static void position(String a) {
		System.out.printf("사원: %s\n\n", a);
	}
	
	private static void position(String a, String b) {
		System.out.printf("사원: %s\n대리: %s\n\n", a, b);
	}
	
	private static void position(String a, String b, String c) {
		System.out.printf("사원: %s\n대리: %s\n과장: %s\n\n", a, b, c);
	}
	
	private static void position(String a, String b, String c, String d) {
		System.out.printf("사원: %s\n대리: %s\n과장: %s\n부장: %s", a, b, c, d);
	}
	
}
