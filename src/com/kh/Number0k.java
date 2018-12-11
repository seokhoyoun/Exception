package com.kh;

import java.util.Scanner;

public class Number0k {
	public static void main(String[] args) {
		int answer = (int)(Math.random()*100)+1; // 1 ~ 100 사이의 난수 생성
		Number0k n = new Number0k(); // 객체 생성
		int mine = 0, count = 0, key = 0;
		while(true) {
			count++;
			mine = n.getNumber();
			key = n.questionNumber(mine, answer);
			if(key == 1)
				System.out.println("큽니다 -"+count);
			else if(key == -1)	
				System.out.println("작습니다 -"+count);
			else
				System.out.println("정답입니다. -"+count);
		}
	}
	
	public int getNumber() {
		Scanner scanner = new Scanner(System.in); 
		System.out.print("정수 입력 : ");
		return scanner.nextInt();
	}
	
	public int questionNumber(int mine, int ans) {
		return (mine == ans)? 0 : (mine > ans)? 1 : -1;
	}
}
