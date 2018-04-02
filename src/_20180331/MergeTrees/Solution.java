package _20180331.MergeTrees;

public class Solution {
	
	public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
		int max = 99999999;
		if(t1 == null) {
			return t2;
		}
		if(t2 == null) {
			return t1;
		}
		Integer[] result = new Integer[max];
		TreeNode[] trees1 = new TreeNode[max];
		result[1] = t1.val + t2.val;
		trees1[1] = t1;
		for(int i = 1; i < max / 2; i++) {
			TreeNode tmp = trees1[i];
			if(tmp == null) {
				continue;
			}
			if(tmp.left != null) {
				trees1[i * 2] = tmp.left;
				result[i * 2] = result[i * 2] == null ? tmp.left.val : (result[i * 2] + tmp.left.val);
			} 
			if(tmp.right != null) {
				trees1[i * 2 + 1] = tmp.right;
				result[i * 2 + 1] = result[i * 2 + 1] == null ? tmp.right.val : (result[i * 2 + 1] + tmp.right.val);
			}
		}
		TreeNode[] trees2 = new TreeNode[max];
		trees2[1] = t2;
		for(int i = 1; i < max/2; i++) {
			TreeNode tmp = trees2[i];
			if(tmp == null) {
				continue;
			}
			if(tmp.left != null) {
				trees2[i * 2] = tmp.left;
				result[i * 2] = result[i * 2] == null ? tmp.left.val : (result[i * 2] + tmp.left.val);
			} 
			if(tmp.right != null) {
				trees2[i * 2 + 1] = tmp.right;
				result[i * 2 + 1] = result[i * 2 + 1] == null ? tmp.right.val : (result[i * 2 + 1] + tmp.right.val);
			}
		}
		TreeNode a = new TreeNode(result[1]);
		TreeNode[] trees3 = new TreeNode[max];
		trees3[1] = a;
		for(int i = 1; i < max/2; i++) {
			TreeNode tmp = trees3[i];
			if(tmp == null) {
				continue;
			}
			if(result[i * 2] != null) {
				trees3[i * 2] = tmp.left = new TreeNode(result[i * 2]);
			}
			if(result[i * 2 + 1] != null) {
				trees3[i * 2 + 1] = tmp.right = new TreeNode(result[i * 2  + 1]);
			}
		}
        return a;
    }
}
