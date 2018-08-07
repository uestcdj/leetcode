package _201808._07.IslandPerimeter;

public class Solution {

	public static int islandPerimeter(int[][] grid) {
        int x = grid[0].length;
        int y = grid.length;
        int sum = 0;
        for(int i = 0; i < x; i++) {
        	for(int j = 0; j < y; j++) {
        		if(grid[j][i] == 0) {	
        			continue;
        		}
        		if(j == 0 || grid[j - 1][i] == 0) {
        			sum++;
        		}
        		if(j == y - 1 || grid[j + 1][i] == 0) {
        			sum++;
        		}
        		if(i == 0 || grid[j][i - 1] == 0) {
        			sum++;
        		}
        		if(i == x - 1 || grid[j][i + 1] == 0) {
        			sum++;
        		}
        	}
        }
        return sum;
    }
	
	public static void main(String[] args) {
		int[][] A = {
				{0, 1, 0, 0},
				{1, 1, 1, 0},
				{0, 1, 0, 0},
				{1, 1, 0, 0}
		};
//		int [][] A = {{1}};
//		int [][] A = {{1, 0}};
//		int [][] A = {{1},{0}};
		System.out.println(islandPerimeter(A));

	}

}
