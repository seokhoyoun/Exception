package exception.silsub1;

public class CharacterProcess {
	// Constructor
	public CharacterProcess() {
		
	}
	//전달된 문자열값에서 영문자가 몇개인지 카운트해서 리턴
	//단, 공백문자가 있으면, CharCheckException 발생
	public int countAlpha(String s) throws CharCheckException {
		int alpha_count = 0;
		char[] ch = s.toUpperCase().toCharArray();
		for(int i = 0; i < ch.length; i++) {
			if(ch[i] == ' ') {
				throw new CharCheckException();
			}
			if(ch[i] >= 'A' && ch[i] <= 'Z') {
				alpha_count++;
			}
		}
		return alpha_count;
	}
	
	
}
