/*

	Following is the Node class already written for the Linked List

	class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;
    
    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}

*/

public class Solution {

	public static LinkedListNode<Integer> insert(LinkedListNode<Integer> head, int pos, int data){
		//Your code goes here
		if (pos == 0) {
			LinkedListNode<Integer> newNode = new LinkedListNode<>(data);
			newNode.next = head;
			head = newNode;
		} else {
			int i = 0;
			LinkedListNode<Integer> n = head;
			for (i = 0; i < pos - 1 && n != null; i++) {
				// System.out.println("At node: "+i);
				n = n.next;
			}
			// System.out.println("At node: "+i);
			if (n != null && pos > 0) {
				LinkedListNode<Integer> newNode = new LinkedListNode<>(data);
				newNode.next = n.next;
				n.next = newNode;
			}
		}

		return head;
	}
}
