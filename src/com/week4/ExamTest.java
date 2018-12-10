package com.week4;

import java.util.Scanner;

public class ExamTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ExamString es = new ExamString();
		System.out.print("영문자 입력 : ");
		System.out.println(es.preChar(scanner.nextLine()));
		
		System.out.print("문자열 입력 : ");
		String s = scanner.next();
		System.out.print("문자 입력 : ");
		char ch = scanner.next().charAt(0);
		System.out.println(es.charSu(s, ch)+"개");
	}

}
