package CODE.linkedlists;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class operations{
	Node head;
	
	void insertfirst(int data) {
		Node newNode = new Node(data);
		newNode.next = head.next;
		head = newNode;
	}
	
	void insertLast(int data) {
		if(head == null) head = new Node(data);
		
		Node curr = head;
		while(curr.next != null) {
			curr = curr.next;
		}
		curr.next = new Node(data);
	}
	
	void insertMiddle(int data) {
		if(head == null) {
			head = new Node(data);
			return;
		}
		Node fast = head , slow = head;
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		Node temp = slow.next;
		slow.next = new Node(data);
		slow.next.next = temp;
	}
	
	
	void removeNode(int data) {
		if (head == null) {
	        System.out.println("List is empty");
	        return;
	    }

	    if (head.data == data) {
	        head = head.next;
	        return;
	    }

	    Node curr = head;
	    while (curr.next != null) {
	        if (curr.next.data == data) {
	            curr.next = curr.next.next;
	            return;
	        }
	        curr = curr.next;
	    }
	}
	
	void printLitsNode() {
		if(head == null) System.out.println("List Node is empty");
		Node curr = head;
        while(curr != null) {
        	System.out.print(curr.data + " ");
        	curr = curr.next;
        }
	}
	
}

public class LinkedList {

	public static void main(String[] args) {
		operations op = new operations();
        
        op.insertLast(100);
        op.insertLast(200);
        op.insertfirst(50);
        op.insertMiddle(150);
        op.removeNode(150);
        
        op.printLitsNode();
	}

}
