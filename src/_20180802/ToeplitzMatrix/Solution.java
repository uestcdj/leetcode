package _20180802.ToeplitzMatrix;

public class Solution {
	
	public static boolean isToeplitzMatrix(int[][] matrix) {
		int x = matrix[0].length;
		int y = matrix.length;
		if(y == 1) {
			return true;
		}
		for(int i = 0; i < x - 1; i ++) {
			int tmp = matrix[0][i];
			int j = 1;
			while(i + j < x && j < y) {
				if(tmp != matrix[j][i + j]) {
					return false;
				}
				j++;
			}
		}
		for(int i = 1; i < y - 1; i++) {
			int tmp = matrix[i][0];
			int j = 1;
			while(j < x && i + j < y) {
				if(tmp != matrix[i + j][j]) {
					return false;
				}
				j++;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[][] A = {{11, 74, 0, 93}, {40, 11, 74, 7}};
		isToeplitzMatrix(A);
	}

}
