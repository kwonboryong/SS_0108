package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q046 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String result = "";
		
		for (int i = 0; i < 10; i++) {

			System.out.print("숫자: ");
			int num = Integer.parseInt(reader.readLine());
		
			result += kor(num);
		}
		System.out.println(result);
	}
	

	private static String kor(int num) {
		if (num == 1) {
			return "일";
		} else if (num == 2) {
			return "이";
		} else if (num == 3) {
			return "삼";
		} else if (num == 4) {
			return "사";
		} else if (num == 5) {
			return "오";
		} else if (num == 6) {
			return "육";
		} else if (num == 7) {
			return "칠";
		}  else if (num == 8) {
			return "팔";
		}  else if (num == 9) {
			return "구";
		}
		return ""; 
	}

}
