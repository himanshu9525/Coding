/****************************************************************

	Following is the Node class already written for the Linked List

	class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;
    
    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}

*****************************************************************/

public class Solution {
	public static LinkedListNode<Integer> deleteNode(LinkedListNode<Integer> head, int pos) {
		// Write your code here.
		if(head==null) return null;


		if (pos < 0) {
			return head;
		}

		else if (pos == 0) {
			head = head.next;
		} else {
			LinkedListNode<Integer> n = head, delNode = null;
			for (int i = 0; i < pos - 1 && n != null; i++) {
				n = n.next;
			}
			if (n != null && n.next != null) {
				if (n.next != null) {
					n.next = n.next.next;
				} else {
					n.next = null;
				}

			}
		}
		return head;
	}
}
