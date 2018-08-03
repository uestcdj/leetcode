package _20180803.TEST;

public class Solution {
	 public static String solution(String S) {
		char[] cs = S.toCharArray();
		String result = "";
		int n = 0;
		for(int i = 0; i < cs.length; i++) {
			if(cs[i] >= '0' && cs[i] <= '9') {
				n++;
				result += cs[i];
				if(n % 3 == 0) {
					result += '-';
				}
			}
		}
		if(n % 3 == 0) {
			return result.substring(0, result.length() - 1);
		}
		if(n % 3 == 1 && S.length() > 3) {
			char[] r = result.toCharArray();
			int l = r.length;
			char tmp = r[l - 3];
			r[l - 3] = r[l - 2];
			r[l - 2] = tmp;
			return String.valueOf(r);
 		}
        return result;
    }
	 
	 public static void main(String[] a) {
		System.out.println(solution("0 - 22 1985--324"));
	 }
}
