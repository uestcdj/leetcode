package _20180804.baidustar;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

 class Solution {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cs = scan.nextInt();
		List<int[]> r = new LinkedList<int[]>(); 
		for(int i = 0; i < cs; i++) {
			int n = scan.nextInt();
			int q = scan.nextInt();
			String A = scan.next();
			char[] C = A.toCharArray();
			int input[] = new int[q * 2];
			int result[] = new int[q];
			int k = 0;
			for(int j = 0; j < q; j++) {
				input[k++] = scan.nextInt() - 1;
				input[k++] = scan.nextInt() - 1;
			}
			k = 0;
			int m = 0;
			for(int j = 0; j < q; j++) {
				int start = input[k++];
				int end = input[k++];
				if(start == end) {
					result[m++] = 1;
					continue;
				}
				int min = 91;
				int many = 1;
				while(start <= end) {
					if(C[start] < min) {
						many = 1;
						min = C[start];
					}else if(C[start] == min) {
						many++;
					}
					start++;
				}
				result[m++] = many;
			}
			r.add(result);
		};
		Iterator<int[]> i = r.iterator();
		int j = 1;
		while(i.hasNext()) {
			int[] res = i.next();
			System.out.println("Case #" + j + ":");
			for(int m : res) {
				System.out.println(m);
			}
			j++;
		}
	}

}
