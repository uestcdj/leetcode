package _201808._12.Contest97;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Problem1 {
	
	public static String[] uncommonFromSentences(String A, String B) {
        String[] aArray = A.split(" ");
        String[] bArray = B.split(" ");
        Set<String> as = new HashSet<String>();
        Set<String> bs = new HashSet<String>();
        Set<String> tmp = new HashSet<String>();
        for(String S: aArray) {
        	if(!as.contains(S)) {
        		as.add(S);
        	}else {
        		tmp.add(S);
        	}
        }
        for(String S: bArray) {
        	if(!bs.contains(S)) {
        		bs.add(S);
        	}else {
        		tmp.add(S);
        	}
        }
        for(String S : bs) {
        	if(as.contains(S)) {
        		as.remove(S);
        	}else {
        		as.add(S);
        	}
        }
        for(String S : tmp) {
        	if(as.contains(S)) {
        		as.remove(S);
        	}
        }
        String[] res = new String[as.size()];
        Iterator<String> i = as.iterator();
        int j = 0;
        while(i.hasNext()) {
        	res[j++] = i.next();
        }
        return res;
    }

	public static void main(String[] args) {
		uncommonFromSentences("this apple is sweet", "this apple is sour");
//		uncommonFromSentences("apple apple", "banana");
	}

}
