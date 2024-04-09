class Queue_LL {
	class Node {
		int data;
		Node next;
		public Node(int key){
			data = key;
			next = null;
		}
	}
	Node head = null;
	Node tail = null;
//--------------------------------------------
	void enqueue(int item){
		Node newNode= new Node(item);
		tail = head;
		if(head == null){
			newNode.next = head;
			head = newNode;
		}
		else{
			while(tail.next != null){
				tail = tail.next;
			}
		newNode.next = null;
		tail.next = newNode;
		}
	}
//-----------------------------------------------
	void dequeue(){
		if(head == null){
			System.out.println("List is empty");
			return;
		}
		else{
			head = head.next;
			System.out.println("Deleted");
		}
		
	}
	

//--------------------------------------------
void display(){
		tail = head;
		if(head == null){
			System.out.println("List is empty");
			return;
		}
		else{
			System.out.println("Currently all the nodes in the list");
			while(tail != null){
				System.out.println(tail.data+" ");
				tail = tail.next;
			}
		}
	}
//------------------------------------------------
	public static void main(String[] args){
		Queue_LL q = new Queue_LL();
		q.enqueue(10);
		q.enqueue(20);
		q.dequeue();
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		q.dequeue();
		q.display();
	}
}

