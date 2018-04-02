package _20180327.NumberOfLinesToWriteString;

public class Solution {
	public int[] numberOfLines(int[] widths, String S) {
        int[] result = new int[2];
        char[] chars = S.toCharArray();
        int sum = 0;
        int hang = 1;
        for(char c : chars){
        	sum += widths[c - 'a'];
        	if(sum > 100) {
        		hang++;
        		sum = widths[c - 'a'];
        	}
        }
        result[0] = hang;
        result[1] = sum;
        return result;
    }
}
