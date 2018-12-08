package com.week4;

public class TestWork2 {
	public static void main(String[] args) {
		String a = "J a v a  P r o g r a m ";
		System.out.println(a);
		System.out.println(a.length());
		char[] ca = a.replaceAll(" ", "").toCharArray();
		String b = "";
		for(int i = 0; i < ca.length; i++) {
			System.out.println(ca[i]);
			b += ca[i];
		}
		System.out.println(b.toUpperCase());
		
	}
}
