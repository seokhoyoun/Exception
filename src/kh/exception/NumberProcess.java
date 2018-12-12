package kh.exception;

public class NumberProcess {
	public NumberProcess() {
		
	}
//		임의의 정수 두개를 전달받아, 첫번째 수가 두번째수의 배수인지 확인하고 배수가 맞으면 true 를 리턴하고, 아니면 false를 리턴함
//		단, 전달된 첫번째와 두번째 수가 1~100사이의 값이 아니면 NumberRangeException 발생시킴
	public boolean checkDouble(int a, int b) throws NumberRangeException {
		if(!((a > 0 && a <= 100)&&(b > 0 && b <= 100)))
			throw new NumberRangeException("1 ~ 100 사이의 숫자만 입력 가능합니다.");
		else
			return (b % a == 0)? true : false; 
		
	}
}
