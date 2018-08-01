package _20180801.MiddleOfTheLinkedList;

public class Solution {
	
	public class ListNode{
		int val;
		ListNode next;
		ListNode(int x){
			val = x;
		}
	}
	
	public ListNode middleNode(ListNode head) {
		ListNode tmp = head;
		int i = 0;
		java.util.Vector<ListNode> v = new java.util.Vector<ListNode>();
		while(tmp != null) {
			v.add(tmp);
			i++;
			tmp = tmp.next;
		}
		return v.get(i / 2);
	}

}
