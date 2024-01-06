package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q033 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		/* 년도를 입력받아 해당 년도가 '평년' 인지 '윤년' 인지 출력하시오.
		   - a. 년도를 4로 나눈다. -> 떨어지면 b 검사: 떨어지지 않으면 "평년"
		   - b. 년도를 100으로 나눈다. -> 떨어지면 c 검사 : 떨어지지 않으면 "윤년"
		   - c. 년도를 400으로 나눈다. -> 떨어지면 "윤년" : 떨어지지 않으면 "평년" 
		   - '떨어진다' = 나머지(%)가 0 */
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("년도 입력: ");
		int year = Integer.parseInt(reader.readLine());
		
		
		if (year % 4 == 0) { // a
			if (year % 100 == 0) { // b
				if (year % 400 == 0) { // c
					System.out.printf("%d년은 '윤년'입니다.", year);
				}
			} else { // b
				System.out.printf("%d년은 '윤년'입니다.", year);
			}
		} else { // a
			System.out.printf("%d년은 '평년'입니다.", year);
		}
		
	}

}
