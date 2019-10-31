package keywordTyping;

import java.util.Random;

public class Play {
	
	private Random r = new Random();
	private KeywordList kl = new KeywordList();
	int klLen = kl.getKeywordList().length;
	
//	퀴즈배열의 랜덤인덱스 리턴
	public int getNumber() {
		return r.nextInt(klLen);
	}
}
