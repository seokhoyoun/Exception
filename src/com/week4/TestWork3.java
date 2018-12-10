package com.week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import dcom.week4.Employee;

public class TestWork3 {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Employee emp = new Employee(); 
		ArrayList<Employee> list = new ArrayList<Employee>();
			list.add(new Employee("asdf",25,333333,0.14));
			list.add(new Employee("bsdf",28,333333,0.14));
			list.add(new Employee("csdf",22,333333,0.14));
			list.add(new Employee("dsdf",33,333333,0.14));
			list.add(new Employee("esdf",55,333333,0.14));
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		try {
			System.out.print("이름을 입력하세요 : ");
			emp.setName(in.readLine());
			System.out.print("나이를 입력하세요 : ");
			emp.setAge(Integer.parseInt(in.readLine()));
			System.out.print("급여를 입력하세요 : ");
			emp.setSalary(Integer.parseInt(in.readLine()));
			System.out.print("세율을 입력하세요 : ");
			emp.setT_rate(Double.parseDouble(in.readLine()));
			
		} catch (NumberFormatException | IOException e) {
			System.out.println("잘못된 값을 입력하셨습니다.");
		}
		emp.cal_Income();
		System.out.println(emp.toString());
		
	}
}
