package _20180331.SelfDividingNumber;

import java.util.LinkedList;
import java.util.List;

public class Solution {
	public List<Integer> selfDividingNumbers(int left, int right) {
		if(left > right) {
			return null;
		}
        List<Integer> result = new LinkedList<Integer>();
        int a = left, b = right;
        if(b<10) {
        	for(; a <=b; a++) {
        		result.add(a);
        	}
        }else if(b < 100) {
        	for(; a < 10; a++) {
        		result.add(a);
        	}
        	for(; a <= b; a++) {
        		add100(result,a);
        	}
        }else if(b < 1000) {
        	for(; a < 10; a++) {
        		result.add(a);
        	}
        	for(; a <= 100; a++) {
        		add100(result,a);
        	}
        	for(; a <= b; a++) {
        		add1000(result,a);
        	}
        }else {
        	for(; a < 10; a++) {
        		result.add(a);
        	}
        	for(; a <= 100; a++) {
        		add100(result,a);
        	}
        	for(; a <= 1000; a++) {
        		add1000(result,a);
        	}
        	for(; a <= b; a++) {
        		add10000(result,a);
        	}
        }
        return result;
    }
	
	void add100(List<Integer> result, int a){
		if(a % 10 == 0) {
			return;
		}
		int shi = a / 10;
		int ge = a % 10;
		if(a % shi == 0 && a % ge == 0) {
			result.add(a);
		}
	}
	
	void add1000(List<Integer> result, int a) {
		int ge = a % 10;
		int shi = a / 10 % 10;
		if(ge == 0 || shi ==0) {
			return;
		}
		int bai = a / 100;
		if(a % ge == 0 && a % shi ==0 && a % bai == 0) {
			result.add(a);
		}
	}
	
	void add10000(List<Integer> result, int a) {
		int ge = a % 10;
		int shi = a / 10 % 10;
		int bai = a / 100 % 10;
		if(ge == 0 || shi ==0 || bai == 0) {
			return;
		}
		int qian = a / 1000;
		if(a % ge == 0 && a % shi ==0 && a % bai == 0 && a % qian == 0) {
			result.add(a);
		}
	}
}
