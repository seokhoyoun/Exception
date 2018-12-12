package kh.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestSilsub {

	public static void main(String[] args) {
//		new TestSilsub().silsub1();
		new TestSilsub().silsub2();
	}
	
	public void silsub1() {
		Scanner scanner = new Scanner(System.in);
		CharacterProcess cp = new CharacterProcess(); // 객체 생성
		System.out.print("문자열 입력 : ");
		try {
		int reps = cp.countAlpha(scanner.nextLine()); // 키보드로 입력 및 countAlpha에 전달 값 전달
		System.out.println(reps+"개");
		} catch (CharCheckException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void silsub2() {
		int first = 0, second = 0;
		Scanner sc = new Scanner(System.in);
		NumberProcess np = new NumberProcess();
		try {
			System.out.print("첫번째 정수 입력 : ");
			first = sc.nextInt();
			System.out.print("두번째 정수 입력 : ");
			second = sc.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("문자나 기호는 입력할 수 없습니다."); return;
		}
		try {
			System.out.println(np.checkDouble(first, second)? "배수입니다" : "배수가 아닙니다");
		} catch (NumberRangeException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
