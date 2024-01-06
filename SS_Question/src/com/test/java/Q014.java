package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q014 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		/* 지하철 탑승 소요 시간을 구하시오. 지나가는 역의 개수, 환승역의 횟수, 시간대를 전달 받아 총 걸리는 시간을 반환하는 메소드를 선언하시오.
		1. 라벨 출력
		2. 입력 받기
		- BufferedReader
		- readLine();
		3. 메서드 생성
		4. 메서드 호출
		5. 출력	*/

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		
		System.out.print("역의 개수: ");
		int station = Integer.parseInt(reader.readLine());
		
		System.out.print("환승역의 횟수: ");
		int change = Integer.parseInt(reader.readLine());
		
		System.out.print("시간대(1.평상시, 2.출근시, 3.퇴근시): ");
		int time = Integer.parseInt(reader.readLine());
		
		
		getTime(station, change, time);
		
	}

	
	private static int getTime(int station, int change, int time) {
		
		int time_slot = (time == 1) ? 3 : (time == 2) ? 4 : (time == 3) ? 5 : 0; // 시간대 조건
		
		int total_time = (station * 2) + (change * time_slot); // 총 소요 시간

		
		System.out.printf("총 소요 시간은 %d분입니다.", total_time);
		
		return total_time;

	}
}
