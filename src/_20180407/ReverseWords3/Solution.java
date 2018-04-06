package _20180407.ReverseWords3;

public class Solution {
	 public String reverseWords(String s) {
	 	if(s == "") {
	 		return "";
	 	}
        String[] array = s.split(" ");
        String result = "";
        for(int i = 0; i < array.length; i++) {
        	char[] cs = array[i].toCharArray();
        	int length = cs.length;
        	for(int j = length - 1; j >= 0; j--) {
        		result += cs[j] ;
        	}
        	result += " ";
        }
        return result.substring(0, result.length() - 2);
    }
}
