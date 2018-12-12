package make.exception;

public class Calculator {

	public Calculator() {
		
	}
	
	public int sum(int a, int b) throws MyException {
		// 두 수 모두 한 자리 정수여야한다.
		int result = 0;
		if((a>=1&&a<10)&&(b>=1&&b<10)) {
			result = a + b;
		}
		else {
			// 예외 발생 시점
			throw new MyException("한자리 정수만 가능합니다.");
		}
		return result;	}
	
	public int sub(int a, int b) {
		return a - b;
	}
	
	public int times(int a, int b) {
		return a*b;
	}
	
	public int div(int a, int b) throws MyException {
		int result = 0;
		if(b == 0)
			throw new MyException("0으로 나눌 수 없습니다.");
		else
			result = a/b;
		return result;
	}
		
}
