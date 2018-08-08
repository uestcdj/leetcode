package _201808._08.MaximumDepthOfN_aryTree;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Solution {
	
	static class Node {
	    public int val;
	    public List<Node> children;

	    public Node() {}

	    public Node(int _val,List<Node> _children) {
	        val = _val;
	        children = _children;
	    }
	};
	
	static public int maxDepth(Node root) {
        if(root.children == null) {
        	return 1;
        }
        Node p = root;
        List<Node> list = new LinkedList<Node>();
        list.add(p);
        list.add(new Node(1,null));
        Iterator<Node> i = list.iterator();
        int high = 1;
        int sum = 1;
        while(i.hasNext()) {
        	if(i.next().children != null &&(!i.next().children.isEmpty())) {
        		list.addAll(i.next().children);
        	}
        	list.remove(0);
        	sum++;
        	if(!i.hasNext()) {
        		high++;
        		List<Node> l = list.subList(sum, list.size());
        		l.add(root);
        		i = l.iterator();
        		sum = 1;
        	}
        }
        return high;
    }

	public static void main(String[] args) {
		Node root1 = new Node(1, null);
		Node root2 = new Node(2, null);
		Node root3 = new Node(3, null);
		Node root4 = new Node(4, null);
		Node root5 = new Node(5, null);
		Node root6 = new Node(6, null);
		List<Node> l1 = new LinkedList<>();
		List<Node> l2 = new LinkedList<>();
		l1.add(root3);
		l1.add(root2);
		l1.add(root4);		
		l2.add(root5);
		l2.add(root6);
		root1.children = l1;
		root3.children = l2;
		System.out.println(maxDepth(root1));
		
	}

}
