package _201808._06.ProjectionAreaOf3DShapes;

public class Solution {
	
	public static int projectionArea(int[][] grid) {
        int x = grid[0].length;
        int sum = x * x;
        for(int i = 0; i < x; i++) {
        	int xMax = 0;
            int yMax = 0;
        	for(int j = 0; j < x; j++) {
        		if(grid[i][j] == 0) {
        			sum--;
        		}
        		xMax = xMax < grid[i][j] ? grid[i][j] : xMax;
        		yMax = yMax < grid[j][i] ? grid[j][i] : yMax;
        	}
        	sum += xMax + yMax;
        }
        return sum;
    }

	public static void main(String[] args) {
		int[][] A = {{1, 2}, {3, 4}};
//		int[][] A = {{1, 0}, {0, 2}};
//		int[][] A = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
//		int[][] A = {{2, 2, 2}, {2, 1, 2}, {2, 2, 2}};
		System.out.println(projectionArea(A));
	}

}
