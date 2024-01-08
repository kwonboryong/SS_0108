package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q043 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// 컴퓨터가 1~10 사이의 숫자 1개를 생각하면 사용자가 맞추는 프로그램을 구현하시오.
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("컴퓨터가 1~10 사이의 숫자를 1개 생각했습니다.");

		int computer = (int)(Math.random() * 10);
		System.out.println(computer);
		
			
			for (int count = 1; count < 11; count++) {
				
				System.out.print("숫자: ");
				int num = Integer.parseInt(reader.readLine());
				
				
				if (computer != num) {
					System.out.println("틀렸습니다.\n");
				} else if(computer == num) {
					System.out.printf("컴퓨터가 생각한 숫자는 %d입니다.\n", num);
					System.out.printf("정답을 맞추는데 시도한 횟수는 %d회입니다.\n\n", count);
					System.out.println("프로그램을 종료합니다.");
					break;
				} else if (count == 10) {
					System.out.printf("컴퓨터가 생각한 숫자는 %d입니다.\n", computer);
					System.out.println("모든 기회를 실패했습니다.\n");
					System.out.println("프로그램을 종료합니다.");
				}
			
			} // for
			
	}

}
