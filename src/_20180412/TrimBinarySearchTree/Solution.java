package _20180412.TrimBinarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

//Given a binary search tree and the lowest and highest boundaries as L and R, trim the tree so that all its elements lies in [L, R] (R >= L). You might need to change the root of the tree, so the result should return the new root of the trimmed binary search tree.
//
//Example 1:
//Input: 
//    1
//   / \
//  0   2
//
//  L = 1
//  R = 2
//
//Output: 
//    1
//      \
//       2


public class Solution {
	
	public TreeNode trimBST(TreeNode root, int L, int R) {
		if(L > R) {
			return null;
		}
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.offer(root);
		TreeNode result = null;
		while(!q.isEmpty()) {
			TreeNode p = q.poll();
			if(result == null && p.val >= L && p.val <= R) {
				result = p;
			}
			if(p.val >= L && p.left != null) {
				q.offer(p.left);
			}
			if(p.val <= R && p.right != null) {
				q.offer(p.right);
			}
			if(p.val < L) {
				p = p.right;
				continue;
			}
			if(p.val > R) {
				p = p.left;
			}
		}	
		return result;
    }
}
