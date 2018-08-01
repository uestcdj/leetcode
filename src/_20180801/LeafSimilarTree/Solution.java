package _20180801.LeafSimilarTree;

import java.util.ArrayDeque;
import java.util.Queue;

public class Solution {
	
	
	
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
	public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
		Queue<Integer> q1 = new ArrayDeque<Integer>(50);
		Queue<Integer> q2 = new ArrayDeque<Integer>(50);
		TreeNode t1 = root1;
		TreeNode t2 = root2;
		zxbl(t1, q1);
		zxbl(t2, q2);
		return compare(q1, q2);
	}
	
	private static boolean compare(Queue<Integer> q1, Queue<Integer> q2) {
		while(!q1.isEmpty() && !q2.isEmpty()) {
			if(q1.poll() != q2.poll()) {
				return false;
			}
		}
		return q1.isEmpty() && q2.isEmpty();
	}

	private static void zxbl(TreeNode t, Queue<Integer> q) {
		if(t.left == null && t.right == null) {
			q.add(t.val);
		}
		if(t.left !=null) {
			zxbl(t.left, q);
		}
		if(t.right != null) {
			zxbl(t.right, q);
		}
	}
	
	
//	public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
//        Queue<TreeNode> q1 = new ArrayDeque<TreeNode>(100);
//        Queue<TreeNode> q2 = new ArrayDeque<TreeNode>(100);
//        Queue<Integer> q3 = new ArrayDeque<Integer>(50);
//        TreeNode p1 = root1;
//        q1.add(p1);
//        p1 = root2;
//        q2.add(p1);
//        while(!q1.isEmpty()) {
//        	p1 = (TreeNode) q1.poll();
//        	if(p1.left == null && p1.right == null) {
//        		q3.add(p1.val);
//        		continue;
//        	}
//        	if(p1.left != null) {
//        		q1.add(p1.left);
//        	}
//        	if(p1.right != null) {
//        		q1.add(p1.right);
//        	}
//        }
//        while(!q2.isEmpty()) {
//        	p1 = (TreeNode) q2.poll();
//        	if(p1.left == null && p1.right == null) {
//        		if(q3.isEmpty() || q3.poll() != p1.val){
//        			return false;
//        		}
//        	}
//        	if(p1.left != null) {
//        		q2.add(p1.left);
//        	}
//        	if(p1.right != null) {
//        		q2.add(p1.right);
//        	}
//        }
//        return q3.isEmpty();
//        
//    }

	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(3);
		t1.left = new TreeNode(5);
		t1.right = new TreeNode(1);
		t1.left.left = new TreeNode(6);
		t1.left.right = new TreeNode(2) ;
		t1.left.right.left = new TreeNode(7);
		t1.left.right.right = new TreeNode(4);
		t1.right.left = new TreeNode(9);
		t1.right.right = new TreeNode(8);
		TreeNode t2 = new TreeNode(3);
		t2.left = new TreeNode(5);
		t2.right = new TreeNode(1);
		t2.left.left = new TreeNode(6);
		t2.left.right = new TreeNode(7);
		t2.right.left = new TreeNode(4);
		t2.right.right = new TreeNode(2);
		t2.right.right.left = new TreeNode(9);
		t2.right.right.right = new TreeNode(8);
		System.out.print(leafSimilar(t1, t2));
	}

}
