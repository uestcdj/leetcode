package _20180331.ReverseString;

public class Solution {
    public String reverseString(String s) {
    	char[] cs = s.toCharArray();
    	char tmp;
    	int l = cs.length;
    	for(int i = 0; i < l / 2; i++) {
    		tmp = cs[i];
    		cs[i] = cs[l - 1 -i];
    		cs[l - 1 - i] = tmp;
    	}
        return String.valueOf(cs);
    }
}
