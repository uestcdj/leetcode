package _20180801.ToLowerCase;

public class Solution {
	public String toLowerCase(String str) {
		char[] cA = str.toCharArray();	
		for(int i = 0; i < cA.length; i++) {
			if(cA[i] >= 'A' && cA[i] <= 'Z') {
				cA[i] += 32;
			}
		}
        return new String(cA);
    }
}
