class C_Queue_LL {
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
		if(head == null){
			newNode.next = head;
			head = newNode;
			tail = newNode;
		}
		else{
			tail.next = newNode;
			tail = newNode;
		}
		tail.next = head;
	}
//-----------------------------------------------
	void dequeue(){
		if(head == null){
			System.out.println("List is empty");
			return;
		}
		else{
			head = head.next;
			tail.next = head;
			System.out.println("Deleted");
		}
		
	}
	

//--------------------------------------------
void display(){
		Node q = head;
		if(head == null){
			System.out.println("List is empty");
			return;
		}
		else{
			System.out.println("Currently all the nodes in the list");
			while(q.next != head){
				System.out.print(q.data+"->");
				q = q.next;
			}
			System.out.print(q.data);
		}
	}
//------------------------------------------------
	public static void main(String[] args){
		C_Queue_LL q = new C_Queue_LL();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		q.dequeue();
		q.display();
	}
}

