package com.week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

import dcom.week4.Employee;

public class TestWork3 {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Employee> list = new ArrayList<Employee>();
		int mnum;
		try {
			while(true) {
				System.out.print("1. 새 사원 정보 생성\n"
						+ "2. 종료\n"
						+ "번호 입력 : ");
				mnum = Integer.parseInt(in.readLine());
				if(mnum == 1) {
					Employee emp = new Employee(); 
					System.out.print("이름을 입력하세요 : ");
					emp.setName(in.readLine());
					System.out.print("나이를 입력하세요 : ");
					emp.setAge(Integer.parseInt(in.readLine()));
					System.out.print("급여를 입력하세요 : ");
					emp.setSalary(Integer.parseInt(in.readLine()));
					System.out.print("세율을 입력하세요 : ");
					emp.setT_rate(Double.parseDouble(in.readLine()));
					emp.cal_Income(); // 세후 금액 계산
					list.add(emp); // 리스트에 추가
					System.out.println("작성이 완료 되었습니다.");
				}
				else if(mnum == 2){
					System.out.println("프로그램을 종료합니다."); break;
				}
				else 
					System.out.println("잘못된 값을 입력하셨습니다.");
			}
		} 
		catch (NumberFormatException | IOException e) {
			System.out.println("잘못된 값을 입력하셨습니다.");
		}
		Collections.sort(list);
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
	}
}
