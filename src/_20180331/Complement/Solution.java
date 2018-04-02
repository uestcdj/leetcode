package _20180331.Complement;

public class Solution {
	public int findComplement(int num) {
		String a = Integer.toBinaryString(num);
		char[] cs = a.toCharArray();
		int sum = 0;
		int n = 1;
		for(int i = cs.length - 1; i >= 0; i--) {
			sum += cs[i] == '1' ? 0 : n;
			n *= 2;
		}
		return sum;
    }
}
