package _20180801.FlippingAnImage;

public class Solution {
	
	public static int[][] flipAndInvertImage(int[][] A) {
		int l = A.length;
		int s = A[0].length - 1;
		for(int i = 0; i < l; i++) {
			for(int j = 0; j <= s / 2; j ++) {
				int tmp = A[i][j] == 1 ? 0 : 1;
				A[i][j] = A[i][s - j] == 1 ? 0 : 1;
				A[i][s - j] = tmp;
			}
		}
        return A;
    }

	public static void main(String[] args) {
		int A[][] = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
//		int A[][] = {{1, 1, 0, 0}, {1, 0, 0, 1}, {0, 1, 1, 1}, {1, 0, 1, 0}};
		int[][] B = flipAndInvertImage(A);
		System.out.println();
	}

}
