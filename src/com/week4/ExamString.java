package com.week4;

public class ExamString {
	
	public String preChar(String s) {
		return s.substring(0, 1).toUpperCase()+s.substring(1);
	}
	
	public int charSu(String s, char ch) {
		int count = 0;
		char[] search = s.toCharArray();
		for(int i = 0; i < search.length; i++) {
			if(search[i] == ch) {
				count++;
			}
		}return count;
	}
}
