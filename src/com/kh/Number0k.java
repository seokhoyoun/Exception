package com.kh;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Number0k {
	static int count = 0; // 시도 횟수 저장용 카운트값 초기화
	public static void main(String[] args) {
		int answer = (int)(Math.random()*100)+1; // 1 ~ 100 사이의 난수 생성
		System.out.println(answer); // *****테스트용 정답 표시
		Number0k n = new Number0k(); // 객체 생성
		int mine = 0, key = 0; // 내가 입력한 값, 정보 초기화 
		while(true) {
			count++;
			try{
				mine = n.getNumber();
				if(mine < 1 || mine > 100) throw new Over100();
			}catch(InputMismatchException e ) {			
				System.out.println("문자는 입력할 수 없습니다."); count--; continue;
			}catch(Over100 e2) {
				System.out.println("1 - 100 사이의 정수만 입력 가능합니다."); count--; continue;
			}
				key = n.questionNumber(mine, answer);
				if(key == 1)
					System.out.println("정답보다 큽니다 ");
				else if(key == -1)	
					System.out.println("정답보다 작습니다 ");
				else {
					System.out.println("정답입니다.("+count+")"); break;
				}
		}
	}
	
	public int getNumber() {
		Scanner scanner = new Scanner(System.in); 
		System.out.print("정수 입력 : ");
		return scanner.nextInt();
	}
	
	public int questionNumber(int mine, int ans) {
	return (mine > ans)? 1 : (mine < ans)? -1 : 0;
	}
}
