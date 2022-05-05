class Reverse{
	
	Node head=null;
	static class Node{
		int data;
		Node next;
		Node prev;
		
		Node(int data){
			this.data = data;
			this.next=null;
			this.prev=null;
		}
	}
	
	void insert(int data){
		Node new_node = new Node(data);
		if(head==null){
			head=new_node;
			return;
		}
		/* Node LinkedListNode = head;
		while(LinkedListNode.next != null){
			LinkedListNode = LinkedListNode.next;
		}
		LinkedListNode.next=new_node;
		return; */
		
		new_node.next=head;
		head=new_node;
	}
	
	void display(){
		Node LinkedListNode=head;
		
		/* while(LinkedListNode.next!=null){
			LinkedListNode=LinkedListNode.next;
		}
		
		while(LinkedListNode.prev!=null){
			System.out.print(LinkedListNode.data+" ");
			LinkedListNode = LinkedListNode.prev;
		}  */
		
		while(LinkedListNode!=null){
			System.out.print(LinkedListNode.data+" ");
			LinkedListNode=LinkedListNode.next;
		}
	}
	
	public static void main(String args[]){
		Reverse r1=new Reverse();
		r1.insert(1);
		r1.insert(2);
		r1.insert(3);
		r1.insert(4);
		r1.insert(5);
		r1.display();
		System.out.println(" ");
		Reverse r2=new Reverse();
		r2.insert(3);
		r2.insert(4);
		r2.insert(2);
		r2.insert(5);
		r2.display();
	}
}