package com.test.java;

public class Q010 {
	public static void main(String[] args) {
		
		// 숫자 1개를 전달하면 4자리로 출력하는 메소드를 선언하시오.
		
		digit(1);
		digit(12);
		digit(321);
		digit(5678);
		digit(98765);
		
	}

	
	private static void digit(int num) {
		
		int plus = Integer.parseInt("000");
		
//		String a = num < 10 ? "000" + num : num + "";
//		String b = num < 100 ? "00" + num : num + "";
//		String c = num < 1000 ? "0" + num : num + "";
		
		String a = num < 10 ? "000" + num : num < 100 ? "00" + num : num < 1000 ? "0" + num : num + "";
		
		
		System.out.println(a);
		
	}

}
