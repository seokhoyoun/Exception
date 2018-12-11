package com.kh;

import java.util.StringTokenizer;

public class TestWork2 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		String s = "J a v a  P r o g r a m ";
		System.out.println(s); // 토큰 처리전 글자 출력
		System.out.println(s.length()); // 처리 전 글자 갯수 출력
		StringTokenizer st = new StringTokenizer(s," "); // 토큰 처리
		while(st.hasMoreTokens()) {
			sb.append(st.nextToken()); // StringBuilder에 토큰 처리 후 문자 받아 기록
		}
		char[] c_ar =  sb.toString().toCharArray(); // char형 배열에 저장
		for(int i = 0; i < c_ar.length; i++) {
			System.out.print(c_ar[i]); // 출력
		}
		System.out.println();
		System.out.println(String.valueOf(c_ar).toUpperCase()); // 다시 String형으로 변형
		
	}
}
