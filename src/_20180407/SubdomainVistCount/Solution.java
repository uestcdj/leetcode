package _20180407.SubdomainVistCount;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution {
	
	public List<String> subdomainVisits(String[] cpdomains) {
		List<String> result = new LinkedList<String>();
		Map<String, Integer> fri = new HashMap<String, Integer>();
		Map<String, Integer> sec = new HashMap<String, Integer>();
		for(String s : cpdomains) {
			String[] S = s.split("\\s+");
			Integer count = Integer.valueOf(S[0]);
			String[] domain = S[1].split("\\.");
			int l = domain.length;
			String main = domain[l - 1];
			fri.put(main, fri.containsKey(main) ? fri.get(main) + count : count);
		 	if(l == 3) {
		 		result.add(s);
		 	}	 	
	 		String tmp = domain[l - 2] + "." + main;
			sec.put(tmp, sec.containsKey(tmp) ? sec.get(tmp) + count : count);
		}
		addList(fri, result);
		addList(sec, result);
        return result;
    }
	
	public List<String> addList(Map<String, Integer> map, List<String> list) {
		Set<String> keySet = map.keySet();
		for(String key : keySet) {
			int tmp = map.get(key);
			String s = tmp + " " + key;
			list.add(s);
		}
		return list;
	}
}
