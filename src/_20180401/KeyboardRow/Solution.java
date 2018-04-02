package _20180401.KeyboardRow;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;


public class Solution {
	
	public static Set<Character> fir = new HashSet<Character>();
	public static Set<Character> sec = new HashSet<Character>();
	public static Set<Character> thi = new HashSet<Character>();
	static {
		fir.add('q');
		fir.add('w');
		fir.add('e');
		fir.add('r');
		fir.add('t');
		fir.add('y');
		fir.add('u');
		fir.add('i');
		fir.add('o');
		fir.add('p');
		fir.add('Q');
		fir.add('W');
		fir.add('E');
		fir.add('R');
		fir.add('T');
		fir.add('Y');
		fir.add('U');
		fir.add('I');
		fir.add('O');
		fir.add('P');
		sec.add('a');
		sec.add('s');
		sec.add('d');
		sec.add('f');
		sec.add('g');
		sec.add('h');
		sec.add('j');
		sec.add('k');
		sec.add('l');
		sec.add('A');
		sec.add('S');
		sec.add('D');
		sec.add('F');
		sec.add('G');
		sec.add('H');
		sec.add('J');
		sec.add('K');
		sec.add('L');
		thi.add('z');
		thi.add('x');
		thi.add('c');
		thi.add('v');
		thi.add('b');
		thi.add('n');
		thi.add('m');
		thi.add('Z');
		thi.add('X');
		thi.add('C');
		thi.add('V');
		thi.add('B');
		thi.add('N');
		thi.add('M');
	}

	public String[] findWords(String[] words) {
		List<String> list = new LinkedList<String>();
		for(String s : words) {
			char[] cs = s.toCharArray();
			if(fir.contains(cs[0])) {
				int i = 1;
				for( ; i < cs.length ; i++) {
					if(!fir.contains(cs[i])) {
						break;
					}
				}
				if(i == cs.length) {
					list.add(s);
				}
			}else if(sec.contains(cs[0])) {
				int i = 1;
				for( ; i < cs.length ; i++) {
					if(!sec.contains(cs[i])) {
						break;
					}
				}
				if(i == cs.length) {
					list.add(s);
				}
			}else if(thi.contains(cs[0])) {
				int i = 1;
				for( ; i < cs.length ; i++) {
					if(!thi.contains(cs[i])) {
						break;
					}
				}
				if(i == cs.length) {
					list.add(s);
				}
			}
		}
		String[] s = new String[list.size()];
		int i = 0;
		for(String a : list) {
			s[i++] = a;
		}
		return s;
    }
}
