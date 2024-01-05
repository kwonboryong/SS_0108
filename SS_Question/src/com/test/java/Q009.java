package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q009 {
	public static void main(String[] args) throws IOException {
		
		// 이름을 전달하면 이름뒤에 '님'을 붙여서 반환하는 메소드를 선언하시오.
		

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("이름: ");
		String name = reader.readLine();

		
		String result = getName(name);
		System.out.printf("고객: %s\n", result);
		
	}

	public static String getName(String name) {
		
		return name + "님";
		
	}
	
}
