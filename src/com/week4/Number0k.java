package com.week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number0k {
	static int count = 0;

	public static void main(String[] args) {
		Number0k game = new Number0k();
		int ans = (int)(Math.random()*100)+1; // 정답
		try {
			while(true) {
				System.out.print("숫자 입력 : ");
				int key = game.getNumber();
				int exit = game.questionNumber(key, ans);
				if(exit == 0) 
					break;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	// 키보드 입력용 메서드
	public int getNumber() throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		return Integer.parseInt(in.readLine());
	}
	
	public int questionNumber(int i, int ans) {
		count++;
		if(i < ans) {
			System.out.println(i+" 보다 큽니다("+count+")"); return 1;
		}
		else if(i > ans) {
			System.out.println(i+" 보다 작습니다("+count+")"); return -1;
		}
		else {
			System.out.println("정답입니다.("+count+")"); return 0;
		}
	}

}
