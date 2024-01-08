package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q036 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("시작 숫자: ");
		int start = Integer.parseInt(reader.readLine());
		
		System.out.print("종료 숫자: ");
		int end = Integer.parseInt(reader.readLine());
		
		System.out.print("증감치: ");
		int sum = Integer.parseInt(reader.readLine());
		
		
		for (int i = start; i <= end; i += sum) {
			System.out.println(i);
		}
		
	}

}
