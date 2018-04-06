package _20180407.FizzBuzz;

import java.util.LinkedList;
import java.util.List;

public class Solution {
	public List<String> fizzBuzz(int n) {
        List<String> result = new LinkedList<String>();
        for(int i = 1; i <= n; i++) {
        	String a = "";
        	if(i % 3 == 0) {
        		a = "Fizz";
        	}
        	if( i % 5 == 0 ) {
        		a += "Buzz";
        	}
        	result.add(a == "" ? String.valueOf(i) : a);
        }
        return result;
    }
}
