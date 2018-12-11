package com.kh;

public class ExamString {
	// 문자열을 넘겨받아, 첫글자를 대문자로 바꾸는 메서드 작성
	public String preChar(String s) {
		return s.substring(0, 1).toUpperCase()+s.substring(1); // 첫글자만 대문자로 변환 후 리턴
		//* if(Character.isLowerCase(s.charAt(0)){} 첫문자가 영문자인지 확인해야함.
	}
	// 문자열에서 찾는 문자가 몇개 포함되어 있는지 반환하는 메서드 작성
	public int charSu(String s, char ch) {
		int count = 0; // 포함 문자 합 초기화
		char[] sar = s.toCharArray(); // 문자열 char형 배열에 저장
		for(int i = 0; i < sar.length; i++) {
			if(sar[i] == ch) count++; // 각 배열을 돌면서 ch와 같을 경우 count 증가
		}
		return count; // 반환
	}
	
}
