package _20180412.TrimBinarySearchTree;

public class Test {

	public static void main(String[] args) {
		Solution s = new Solution();
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(0);
		root.right = new TreeNode(2);
		s.trimBST(root, 1, 2);
	}

}
