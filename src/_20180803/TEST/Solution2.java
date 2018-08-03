package _20180803.TEST;

public class Solution2 {
	
	public int solution(int[] A) {
        int length = A.length;
        int max = 1;
        for(int i = 0; i < length; i++) {
        	boolean b  = true;
        	if(A[i] > 0) {
        		b = true;
        	}
        	if(A[i] < 0) {
        		b = false;
        	}
        	for(int j = i + 1, k = 0; j < length; j++, k++) {
        		if(b) {
        			if(A[j] <= 0) {
        				b = !b;
        			}else {
        				max = max > k ? max : k;
        			}
        		}else {
        			if(A[j] >= 0) {
        				b = !b;
        			}else {
        				max = max > k ? max : k;
        			}
        		}
        	}
        }
        return max;
    }

	public static void main(String[] args) {
		
	}

}
