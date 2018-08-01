package _20180801.ShortestDistancetoACharacter;

import java.util.Vector;

public class Solution {

	public static int[] shortestToChar(String S, char C) {
		int l = S.length();
		int[] r = new int[l];
		java.util.Vector<Integer> v = new java.util.Vector<Integer>();
		char[] cs = S.toCharArray();
		for(int i = 0; i < l; i++) {
			if(cs[i] == C) {
				v.add(i);
			}
		}
		for(int i = 0; i < l; i++) {
			if(v.contains(Integer.valueOf(i))) {
				continue;
			}
			r[i] = min(i, v);
		}
		return r;
	}
	private static int min(int a, Vector<Integer> v) {
		if(a < v.firstElement()) {
			return v.firstElement() - a;
		}
		for(int i = 0; i < v.size() - 1; i++) {
			int pre = v.get(i);
			int nex = v.get(i + 1);
			if(a > pre && a < nex) {
				return a - pre > nex - a ? nex - a : a - pre; 
			}
		}
		return a - v.lastElement();
	}
	//	public static int[] shortestToChar(String S, char C) {
//		int l = S.length();
//		int[] result = new int[l];
//		char[] cs = S.toCharArray();
//		for(int i = 0; i < S.length(); i++) {
//			if(cs[i] == C) {
//				result[i] = 0;
//				continue;
//			}
//			int j = 1;
//			while(i - j >= 0) {
//				if(cs[i - j] == C) {
//					break;
//				}
//				j++;
//			}
//			if(i - j < 0) {
//				j = 10000;
//			}
//			int k = 1;
//			while(i + k < l) {
//				if(cs[i + k] == C) {
//					break;
//				}
//				k++;
//			}
//			if(i + k >= l) {
//				k = 10000;
//			}
//			result[i] = j < k ? j : k;
//		}
//		return result;
//    }
	public static void main(String[] args) {
		int[] A = shortestToChar("aaba", 'b');
		System.out.println(A);
	}

}
