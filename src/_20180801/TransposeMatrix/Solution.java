package _20180801.TransposeMatrix;

public class Solution {
	
	public static int[][] transpose(int[][] A) {
		int l = A.length;
		int s = A[0].length;
		int[][] result = new int[s][l];
		for(int i = 0; i < l; i++) {
			for(int j = 0; j < s; j++) {
				result[j][i] = A[i][j];
			}
		}
		return result;
    }
	
	public static void main(String[] args) {
	}
}
