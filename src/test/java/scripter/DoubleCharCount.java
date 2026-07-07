package scripter;

import java.util.HashMap;
import java.util.Map;

public class DoubleCharCount {

	public static void main(String[] args) {
         String Word = "AAABBCC";
         Map<Character, Integer>doublecharCount= new HashMap<>();
         
         for (int i = 0; i < Word.length()-1; i++) {
        	 
        	 if (Word.charAt(i)==Word.charAt(i+1)) {
        		 doublecharCount.put(Word.charAt(i), doublecharCount.getOrDefault(Word.charAt(i), 0)+1);
			}
        	 
			
		}
         System.out.println("Double Character Count"+doublecharCount);
         
	}

}
