package _20180804.baidustar;

import java.util.Arrays;

public class Solution2 {
	
	public static int solution(int[] A) {
		Arrays.sort(A);
        int tmp = 1;
        for(int i : A) {
        	if(i <= 0) {
        		continue;
        	}
        	if(i <= tmp) {
        		tmp = i + 1;
        	}
        }
        return tmp;
    }

	public static void main(String[] args) {
		System.out.println(solution(new int[]{1, 2, 3}));
	}

}
