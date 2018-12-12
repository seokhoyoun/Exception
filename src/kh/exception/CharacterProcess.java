package kh.exception;

public class CharacterProcess {
	public CharacterProcess() {
	}
	// 전달된 문자열값에서 영문자가 몇개인지 카운트해서 리턴
	public int countAlpha(String s) throws CharCheckException {
		int count = 0;
		char[] ch = s.toCharArray();
		for(int i = 0; i < ch.length; i++) {
			if(Character.isWhitespace(ch[i])) 
				throw new CharCheckException("공백 문자를 사용할 수 없습니다.");
			if(Character.isAlphabetic(ch[i])) 
				count++;
		}
		return count;
	}
	
	
}
