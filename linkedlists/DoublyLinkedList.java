package CODE.linkedlists;

class DoubleNode{
	DoubleNode prev;
	DoubleNode next;
	String data;
	DoubleNode(String data){
		this.data = data;
		this.next = null;
		this.prev = null;
	}
}

class media{
	DoubleNode head;
	//Insert
	void insert(String data) {
		if(head == null) {
			head = new DoubleNode(data);
			return;
		}
		DoubleNode curr = head;
		while(curr.next != null) {
			curr = curr.next;
		}
		DoubleNode newNode = new DoubleNode(data);
		
		curr.next = newNode;
		newNode.prev = curr;
	}
	
	//ADDS
	void insertSponser(String data) {
		if(head == null) {
			head = new DoubleNode(data);
			return;
		}
		DoubleNode curr = head;
		while(curr.next != null) {
			curr = curr.next;
		}
		DoubleNode newNode = new DoubleNode(data);
		
		curr.next = newNode;
		newNode.prev = curr;
	}
	
	//delete
	void delete(String data) {
		if(head == null) {
			System.out.println("List is Empty");
			return;
		}
		if(head.data.equals(data)) {
			head = head.next;
		    if (head != null) {
		        head.prev = null;
	        }
		    return;
		}
		DoubleNode curr = head;
		System.out.print("Deletion : ");
		while (curr.next != null) {
			if(curr.next.data.equals(data)) {
				System.out.println(curr.prev.data + " < - " + curr.data + " - > " + curr.next.data + " - deleted > " + curr.next.data);
				DoubleNode del = curr.next;
	            curr.next = del.next;
	            if (del.next != null) {
		            del.next.prev = curr;
		        }
	            System.out.println();
		        return;
		    }
		    curr = curr.next;
		}
		System.out.println();
	}
	
	//display
	void display() {
		System.out.println("Display posts : ");
		DoubleNode curr = head;
		curr = curr.next;
		while(curr.next != null) {
			System.out.println(curr.prev.data + " < - " + curr.data + " - > " + curr.next.data);
			curr = curr.next;
		}
		System.out.println();
		
	}
	
	void displayForword() {
		DoubleNode curr = head;
		System.out.print("Forword display posts : ");
		while(curr != null) {
			System.out.print(curr.data + " - > ");
			curr = curr.next;
		}
		System.out.println("null\n");
	}
	
	void displayBackword() {
		DoubleNode curr = head;
		System.out.print("Backword display posts : ");
		while(curr.next != null) {
			curr = curr.next;
		}
		while(curr != null) {
			System.out.print(curr.data + " - > ");
			curr = curr.prev;
		}
		System.out.println("null\n");
	}
}
public class DoublyLinkedList {
	public static void main(String[] args) {
		media media = new media();
		media.insert("Food");
		media.insert("Circket");
		media.insert("Movie");
		media.insertSponser("Adds");
		media.insert("Play");
		media.insert("Circket");
		media.insertSponser("Adds");
		media.insert("Movie");
		media.insertSponser("Adds");
		media.insert("Circket");
		media.insert("Movie");
		
		media.display();
		
		media.delete("Movie");
		
		media.display();
		
		media.displayForword();
		media.displayBackword();
	}

}
