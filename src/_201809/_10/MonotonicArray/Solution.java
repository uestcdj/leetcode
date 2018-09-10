package _201809._10.MonotonicArray;

public class Solution {

	public static void main(String[] args) {
		int[] a = {6, 5, 4, 4};
		System.out.println(isMonotonic(a));
	}
	
	public	static boolean isMonotonic(int[] A) {
        int length = A.length;
        if(length < 3) {
        	return true;
        }else {
        	Boolean result = null;
        	for(int i = 1; i < length; i++) {
        		if(A[i] == A[i - 1]) {
        			continue;
        		}
        		if(result == null) {
        			result = A[i] < A[i - 1];
        		}else if(result != A[i] < A[i - 1]) {
        			return false;
        		}
        	}
        	return true;
        }
    }

}
