package com.week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number0k {

	public static void main(String[] args) {
		Number0k game = new Number0k();
		int ans = (int)(Math.random()*100)+1; // 정답
		try {
			while(game.questionNumber(game.getNumber(), ans) != 0);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	// 키보드 입력용 메서드
	public int getNumber() throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		return in.read();
	}
	
	public int questionNumber(int i, int ans) {
		if(ans > i) {
			System.out.println(i+"보다 큽니다"); return 1;
		}
		else if(ans < i) {
			System.out.println(i+"보다 작습니다"); return -1;
		}
		else {
			System.out.println("정답입니다."); return 0;
		}
	}

}
