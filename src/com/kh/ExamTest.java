package com.kh;

import java.util.Scanner;

public class ExamTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ExamString es = new ExamString();
		System.out.print("문자열 입력 : ");
		String s = scanner.next();
		System.out.println(es.preChar(s)); // 첫번째 글자 대문자 변환 메소드 실행 및 출력
		System.out.print("문자 입력 : ");
		char ch = scanner.next().charAt(0);
		System.out.println(es.charSu(s, ch)+"개"); // 문자열 내 문자 갯수 카운트 메소드 실행 및 출력
	}

}
