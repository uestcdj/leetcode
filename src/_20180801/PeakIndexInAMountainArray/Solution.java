package _20180801.PeakIndexInAMountainArray;

public class Solution {
	
	public static int peakIndexInMountainArray(int[] A) {
        return find(A, 0, A.length - 1);
    }
	
	private static int find (int[] A, int m, int n) {
		int mid = (m + n) / 2;
		if(mid == A.length - 1 || mid == 0) {
			return mid;
		}
		if(mid == 0) {
			return mid;
		}
		if(A[mid] < A[mid - 1]) {
			return find(A, m, mid - 1);
		}else if(A[mid] < A[mid + 1]) {
			return find(A, mid + 1, n);
		}else {
			return mid;
		}
	}

	public static void main(String[] args) {
//		int a = peakIndexInMountainArray( new int[] {0, 2, 1, 0});
//		int a = peakIndexInMountainArray( new int[] {0, 1, 0});
		int a = peakIndexInMountainArray( new int[] {1, 2, 3});
		System.out.println(a);
	}

}
