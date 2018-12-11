package exception.silsub2;

import java.util.Scanner;

public class TestSilsub {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);		
		System.out.print("첫번째 수 입력 : ");
		int first = scanner.nextInt();
		System.out.print("두번째 수 입력 : ");
		int second = scanner.nextInt();
		if((first > 0 && first <= 100) || (second > 0 && second <= 100)) {
			try {
				throw new NumberRangeException();
			} catch (NumberRangeException e) {
				System.out.println("1~100 사이의 정수만 사용 가능합니다.");
				return;
			}
		}
		NumberProcess np = new NumberProcess();
		System.out.println((np.checkDouble(first, second))? "배수입니다" : "배수가 아닙니다");
	}
}
