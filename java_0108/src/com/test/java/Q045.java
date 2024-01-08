package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q045 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("최대 숫자: ");
		int num = Integer.parseInt(reader.readLine());
		
		
		for (int i = 1; i <= num; i++)
			
			System.out.print(i + " ");
			
			switch (num) {
			case 3: case 6: case 9:
				System.out.print("짝");
				// continue;
			defalut:
			System.out.print(num);
			break;
		}
		
		
		
		
		
		
	}

}
