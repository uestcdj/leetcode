package _20180409.BaseballGame;

import java.util.Stack;

//682题You're now a baseball game point recorder.
//
//Given a list of strings, each string can be one of the 4 following types:
//
//Integer (one round's score): Directly represents the number of points you get in this round.
//"+" (one round's score): Represents that the points you get in this round are the sum of the last two valid round's points.
//"D" (one round's score): Represents that the points you get in this round are the doubled data of the last valid round's points.
//"C" (an operation, which isn't a round's score): Represents the last valid round's points you get were invalid and should be removed.
//Each round's operation is permanent and could have an impact on the round before and the round after.
//
//You need to return the sum of the points you could get in all the rounds.
public class Solution {
	 public int calPoints(String[] ops) {
		 int sum = 0;
		 int a, b;
		 Stack<Integer> s = new Stack<Integer>();
		 for(int i = 0; i < ops.length; i++) {
			 switch(ops[i]) {
			 	case "D": sum += s.peek() * 2; s.push(s.peek() * 2);
			 		break;
			 	case "C": sum -= s.pop();
		 			break;
			 	case "+": a = s.pop(); b = s.peek(); sum += a + b; s.push(a); s.push(a + b);
		 			break;
		 		default: sum += Integer.valueOf(ops[i]); s.push(Integer.valueOf(ops[i]));
			 }
		 }
		 return sum;
	 }
	 
}
