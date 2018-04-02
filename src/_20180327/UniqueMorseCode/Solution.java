package _20180327.UniqueMorseCode;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	
	public static String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
	
	public int uniqueMorseRepresentations(String[] words) {
		Map<String, Integer> map = new HashMap<>();
		for(String s : words) {
			char[] chars = s.toCharArray();
			String tmp = "";
			for(char c : chars) {
				tmp += morse[c - 'a'];
			}
			if(!map.containsKey(tmp)) {
				map.put(tmp, 0);
			}
		}
		return map.size();
    }

}
