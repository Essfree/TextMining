package lda.com;
import java.util.Comparator;

import liuyang.nlp.lda.com.wordFreq;


public class Sorting implements Comparator<wordFreq> {
	public int compare(wordFreq o1, wordFreq o2) {    
		return Long.valueOf(o2.getNo()).compareTo(Long.valueOf((o1.getNo())));      
	}  
}
