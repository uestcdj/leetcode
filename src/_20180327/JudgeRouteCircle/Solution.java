package _20180327.JudgeRouteCircle;

public class Solution {
	public boolean judgeCircle(String moves) {
        char[] chars = moves.toCharArray();
        int x = 0, y = 0;
        for(char c : chars) {
        	switch(c) {
        	case 'R' : x++; break;
        	case 'L' : x--; break;
        	case 'U' : y++; break;
        	case 'D' : y--; break;
        	default :  break;
        	}
        }
        return x == 0 && y == 0 ? true : false;
    }
}
