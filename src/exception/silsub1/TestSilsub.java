package exception.silsub1;

import java.util.Scanner;

public class TestSilsub {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		CharacterProcess cp = new CharacterProcess();
		System.out.print("문자열 입력 : ");
		String org = scanner.nextLine();
//		CharCheckException cce = new CharCheckException(org);
		try {
			System.out.println(cp.countAlpha(org)+"개");
		}catch(CharCheckException e){
			System.out.println("공백 문자는 사용할 수 없습니다.");
		}
	}

}
