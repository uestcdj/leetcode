package _20180802.SingleNumber;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution {
	
//	public static int singleNumber(int[] nums) {
//		Set<Integer> s1 = new HashSet<Integer>();
//		for(int i : nums) {
//			if(s1.contains(i)) {
//				s1.remove(i);
//			}else {
//				s1.add(i);
//			}
//		}
//		return s1.iterator().next();
//    }
	
//	public static int singleNumber(int[] nums) {
//		int a = 0;
//		for(int i : nums) {
//			a ^= i;
//		}
//		return a;
//	}
	
	public static int singleNumber(int[] nums) {
		int sum = 0;
		int sum2 = 0;
		Set<Integer> s1 = new HashSet<Integer>();
		for(int i : nums) {
			s1.add(i);
			sum2 += i;
		}
		Iterator<Integer> I = s1.iterator();
		while(I.hasNext()) {
			sum += I.next();
		}
		return sum * 2 - sum2;
	}

	public static void main(String[] args) {
		int A[] = {2, 2, 1};
//		int A[] = {4, 1, 2, 1, 2};
		System.out.println(singleNumber(A));
	}

}
