package exception.silsub2;

public class NumberProcess {
	public NumberProcess() {
		
	}
	//임의의 정수 두개를 전달받아, 첫번째 수가 두번째수의 배수인지 확인하고 배수가 맞으면 true를 리턴하고, 아니면 false를 리턴함
	public boolean checkDouble(int a, int b) {
		return (b%a == 0)? true : false;
	}
}
